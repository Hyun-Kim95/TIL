package firstProject.test;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dividend;
		int divisor;
		System.out.println("나뉨수를 입력하세요.");
		dividend=scan.nextInt();
		System.out.println("나눗수를 입력하세요.");
		divisor=scan.nextInt();
		try {
			System.out.println(dividend+"를 "+divisor+"로 나누면 몫은"+
					dividend/divisor+"입니다.");
		}catch(NullPointerException e){
			System.out.println("NullPointerException 대응하기");
			e.printStackTrace();	// 예외 종류 출력
			System.out.println(e.getMessage());	// 예외메세지 출력
		}catch(ClassCastException e){
			System.out.println("ClassCastException 대응하기");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(ArithmeticException e){
			System.out.println("ArithmeticException 대응하기");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(Exception e){
			System.out.println("나머지 모든 Exception 대응하기");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally{
			System.out.println("Exception 발생 유무와 상관없이 무조건 실행됨.");
		}
		System.out.println("중요한 작업...");// try catch 구문을 사용하므로서 중요한 작업 출력 가능
		scan.close();
	}
}