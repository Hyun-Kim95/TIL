package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppCtx;
import spring.ChangePasswordService;
import spring.DuplicateMemberException;
import spring.MemberInfoPrinter;
import spring.MemberListPrinter;
import spring.MemberNotFoundException;
import spring.MemberRegisterService;
import spring.RegisterRequest;
import spring.WrongIdPasswordException;

public class Main {
	private static AnnotationConfigApplicationContext ctx = null;
	public static void main(String[] args) throws IOException {
		ctx = new AnnotationConfigApplicationContext(AppCtx.class);
		
		BufferedReader reader = 
				new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("명령어를 입력하세요:");
			String command = reader.readLine();
			if(command.equalsIgnoreCase("exit")){
				System.out.println("종료합니다.");
				break;
			}
			if(command.startsWith("new ")) {
				processNewCommand(command.split(" "));
			}else if(command.startsWith("change ")) {
				processChangeCommand(command.split(" "));
			}else if(command.equals("list")) {
				processListCommand();
			}else if(command.startsWith("info ")) {
				processInfoCommand(command.split(" "));
			}else {
				printHelp();
			}
		}
		ctx.close();
	}
	private static void processNewCommand(String[] arg)
	{
		if(arg.length != 5)
		{
			printHelp();
			return;
		}
		// MemberRegisterService를 Bean 객체로 추출함
		// regSvc변수에 대입
		MemberRegisterService regSvc = 
				ctx.getBean("memberRegSvc",MemberRegisterService.class);
		//RegisterRequest 데이터 이기때문에 Bean객체를 등록을 하지 않았다.
		RegisterRequest req = new RegisterRequest();
		req.setEmail(arg[1]);
		req.setName(arg[2]);
		req.setPassword(arg[3]);
		req.setConfirmPassword(arg[4]);
		
		// 데이터를 모두 대입
		// 패스워드 일치 확인을 진행
		if(!req.isPasswordEqualToConfirmPassword())
		{
			System.out.println("암호와 확인이 일치하지 않습니다.");
			return;
		}
		// 문제가 없으면 실행
		try {
			//데이터를 담은 RegisterRequest 객체를 등록
			//MemberRegisterService에
			regSvc.regist(req);
			System.out.println("등록했습니다.\n");
		}catch(DuplicateMemberException e){
			System.out.println("이미 존재하는 이메일입니다.\n");
		}
	}
	private static void processChangeCommand(String[] arg)
	{
		if(arg.length != 4)
		{
			printHelp();
			return;
		}
		
		//Component를 사용하면 이렇게 함수 이름만 적어주면 됨
		ChangePasswordService changePwdSvc =
				ctx.getBean(ChangePasswordService.class);
		//assembler에서 ChangePasswordServise 추출해놓은
		try {
			changePwdSvc.changePassword(arg[1], arg[2], arg[3]);
			System.out.println("암호를 변경했습니다.\n");
		} catch (MemberNotFoundException e) {
			System.out.println("존재하지 않는 이메일입니다.\n");
		}catch(WrongIdPasswordException e)
		{
			System.out.println("이메일과 암호가 일치하지 않습니다.\n");
		}
	}
	private static void processListCommand() {
		MemberListPrinter listPrinter = 
				ctx.getBean("listPrinter", MemberListPrinter.class);
		// 전체 출력
		listPrinter.printAll();
	}
	private static void processInfoCommand(String[] arg)
	{
		// 문자열 배열의 갯수가 2개가 아니면 실행
		if (arg.length != 2) {
			printHelp();
			return;
		}
		MemberInfoPrinter infoPrinter = 
				ctx.getBean("infoPrinter", 
						MemberInfoPrinter.class);
		infoPrinter.printMemberInfo(arg[1]); 
	}
	private static void printHelp()
	{
		System.out.println();
		System.out.println("잘못된 명령입니다. 아래 명령어 사용법을 확인하세요.");
		System.out.println("명령어 사용법:");
		System.out.println("new 이메일 이름 암호 암호확인");
		System.out.println("change 이메일 현재비번 변경비번");
		System.out.println();
	}
}