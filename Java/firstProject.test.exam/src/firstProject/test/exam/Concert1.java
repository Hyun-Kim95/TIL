package firstProject.test.exam;

import java.util.Scanner;

public class Concert1 {
	private boolean end;	// 기본값이 false로 초기화(true: 종료)
	// 좌석 등급 정보
	public static final int SEAT_S = 0;
	public static final int SEAT_A = 1;
	public static final int SEAT_B = 2;
	public final String[] SEAT = {"S", "A", "B"};
	
	Scanner scan;	// 키보드 입력
	// 좌석 예약 정보 배열을 접근할 수 있는 참조변수
	private String[] s;	// 1차원 배열 방식 사용
	private String[] a;
	private String[] b;
	// 생성자(예약정보를 저장할 배열 초기화)
	public Concert1(int n) {
		s = new String[n];
		a = new String[n];
		b = new String[n];
		scan = new Scanner(System.in);
		System.out.println("명품 콘서트홀 예약 시스템입니다.");
	}
	public boolean isEnd() {
		return this.end;
	}
	public void setEnd() {
		this.end = true;
	}
	// 좌석 예약
	public void setSeat(String[] seat, String name, int i) {
		if(seat[i-1]!=null) {
			System.out.println(SEAT[i]+i+"번 좌석은 이미 예약되어있는 좌석입니다.");
			return;
		}
		seat[i-1] = name;
	}
	// 사용자에게 보여줄 선택 메뉴
	public int getMenu1() {
		System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >>");
		return scan.nextInt();
	}
	public int getMenu2() {
		System.out.print("좌석구분 S(1), A(2), B(3) >>");
		return scan.nextInt();
	}
	// 사용자에게 보여줄 예매 정보를 출력
	public void show(int i) {
		System.out.print(SEAT[i]+">> ");
		String seat[] = null;
		if(i==SEAT_S) {
			seat = s;
		}else if(i==SEAT_A) {
			seat = a;
		}else if(i==SEAT_B) {
			seat = b;
		}
		
		for(String name : seat) {
			if(name==null)
				System.out.print("--- ");
			else
				System.out.print(name+" ");
		}
		System.out.println();
	}
	
	public void reserve(int seat) {
		scan.nextLine(); // 키보드버퍼에 남아있는 엔터를 버림
		System.out.print("이름>>");
		String name = scan.nextLine();
		System.out.print("번호>>");
		int num = scan.nextInt();
		if(seat == SEAT_S) {
			setSeat(s, name, num);
		}else if(seat == SEAT_A) {
			setSeat(a, name, num);
		}else if(seat == SEAT_B) {
			setSeat(b, name, num);
		}
	}
	// 예약 취소
	public void cancel() {
		int seat = getMenu2();
		show(seat-1);
		cancel(seat-1);
	}
	public void cancel(int i) {
		String seat[] = null;
		if(i==SEAT_S) {
			seat = s;
		}else if(i==SEAT_A) {
			seat = a;
		}else if(i==SEAT_B) {
			seat = b;
		}
		scan.nextLine();  // 키보드버퍼에 남아있는 엔터를 버림
		System.out.print("이름>>");
		String name = scan.nextLine();
		for(int j=0; j<seat.length; j++) {
			if(name.equals(seat[j])) {
				seat[j] = null;
				System.out.println(name+"님의 예약이 취소되었습니다.");
				break;
			}
		}
	}	
}