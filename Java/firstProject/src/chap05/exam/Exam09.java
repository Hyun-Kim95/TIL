package chap05.exam;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean k = true;
		int i = 0;
		
		System.out.print("총 스택 저장 공간의 크기 입력>>");

		String stack[] = new String[sc.nextInt()];
		
		StringStack sts = new StringStack(stack,i);
		
		while(k) {
			System.out.print("문자열 입력>>");
			String ss = sc.next();
			k = sts.push(ss);
		}
	}
}