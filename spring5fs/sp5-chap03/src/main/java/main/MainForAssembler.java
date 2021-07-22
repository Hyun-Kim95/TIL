package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import assembler.Assembler;
import spring.ChangePasswordService;
import spring.DuplicateMemberException;
import spring.MemberNotFoundException;
import spring.MemberRegisterService;
import spring.RegisterRequest;
import spring.WrongIdPasswordException;


public class MainForAssembler {
	
	public static void main(String[] args)throws IOException
	{
		BufferedReader reader = 
				new BufferedReader(new InputStreamReader(System.in));//입력
		while(true)//무한루프
		{
			System.out.println("명령어를 입력하세요 : ");
			String command = reader.readLine();
			if(command.equalsIgnoreCase("exit")) // "exit"라고 입력하면
			{
				System.out.println("종료합니다.");
				break;
			}
			if(command.startsWith("new "))//"new"로 시작하면 
			{
				processNewCommand(command.split(" ")); // 띄워쓰기로 문자열을 자르면서 processNewCommand함수 호출
				continue; //다시시작
			}
			else if(command.startsWith("change "))//"change"로 시작하면
			{
				processChangeCommand(command.split(" "));// 띄워쓰기로 문자열을 자르면서 processChangeCommand 함수 호출
				continue; // 다시시작
			}
			
			printHelp();//printHelp함수 호출
			
		}
	}
	
	private static Assembler assembler = new Assembler(); //Assembler 객체 생성 static
	
	private static void processNewCommand(String[] arg) //인자로 문자열 배열 받습니다.
	{
		if(arg.length != 5) //배열의 길이가 5개 아니면 실행 new 메일주소 이름 비밀번호 비밀번호확인
		{                   //                        [0]   [1]  [2]   [3]     [4]
			printHelp();//printHelp함수 호출
			return; // 무조건 함수 종료
		}
		//5이면실행
		MemberRegisterService regSvc = assembler.getMemberRegisterService();
		//MemberRegisterService자료형인 regSvc 변수를 생성을 한다. 
		//assembler에서 getMemberRegisterService 함수를 호출해서 리턴 되는 값을 받아서 생성
		RegisterRequest req = new RegisterRequest();
		//RegisterRequest자료형인 reg 변수를 생성 하고 객체도 생성을 함
		req.setEmail(arg[1]); //reg에 있는 setEmail함수를 호출 할 때 문자열 배열 arg 1번인덱스 값을 넘긴다.
		req.setName(arg[2]); //reg에 있는 setName함수를 호출 할 때 문자열 배열 arg 2번인덱스 값을 넘긴다.
		req.setPassword(arg[3]); //reg에 있는 setPassword함수를 호출 할 때 문자열 배열 arg 3번인덱스 값을 넘긴다.
		req.setConfirmPassword(arg[4]);
		//reg에 있는 setConfirmPassword함수를 호출 할 때 문자열 배열 arg 4번인덱스 값을 넘긴다.
		
		if(!req.isPasswordEqualToConfirmPassword()) //isPasswordEqualToConfirmPassword false 리턴되야 실행
		{
			System.out.println("암호와 확인이 일치하지 않습니다.");
			return;
		}
		try {
			regSvc.regist(req); //regScv 함수 regist 호출 할때 req변수를 넘긴다.
			System.out.println("등록했습니다.\n");
		}catch(DuplicateMemberException e){
			System.out.println("이미 존재하는 이메일입니다.\n");
		}
	}
	
	private static void processChangeCommand(String[] arg)
	{
		//문자열 배열 arg 길이가 4개가 아니면 함수 종료
		if(arg.length != 4)
		{
			printHelp();
			return;
		}
		
		
		//ChangePasswordService자료형인 changePwdSvc 만든다.
		//assembler의 함수 getChangePasswordService를 호출해서 넘겨주는 값으로 값을 세팅합니다.
		ChangePasswordService changePwdSvc =
				assembler.getChangePasswordService();
		
		try {
			//changePassword함수를 호출을 할때 문자열 배열 arg[1] arg[2] arg[3]의 문자열을 인자로 넣어줍니다.
			changePwdSvc.changePassword(arg[1], arg[2], arg[3]);
			System.out.println("암호를 변경했습니다.\n");
		} catch (MemberNotFoundException e) {
			System.out.println("존재하지 않는 이메일입니다.\n");
		}catch(WrongIdPasswordException e)
		{
			System.out.println("이메일과 암호가 일치하지 않습니다.\n");
		}
	}
	
	private static void printHelp()
	{
		//출력
		System.out.println();
		System.out.println("잘못된 명령입니다. 아래 명령어 사용법을 확인하세요.");
		System.out.println("명령어 사용법:");
		System.out.println("new 이메일 이름 암호 암호확인");
		System.out.println("change 이메일 현재비번 변경비번");
		System.out.println();
	}
	
	
}
