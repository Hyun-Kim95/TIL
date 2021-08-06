package chap06;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exam11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer uu = new StringBuffer();
		System.out.print(">>");
		uu.append(sc.nextLine());
		String m;
		int a;
		while(true) {
			System.out.println("명령: ");
			m = sc.nextLine();
			if(m.contains("그만")) {
				System.out.println("종료합니다.");
				break;
			}
			StringTokenizer st = new StringTokenizer(m,"!");			
			
			if(st.countTokens() == 2) {
				m = st.nextToken();
				a = uu.indexOf(m);
				if(a != -1) {
					String token = st.nextToken();
					uu.replace(a, a+m.length(), token);
				}else {
					System.out.println("찾을 수 없습니다!");
				}
			}else {
				System.out.println("잘못된 명령입니다!");		
			}
			System.out.println(uu);
		}
	}
}