package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//치세요
import config.AppCtx;
import spring.AlreadyExistingMemberException;
import spring.ChangePasswordService;
//import spring.DuplicateMemberException;
import spring.IdPasswordNotMatchingException;
//import spring.MemberInfoPrinter;
//import spring.MemberListPrinter;
//import spring.MemberInfoPrinter;
//import spring.MemberListPrinter;
import spring.MemberNotFoundException;
import spring.MemberRegisterService;
import spring.RegisterRequest;
//import spring.VersionPrinter;
//import spring.VersionPrinter;
import spring.WrongIdPasswordException;


public class MainForSpring {
	
	//ApplicationContext를 사용하기위해 변수 생성
	private static ApplicationContext ctx = null;
	
	public static void main(String[] args)throws IOException
	{
		//설정 관련된 AppCtx를 설정 클래서하고 사용할 수 있게 ctx에 대입했다.
		ctx = new AnnotationConfigApplicationContext(AppCtx.class);
		
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
			
			if(command.startsWith("new "))
			{
				processNewCommand(command.split(" "));
				continue;
			}
			else if(command.startsWith("change "))
			{
				processChangeCommand(command.split(" "));
				continue;
			}
//			else if (command.equals("list")) 
//			{
//				processListCommand();
//				continue;
//			} 
//				else if (command.startsWith("info ")) 
//			{
//				processInfoCommand(command.split(" "));
//				continue;
//			} 
//				else if (command.equals("version")) 
//			{
//				processVersionCommand();
//				continue;
//			}
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
		//이전 객체를 여기서 생성했는데
		//빈객체를 요청해서 쓰게 된다.
		MemberRegisterService regSvc = 
				ctx.getBean("memberRegSvc", 
						MemberRegisterService.class);
		RegisterRequest req = new RegisterRequest();
		req.setEmail(arg[1]);
		req.setName(arg[2]);
		req.setPassword(arg[3]);
		req.setConfirmPassword(arg[4]);
		
		if(!req.isPasswordEqualToConfirmPassword())
		{
			System.out.println("암호와 확인이 일치하지 않습니다.");
			return;
		}
		try {
			regSvc.regist(req);
			System.out.println("등록했습니다.\n");
		}catch(AlreadyExistingMemberException e){
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
		
		//이전에 객체를 직접생성했는데
		//Bean객체를 호출해서 사용함 
		ChangePasswordService changePwdSvc =
				ctx.getBean("changePwdSvc", 
						ChangePasswordService.class);
		//assembler에서 ChangePasswordServise 추출해놓은
		try {
			changePwdSvc.changePassword(arg[1], arg[2], arg[3]);
			System.out.println("암호를 변경했습니다.\n");
		} catch (MemberNotFoundException e) {
			System.out.println("존재하지 않는 이메일입니다.\n");
		}catch(IdPasswordNotMatchingException e)
		{
			System.out.println("이메일과 암호가 일치하지 않습니다.\n");
		}
	}
//	
//	private static void processListCommand() {
//		//Bean 객체인 MemberListPrinter 추출
//		MemberListPrinter listPrinter = 
//				ctx.getBean("listPrinter", MemberListPrinter.class);
//		//Bean 객체에서 추출된 listPrinter의 함수 printAll() 호출합니다.
//		listPrinter.printAll();
//	}
//	
//	
//	
//	private static void processInfoCommand(String[] arg)
//	{
//		//문자열 배열의 길이가 2가 아니면 실행
//		if (arg.length != 2) {
//			printHelp();
//			return;
//		}
//		//////////////////////////////////////
//		//MemberInfoPrinter Bean 객체를 받아옵니다. -> infoPrinter 
//		MemberInfoPrinter infoPrinter = 
//				ctx.getBean("infoPrinter", 
//						MemberInfoPrinter.class);
//		//MemberInfoPrinter에 있는 printMemberInfo함수를 호출합니다. 호출할때 문자열 배열에 있는 인덱스 1번의 값을 넣어줍니다.
//		infoPrinter.printMemberInfo(arg[1]); 
//	}
//
//	
//	private static void processVersionCommand() {
//		//VersionPrinter 객체를 Bean에서 추축해서 -> versionPrinter에 대입
//		VersionPrinter versionPrinter = 
//				ctx.getBean("versionPrinter", VersionPrinter.class);
//		//버전 출력하는 함수 호출
//		versionPrinter.print();
//	}
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
