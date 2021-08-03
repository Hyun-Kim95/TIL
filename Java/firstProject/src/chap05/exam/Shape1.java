package chap05.exam;

public abstract class Shape1 {
	private Shape1 next;
	public Shape1() {
		next = null;
	}
	public void setNext(Shape1 obj) {
		next = obj;	// 링크 연결
	}
	public Shape1 getNext() {
		return next;
	}
	public abstract void draw();	// 추상 메소드
}
