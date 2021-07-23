package chap05;

public class Professor extends Person{
	public Professor(String name) {
		super(name);
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("교수입니다.");
	}
	public void teaching() {
		System.out.println("교육중...");
	}
}