package chap06;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요. 빈칸이나 영어, 한글 모두 됩니다.");
		// StringBuffer 풀이
		StringBuffer a = new StringBuffer();
		a.append(sc.nextLine());
		for(int i = 0;i<a.length();i++) {
			char c = a.charAt(0);
			a.deleteCharAt(0);
			a.append(c);
			System.out.println(a.toString());
		}
		// 일반 풀이
		String b = a.toString();
		for(int i = 0; i<b.length();i++) {
			b = b.substring(1) + b.substring(0,1);
			System.out.println(b);
		}
	}
}