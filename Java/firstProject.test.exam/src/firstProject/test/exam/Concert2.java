package firstProject.test.exam;

import java.util.Scanner;

public class Concert2 {
	private boolean end;
	public static final int SEAT_S = 0;
	public static final int SEAT_A = 1;
	public static final int SEAT_B = 2;
	public final String[] SEAT = {"S", "A", "B"}; 
	Scanner scan;
	private String[][] seat;  // 2�����迭 ��Ļ��
	public Concert2(int n) {
		seat = new String[3][]; // 0:S, 1:A, 2:B
		seat[SEAT_S] = new String[n];
		seat[SEAT_A] = new String[n];
		seat[SEAT_B] = new String[n];
		scan = new Scanner(System.in);
		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
	}
	public boolean isEnd() {
		return this.end;
	}
	public void setEnd() {
		this.end = true;
	}
	public int getMenu1() {
		System.out.print("����:1, ��ȸ:2, ���:3, ������:4 >>");
		return scan.nextInt();
	}
	public int getMenu2() {
		System.out.print("�¼����� S(1), A(2), B(3) >>");
		return scan.nextInt();
	}
	public void show(int i) {
		System.out.print(SEAT[i]+">> ");
		for(String name : seat[i]) {
			if(name==null)
				System.out.print("--- ");
			else
				System.out.print(name+" ");
		}
		System.out.println();
	}
	public void setSeat(String[] _seat, String name, int num) {
		if(_seat[num-1]!=null) {
			System.out.println(SEAT[num-1]+num+"�� �¼��� �̹� ����Ǿ��ִ� �¼��Դϴ�.");
			return;
		}
		_seat[num-1] = name;
	}
	public void reserve(int i) {
		scan.nextLine();
		System.out.print("�̸�>>");
		String name = scan.nextLine();
		System.out.print("��ȣ>>");
		int num = scan.nextInt();
		
		setSeat(seat[i], name, num);
	}
	public void cancel() {
		int seat = getMenu2();
		show(seat-1);
		cancel(seat-1);
	}
	public void cancel(int i) {
		scan.nextLine();
		System.out.print("�̸�>>");
		String name = scan.nextLine();
		for(int j=0; j<seat[i].length; j++) {
			if(name.equals(seat[i][j])) {
				seat[i][j] = null;
				System.out.println(name+"�� �������");
				break;
			}
		}
	}
	
}
