package chap07;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Ex11 {
	static Scanner sc = new Scanner(System.in);
//	static Vector<String> Nation = new Vector<>();
	HashMap<String, String> Nation = new HashMap<>();

	public void run() {
		Nation.put("그리스", "아테네");
		Nation.put("멕시코", "멕시코시티");
		Nation.put("영국", "런던");
		while (true) {
			System.out.println("입력:1, 퀴즈:2, 종료:3");
			int a = sc.nextInt();
			switch (a) {
			case 1:
				setting();
				break;
			case 2:
				quiz();
				break;
			case 3:
				System.out.println("게임을 종료합니다.");
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}
			if (a == 3)
				break;
		}
	}

	public void setting() {
		sc.nextLine();
		while (true) {
			int k = Nation.size();
			System.out.println("현재" + k + "개 나라와 수도가 입력되어 있습니다.");
			k++;
			System.out.print("나라와 수도 입력" + k + ">> ");
			String[] q = sc.nextLine().split(" ");
			if (q[0].equals("그만"))
				break;
			if (Nation.containsKey(q[0]))
				System.out.println(q[0] + "는 이미 있습니다!");
			else {
				Nation.put(q[0], q[1]);
			}
		}
	}

	public void quiz() {
		Set<String> key = Nation.keySet();
		for (String k : key) {
			System.out.print(k + "의 수도는? ");
			String ans = sc.next();
			if (ans.equals("그만"))
				break;
			if (Nation.get(k).equals(ans))
				System.out.println("정답!!");
			else
				System.out.println("아닙니다!!");
		}
	}

	public static void main(String[] args) {
		Ex11 e = new Ex11();
		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		e.run();
	}
}