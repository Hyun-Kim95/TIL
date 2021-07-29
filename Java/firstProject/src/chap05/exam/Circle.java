package chap05.exam;

public class Circle implements Shape{
	int r;
	public Circle(int r) {
		super();
		this.r = r;
	}

	@Override
	public void draw() {
		System.out.println("반지름이 "+r+"인 원입니다.");
	}

	@Override
	public double getArea() {
		return PI * r * r;
	}
}