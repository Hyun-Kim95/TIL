package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//치세요
import config.AppCtx;

import spring.ChangePasswordService;
import spring.DuplicateMemberException;
import spring.MemberInfoPrinter;
import spring.MemberListPrinter;
import spring.MemberNotFoundException;
import spring.MemberRegisterService;
import spring.RegisterRequest;
import spring.VersionPrinter;
import spring.WrongIdPasswordException;


public class MainForSpring {
	
	//치세요
	private static ApplicationContext ctx = null;
	// Main 문
	public static void main(String[] args)throws IOException
	{
		//AnnotationConfigApplicationContext 객체를 생성
		//AppCtx 설정이 등록이 된다.
		ctx = new AnnotationConfigApplicationContext(AppCtx.class);
		
		// 키보드 입력
		BufferedReader reader = 
				new BufferedReader(new InputStreamReader(System.in));
		//입력 객체생성
		while(true)
		{
			System.out.println("명령어를 입력하세요 : ");
			String command = reader.readLine();
			//command 명령어
			if(command.equalsIgnoreCase("exit"))
			{
				System.out.println("종료합니다.");
				break;
			}
			
			// 첫 단어가 new이면 실행
			if(command.startsWith("new "))
			{
				// 스프링 배열로 리턴
				processNewCommand(command.split(" "));
				continue;
			}
			else if(command.startsWith("change "))
			{
				processChangeCommand(command.split(" "));
				continue;
			}
			else if (command.equals("list")) 
			{
				processListCommand();
				continue;
			} else if (command.startsWith("info ")) 
			{
				processInfoCommand(command.split(" "));
				continue;
			} else if (command.equals("version")) 
			{
				processVersionCommand();
			}
			printHelp();
			
		}
	}
	
	//spring(패키지)관련 클래스들을 조합해놓은 객체를 생성
	
	
	
	
	// new a b c d  => arg[0]= new arg[1] =a arg[2] = b arg[3] = c arg[4] = d length = 5
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
				ctx.getBean(MemberRegisterService.class);
		//RegisterRequest 데이터 이기때문에 Bean객체를 등록을 하지 않았다.
		RegisterRequest korea = new RegisterRequest();
		korea.setEmail(arg[1]);
		korea.setName(arg[2]);
		korea.setPassword(arg[3]);
		korea.setConfirmPassword(arg[4]);
		
		// 데이터를 모두 대입
		// 패스워드 일치 확인을 진행
		if(!korea.isPasswordEqualToConfirmPassword())
		{
			System.out.println("암호와 확인이 일치하지 않습니다.");
			return;
		}
		// 문제가 없으면 실행
		try {
			//데이터를 담은 RegisterRequest 객체를 등록
			//MemberRegisterService에
			regSvc.regist(korea);
			System.out.println("등록했습니다.\n");
		}catch(DuplicateMemberException e){
			System.out.println("이미 존재하는 이메일입니다.\n");
		}
	}
	
	//agr[] 입력을 change a b c
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
	//
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
	
	private static void processListCommand() {
		MemberListPrinter listPrinter = 
				ctx.getBean("listPrinter", MemberListPrinter.class);
		// 전체 출력
		listPrinter.printAll();
	}
	
	private static void processVersionCommand() {
		VersionPrinter versionPrinter = 
				ctx.getBean("versionPrinter", VersionPrinter.class);
		versionPrinter.print();
	}
	
	//
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
