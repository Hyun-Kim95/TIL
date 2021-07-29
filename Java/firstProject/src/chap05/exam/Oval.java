package chap05.exam;

public class Oval implements Shape {
	int i;
	int j;
	public Oval(int i, int j) {
		this.i = i;
		this.j = j;
	}

	@Override
	public void draw() {
		System.out.println(i+"x"+j+"에 내접하는 타원입니다.");
	}

	@Override
	public double getArea() {
		return PI * i * j;
	}

}
