package chap05.exam;

public class Line1 extends Shape1{
	public Line1() {
		System.out.println("Line1 객체 생성");
	}
	@Override
	public void draw() {
		System.out.println("Line1");
	}
	
}
