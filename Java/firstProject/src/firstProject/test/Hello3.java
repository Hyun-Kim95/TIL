package firstProject.test;

import java.util.Scanner;

public class Hello3 {

	public static void main(String[] args) {
		// System.in: 표준 입력,	System.out: 표준 출력
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();		// 정수형의 키보드 입력 대기중
		// scan.next 를 보면 정수형 이외에도 여러가지를 받을 수 있음
		System.out.println("입력한 숫자: "+a);
		//scan.next();	// 변수에 저장하지 않고 위에서 받은 널문자를 그냥 날려버림
		String str = scan.next();//띄어쓰기를 기준으로 받아서 윗줄 널문자 없애는거 필요없음
		//숫자입력 바로 뒤에 있으면 숫자만 입력받고 끝나버림(위에서 엔터를 입력으로 받아서)
		System.out.println("입력한 문자열: "+str);
		//abc def 이렇게 입력하면 abc만 출력되고 def는 버퍼에 남아있게 됨
		scan.close();// 이후 scan을 사용하지 않겠다는 의미(안써도 에러는 안뜸)
	}

}
