package chap07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Ex13 {
	static Scanner sc = new Scanner(System.in);
	static HashMap<String, Integer> Com = new HashMap<>();
	static ArrayList<String> arr = new ArrayList<>();
	String prt;

	public void run() {
		String b = "";
		while (true) {
			System.out.print(">> ");
			b = sc.nextLine();
			String[] a = b.split(" ");

			if (a[0].equals("mov")) {
				mov(b, a);
			} else if (a[0].equals("add")) {
				add(b, a);
			} else if (a[0].equals("sub")) {
				sub(b, a);
			} else if (a[0].equals("jn0")) {
				int idx = Integer.parseInt(a[2]);
				while (!Com.get(a[1]).equals(0) && idx < arr.size()) {
					a = arr.get(idx).split(" ");
					if (a[0].equals("mov")) {
						mov(arr.get(idx), a);
					} else if (a[0].equals("add")) {
						add(arr.get(idx), a);
					} else if (a[0].equals("sub")) {
						sub(arr.get(idx), a);
					}
					idx++;
				}
			} else if (a[0].equals("prt")) {
				prt = b;
			} else if (a[0].equals("go")) {
				System.out.println("[" + prt + "]");
				Set<String> key = Com.keySet();
				for (String k : key) {
					System.out.print(k + ":" + Com.get(k) + " ");
				}
				a = prt.split(" ");
				System.out.println("\n출력할 결과는 " + Com.get(a[1]) + ". 프로그램 실행 끝");
				Com.clear();
				arr.clear();
			}
		}
	}

	public void mov(String b, String[] a) {
		Com.put(a[1], Integer.parseInt(a[2]));
		arr.add(b);
	}

	public void add(String b, String[] a) {
		try {
			Com.replace(a[1], Com.get(a[1]) + Integer.parseInt(a[2]));
		} catch (Exception e) {
			Com.replace(a[1], Com.get(a[1]) + Com.get(a[2]));
		}
		arr.add(b);
	}

	public void sub(String b, String[] a) {
		try {
			Com.replace(a[1], Com.get(a[1]) - Integer.parseInt(a[2]));
		} catch (Exception e) {
			Com.replace(a[1], Com.get(a[1]) - Com.get(a[2]));
		}
		arr.add(b);
	}

	public static void main(String[] args) {
		Ex13 e = new Ex13();
		System.out.println("수퍼컴이 작동합니다. 프로그램을 입력해주세요. go를 입력하면 작동합니다.");
		e.run();
	}
}