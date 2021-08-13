package chap07;

import java.util.HashMap;
import java.util.Scanner;

public class Ex05_2 {
	String 이름;
	String 학과;
	String 학번;
	Double 학점평균;

	public Ex05_2(String 이름, String 학과, String 학번, Double 학점평균) {
		this.이름 = 이름;
		this.학과 = 학과;
		this.학번 = 학번;
		this.학점평균 = 학점평균;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Ex05_2> student = new HashMap<>();
		System.out.println("학생 이름,학과,학번,학점평균 입력하세요.");
		String[] X = new String[4];
		for (int i = 0; i < 4; i++) {
			String[] x = sc.nextLine().split(",");
			X[i] = x[0];
			student.put(x[0], new Ex05_2(x[0].trim(), x[1].trim(), x[2].trim(), Double.parseDouble(x[3].trim())));
		}
		for (int i = 0; i < 4; i++) {
			System.out.println("---------------------------");
			System.out.println("이름: " + student.get(X[i]).이름);
			System.out.println("학과: " + student.get(X[i]).학과);
			System.out.println("학번: " + student.get(X[i]).학번);
			System.out.println("학점평균: " + student.get(X[i]).학점평균);
		}
		System.out.println("---------------------------");
		while (true) {
			System.out.print("학생 이름 >>");
			String s = sc.next();
			if (s.equals("그만"))
				break;
			for (int i = 0; i < 4; i++) {
				if (student.get(X[i]).이름.equals(s)) {
					System.out.println(student.get(X[i]).이름 + ", " + student.get(X[i]).학과 + ", " + student.get(X[i]).학번
							+ ", " + student.get(X[i]).학점평균);
				}
			}
		}
	}
}