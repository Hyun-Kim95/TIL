package chap05.exam;

public class Rect implements Shape {
	int i;
	int j;
	public Rect(int i,int j) {
		this.i = i;
		this.j = j;
	}

	@Override
	public void draw() {
		System.out.println(i+"x"+j+"크기의 사각형입니다.");
	}

	@Override
	public double getArea() {
		return i*j;
	}

}
