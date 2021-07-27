package chap05.interf;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Clean c = new Clean();
		Scanner s = new Scanner(System.in);
		String a[] = {"A","B"};
		int i = 1;
		System.out.println("채팅 종료를 원하시면 exit 입력");
		while(true) {
			if (i == 1)
				i = 0;
			else
				i = 1;
			System.out.print(a[i]+": ");
			String m = s.nextLine();
			if(m.equals("exit")) {
				System.out.println("채팅을 종료합니다.");
				break;
			}
			String ans = c.sendMessage(m);
			System.out.println(ans);
		}
	}
}