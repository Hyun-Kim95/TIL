package chap05.abc;
public class Point {
	private int x;
	protected int y;
	public Point() {
		this(0,0);	// x,y를 초기화할 생성자 호출
		//this.x = this.y = 0;
		System.out.println("Point()생성자 호출");
	}
	public Point(int x, int y) {
		this.x = x; this.y = y;
		System.out.println("Point(int x, int y)생성자 호출");
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}
