package chap07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Ex12 {
	static Random r = new Random();
	static Scanner sc = new Scanner(System.in);
	HashMap<String, String> Eng = new HashMap<>();

	public void run() {
		Eng.put("eye", "눈");
		Eng.put("human", "인간");
		Eng.put("fault", "오류");
		Eng.put("painting", "그림");
		Eng.put("animal", "동물");
		Eng.put("book", "책");
		while (true) {
			System.out.println("단어 테스트:1, 단어 삽입:2, 종료:3 >>");
			int a = sc.nextInt();
			switch (a) {
			case 1:
				quiz();
				break;
			case 2:
				setting();
				break;
			case 3:
				System.out.println("\"명품영어\"를 종료합니다.");
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
			System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
			System.out.print("영어 한글 입력 >> ");
			String[] q = sc.nextLine().split(" ");
			if (q[0].equals("그만"))
				break;
			Eng.put(q[0], q[1]);
		}
	}

	public void quiz() {
		int s = Eng.size();
		System.out.println("현재 " + s + "개의 단어가 들어 있습니다. -1을 입력하면 테스트를 종료합니다.");
		Set<String> key = Eng.keySet();
		for (String k : key) {
			System.out.println(k + "?");
			ArrayList<String> num = new ArrayList<>();
			num.addAll(Eng.values());
			int a, b, c, d;
			String[] kk = new String[4];
			while (true) {
				a = r.nextInt(num.size());
				b = r.nextInt(num.size());
				c = r.nextInt(num.size());
				d = r.nextInt(num.size());
				if (a == b || b == c || c == d || a == d) {
					continue;
				}
				if (Eng.get(k) != num.get(a) && Eng.get(k) != num.get(b) && Eng.get(k) != num.get(c)
						&& Eng.get(k) != num.get(d)) {
					continue;
				}
				System.out.print("(1)" + num.get(a) + "(2)" + num.get(b) + "(3)" + num.get(c) + "(4)" + num.get(d));
				kk[0] = num.get(a);
				kk[1] = num.get(b);
				kk[2] = num.get(c);
				kk[3] = num.get(d);
				break;
			}
			String ans = sc.next();
			if (ans.equals("-1"))
				break;
			switch (ans) {
			case "1":
				if (kk[0].equals(Eng.get(k)))
					System.out.println("Excellent !!");
				else
					System.out.println("No. !!");
				break;
			case "2":
				if (kk[1].equals(Eng.get(k)))
					System.out.println("Excellent !!");
				else
					System.out.println("No. !!");
				break;
			case "3":
				if (kk[2].equals(Eng.get(k)))
					System.out.println("Excellent !!");
				else
					System.out.println("No. !!");
				break;
			case "4":
				if (kk[3].equals(Eng.get(k)))
					System.out.println("Excellent !!");
				else
					System.out.println("No. !!");
				break;
			default:
				System.out.println("1~4 사이의 숫자를 입력하세요!!");
			}
		}
	}

	public static void main(String[] args) {
		Ex12 e = new Ex12();
		System.out.println("**** 영어 단어 테스트 프로그램 \"명품영어\" 입니다. ****");
		e.run();
	}
}