package chap05.exam;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("총 스택 저장 공간의 크기 입력>>");
		int a = sc.nextInt();
		StringStack sts = new StringStack(a);
		int i = 0;
		boolean k = true;
		while(k) {
			System.out.print("문자열 입력>>");
			String ss = sc.next();
			k = sts.push(ss);
			if(sts.length() == a) {
				System.out.println("꽉찼습니다.");
				
			}else {
				sts.stack[i] = ss;
				i++;
				System.out.println(sts.capacity()+"개 입력 가능");
			}
		}		
	}
}