package chap05;

import chap05.abc.Point;

public class ColorPoint extends Point{
	private String color;
	public ColorPoint(int x, int y, String color) {
		// 부모의 생성자를 호출 안하면 인자가 전달이 안됨(super() 자동 호출)
		super(x,y);	// 가장 위에 있어야 함
		System.out.println("ColorPoint(int x, int y, String color)생성자 호출");
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}
