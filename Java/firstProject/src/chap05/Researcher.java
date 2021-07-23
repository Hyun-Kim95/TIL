package chap05;

public class Researcher extends Person{

	public Researcher(String name) {
		super(name);
	}

	@Override
	public void showInfo() {
		System.out.println("연구원입니다");
	}
	public void researching() {
		System.out.println("연구중...");
	}
}
