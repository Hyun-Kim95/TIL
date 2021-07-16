package firstProject.test.exam;

import java.util.Scanner;
class Menu{
	static Scanner sc = new Scanner(System.in);
	static String S[] = {"---","---","---","---","---","---","---","---","---","---"};
	static String A[] = {"---","---","---","---","---","---","---","---","---","---"};
	static String B[] = {"---","---","---","---","---","---","---","---","---","---"};
	static String[][] K = {S,A,B};
	public static String[] k = {"S","A","B"};
	static boolean a = true;
	Action ac = new Action();
	boolean input() {
		System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >>");
		int x = sc.nextInt();
		if(x==1)
			ac.reserve();
		else if(x==2)
			ac.view();
		else if(x==3)
			ac.cancel();
		else if(x==4)
			ac.finish();
		else
			System.out.println("번호를 잘못 입력하셨습니다.");
		return a;
	}
}
class Action{
	void reserve() {
		while(true) {
			System.out.print("좌석구분 S(1), A(2), B(3) >>");
			int y = Menu.sc.nextInt();
			if (y >3 || y<1) {
				System.out.println("번호를 잘못 입력하셨습니다.");
				continue;
			}
			System.out.printf("%s>> ",Menu.k[y-1]);
			for(int i=0;i<10;i++) System.out.print(Menu.K[y-1][i]+" ");
			System.out.println();
			System.out.print("이름>>");
			String name = Menu.sc.next();
			System.out.print("번호>>");
			int num = Menu.sc.nextInt();
			if(num > 11 || num <1)
				System.out.println("번호를 잘못 입력하셨습니다.");
			else if(Menu.K[y-1][num-1] != "---")
				System.out.println("이미 예약되었습니다. 다른 번호를 골라주세요.");
			else {
				Menu.K[y-1][num-1] = name;
				break;
			}
		}
	}
	void view() {
		for(int j=0;j<3;j++) {
			System.out.printf("%s>> ",Menu.k[j]);
			for(int i=0;i<10;i++) System.out.print(Menu.K[j][i]+" ");
			System.out.println();
		}
		System.out.println("<<<조회를 완료하였습니다.>>>");
	}
	void cancel() {
		while(true) {
			System.out.print("좌석 S:1, A:2, B:3 >>");
			int chk =Menu.sc.nextInt();
			if(chk < 1 || chk > 3) {
				System.out.println("번호를 잘못 입력하셨습니다.");
				continue;
			}
			System.out.printf("%s>> ",Menu.k[chk-1]);
			for(int i=0;i<10;i++) System.out.print(Menu.K[chk-1][i]+" ");
			System.out.println();		
			System.out.print("이름>>");
			String name1 = Menu.sc.next();
			int chk1 = 0;
			for(int j=0;j<10;j++) {
				if(Menu.K[chk-1][j].contains(name1)) {
					Menu.K[chk-1][j] = "---";
					chk1 = 1;
				}
			}
			if(chk1 == 0) {
				System.out.println("이름을 찾지 못했습니다.");
			}
			else {
				break;
			}
		}
	}
	boolean finish() {
		Menu.a = false;
		System.out.println("명품콘서트홀 예약 시스템을 종료합니다.");
		return Menu.a;
	}
}
public class ExamNum12 {
	public static void main(String[] args) {
		Menu m = new Menu();
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		while(Menu.a) {
			m.input();
		}
	}
}