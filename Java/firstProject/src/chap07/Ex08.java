package chap07;

import java.util.HashMap;
import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> point = new HashMap<>();
		System.out.println("** 포인트 관리 프로그램입니다 **");
		String[] sv = new String[255];
		int q = 0;
		while (true) {
			System.out.print("이름과 포인트 입력>>");
			String[] a = sc.nextLine().split(" ");
			if (a[0].equals("그만"))
				break;
			int k = Integer.parseInt(a[1]);
			if (point.containsKey(a[0]))
				k += point.get(a[0]);
			else {
				sv[q] = a[0];
				q++;
			}
			point.put(a[0], k);
			for (int i = 0; i < point.size(); i++) {
				System.out.print("(" + sv[i] + "," + point.get(sv[i]) + ")");
			}
			System.out.println();
		}
		sc.close();
	}
}