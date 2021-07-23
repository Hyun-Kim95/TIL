package chap05;

public class Student extends Person{
	String grade;
	String department;
	public Student(String name) {
		super(name);
	}
	public void showInfo() {
		System.out.println("학생입니다");
	}
}
