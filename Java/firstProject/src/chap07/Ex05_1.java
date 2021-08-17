package chap07;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05_1 {
	String 이름;
	String 학과;
	String 학번;
	Double 학점평균;

	public Ex05_1(String 이름, String 학과, String 학번, Double 학점평균) {
		this.이름 = 이름;
		this.학과 = 학과;
		this.학번 = 학번;
		this.학점평균 = 학점평균;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Ex05_1> student = new ArrayList<>();
		System.out.println("학생 이름,학과,학번,학점평균 입력하세요.");
		for (int i = 0; i < 4; i++) {
			String[] x = sc.nextLine().split(",");
			student.add(new Ex05_1(x[0].trim(), x[1].trim(), x[2].trim(), Double.parseDouble(x[3].trim())));
		}
		for (int i = 0; i < 4; i++) {
			System.out.println("----------------");
			System.out.println("이름: "+student.get(i).이름);
			System.out.println("학과: "+student.get(i).학과);
			System.out.println("학번: "+student.get(i).학번);
			System.out.println("학점평균: "+student.get(i).학점평균);
		}
		while (true) {
			System.out.print("학생 이름 >>");
			String s = sc.next();
			if(s.equals("그만"))
				break;
			for (int i = 0; i < 4; i++) {
				if (student.get(i).이름.equals(s)) {
					System.out.println(student.get(i).이름 + ", " + student.get(i).학과 + ", " + student.get(i).학번 + ", "
							+ student.get(i).학점평균);
				}
			}
		}
		sc.close();
	}
}