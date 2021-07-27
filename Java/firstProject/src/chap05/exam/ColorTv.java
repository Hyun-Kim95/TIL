package chap05.exam;

public class ColorTv extends TV{
	private int color;
	public ColorTv(int size, int color) {
		super(size);
		this.color = color;
	}
	
	void printProperty() {
		System.out.println(getSize()+"인치 "+color+"컬러");
	}
}