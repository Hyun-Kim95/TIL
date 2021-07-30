package chap05.exam;

public class ColorPoint extends Point{
	String color;
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	public void setXY(int x, int y) {
		super.move(x,y);
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		return this.color + "색의 ("+super.getX()+","+super.getY()+")의 점";
	}

}
