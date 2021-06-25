package firstProject.test;

import java.util.Scanner;

public class Exam82 {
	// 문제> 5자리 숫자를 입력받아서 각 자리 별로 숫자를 출력하시오.
	// 입력 예> 12345
	// 출력 예> 1만 2천 3백 4십 5원
	public static void main(String[] args) {
		// 교재 예제문제
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int time = scan.nextInt();
		int second = time%60;
		int minute = (time/60)%60;
		int hour = (time/60)/60;
		System.out.print(time+"초는 ");
		System.out.print(hour+"시간, ");
		System.out.print(minute+"분, ");
		System.out.println(second+"초입니다.");
		
		// 교수님 예제문제
		System.out.println("5자리 정수를 입력하세요.");
		int num = scan.nextInt();
		int man = num/10000;
		int chun = (num/1000)%10;
		int baek = (num/100)%10;
		int sip = (num/10)%10;
		int il = (num%10);
		System.out.println(man+"만 "+chun+"천 "+baek+"백 "+sip+"십 "+il+"원");
		
		//교수님 예제문제(for문+배열)
		System.out.println("5자리 정수를 입력하세요.");
		int num1 = scan.nextInt();
		int[] a = {10000,1000,100,10,1};
		String[] b = {"만","천","백","십","원"};
		for(int i=0;i<5;i++) {
			System.out.print(num1/a[i] + b[i]+" ");
			num1 %= a[i]; 
		}
		
		scan.close();
	}

}
