package chap05.exam;

import java.util.Scanner;

public class GraphicEditor {
	Scanner sc = new Scanner(System.in);
	int a;
	int b;
	int c;
	boolean g = true;
	int i = 0;
	String k;
	String s[] = new String[255];
	public void run() {
		System.out.println("그래픽 에디터 beauty를 실행합니다.");
		while(g) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			a = sc.nextInt();
			switch(a) {
			case 1: insert(); break;
			case 2: delete(); break;
			case 3: show(); break;
			case 4: exit(); break;
			}
		}
	}
	
	public void insert() {
		System.out.print("Line(1), Rect(2), Circle(3)>>");
		b = sc.nextInt();
		switch(b) {
		case 1: k="Line"; break;
		case 2: k="Rect"; break;
		case 3: k="Circle"; break;
		}
		s[i] = k;
		i++;
	}
	
	public void delete() {
		System.out.println("삭제할 도형의 위치>>");
		c = sc.nextInt();
		if(c > s.length || c < 1)
			System.out.println("삭제할 수 없습니다.");
		else
			s[c-1] = null;
	}
	
	public void show() {
		for(int j = 0;j<s.length;j++) {
			if(s[j] == null)
				break;
			System.out.println(s[j]);
		}
	}
	
	public boolean exit() {
		System.out.println("beauty를 종료합니다.");
		g = false;
		return g;
	}
	public static void main(String[] args) {
		GraphicEditor G = new GraphicEditor();
		G.run();
	}
}
