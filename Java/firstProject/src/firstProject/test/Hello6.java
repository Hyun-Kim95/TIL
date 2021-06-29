package firstProject.test;

import java.util.Scanner;

public class Hello6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("0~2 사이의 숫자를 입력하세요.");
		int h  = scan.nextInt();
		// Math.random(): 0~1사이의 숫자를 반환하므로 *3을 해줌
		int c = (int)(Math.random()*3);	// 0~2 반환
		System.out.println("사람 : "+h+",컴퓨터 :"+c);
		scan.close();
	}

}
