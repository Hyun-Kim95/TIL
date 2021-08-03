package chap05.exam;

import java.util.Scanner;

public class GraphicEditor{
	Scanner scan;
	Shape1 start, obj;
	int cnt;
	public GraphicEditor() {
		System.out.println("그래픽 에디터 beauty를 실행합니다.");
		scan = new Scanner(System.in);
	}
	
	public void insertNode() {
		System.out.print("Line(1), Rect(2), Circle(3)>>");
		int n = scan.nextInt();
		Shape1 newNode = null;
		if(n==1)
			newNode = new Line1();
		else if(n==2)
			newNode = new Rect1();
		else if(n==3)
			newNode = new Circle1();
		
		if(start == null) {
			start = newNode;
			obj = newNode;
		}else {
			obj.setNext(newNode);
			obj = newNode;
		}
		cnt++;
	}
	public void deleteNode() {
		System.out.println("삭제할 도형의 위치>>");
		int n = scan.nextInt();
		if(n > cnt || n == 0) {
			System.out.println("삭제할 수 없습니다.");
			return;
		}else if(n>0) {
			Shape1 t1 = start;
			Shape1 t2 = start;
			if(n==1)
				start = t2.getNext();
			else {
				t2 = t2.getNext();
				int i = n;
				while(i>2) {
					t2 = t2.getNext();
					t1 = t1.getNext();
					i--;
				}
				t1.setNext(t2.getNext());
				t2.setNext(null);
				if(n==cnt)
					obj = t1;
			}
			cnt--;
		}
	}
	public void viewNode() {
		if(start==null) {
			System.out.println("출력할 노드가 없습니다.");
			return;
		}
		Shape1 nextNode = start;
		while(nextNode !=null) {
			nextNode.draw();
			nextNode = nextNode.getNext();
		}
	}
	
	public void run() {
		boolean end = false;
		while(true) {
			System.out.println("삽입(1), 삭제(2), 모두보기(3), 종료(4)>>");
			int n = scan.nextInt();
			switch(n) {
			case 1:
				insertNode();
				break;
			case 2:
				deleteNode();
				break;
			case 3:
				viewNode();
				break;
			case 4:
				end = true;
				break;
			}
			if(end) {
				System.out.println("beauty을 종료합니다.");
				break;
			}
		}
	}
	public static void main(String[] args) {
		GraphicEditor G = new GraphicEditor();
		G.run();
	}
}