package firstProject.test;

import java.util.Scanner;

public class Hello4 {
	public static void main(String[] args) {
		//구구단
		//조건문 1개 사용
		int i = 2;
		int j = 1;
		while(i<=9) {
			System.out.print(i+" x "+j+" = "+ i*j);
			j++;
			System.out.println();
			if(j>9) {
				j = 1;
				i++;
				System.out.println();
			}
		}
		//조건문 2개 사용
		i = 2;
		j = 1;
		while(true) {
			System.out.print(i+" x "+j+" = "+ i*j);
			j++;
			System.out.println();
			if(j>9) {
				j = 1;
				i++;
				System.out.println();
			}
			if(i>9) break;
		}
		//조건문 0개 사용
		i = 2;
		j = 1;
		for(i=2;i<=9;) {
			System.out.println(i+" x "+j+" = "+ i*j);
			i = i + j/9;
			j %=9;
			j++;
		}
		
		//a,b 바꾸기
		int a =10;
		int b =20;
		int c = 0;
		//첫번째 방법
		System.out.println("a:"+a+",b:"+b);
		c = a;
		a = b;
		b = c;
		System.out.println("a:"+a+",b:"+b);
		//두번째 방법
		a = a + b;
		b = a-b;
		a = a - b;
		System.out.println("a:"+a+",b:"+b);
		
		// 가위바위보
		Scanner scan = new Scanner(System.in);
		System.out.println("0:가위,1:바위,2:보");
		System.out.println("A와B의 숫자를 띄어쓰기로 입력하세요.");
		int A = scan.nextInt();
		int B = scan.nextInt();
		//첫번째 방법
		if(A==B) {
			System.out.println("비겼습니다");
		}else if((A==0&&B==1)||(A==1&&B==2)||(A==2&&B==0)) {
			System.out.println("B가 이겼습니다.");
		}else {
			System.out.println("A가 이겼습니다.");
		}
		//두번째 방법
		if(A-B==0) {
			System.out.println("비겼습니다");
		}else if(((B-A)==1)||(B-A==-2)) {
			System.out.println("B가 이겼습니다.");
		}else {
			System.out.println("A가 이겼습니다.");
		}
		//최대공약수
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		int chk = (number1>number2)?number2:number1;
		//첫번째 방법
		while(true) {
			if(number1 % chk == 0) {
				if(number1%chk == 0) {
					System.out.println(chk);
					break;
				}
				chk -= 1;
			}
			chk -= 1;
		}
		//두번째 방법
		int yak = 2;
		int count = 1;
		int check = 0;
		while(true) {
			if(number1%yak == 0 && number2%yak == 0) {
				number1 /= yak;
				number2 /= yak;
				count *= yak;
				check = 0;
			}else {
				yak++;
			}
			if(number1 < yak || number2 < yak) {
				if(check == 1) {
					break;
				} else {
					yak = 2;
					check = 1;
				}
			}
		}
		System.out.println(count);
	}
}
