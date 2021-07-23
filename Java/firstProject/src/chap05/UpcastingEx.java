package chap05;

public class UpcastingEx {
	public static void main(String[] args) {
		Person[] p = new Person[3];
		
		p[0] = new Student("홍길동");
		p[1] = new Researcher("이순신");
		p[2] = new Professor("유관순");
		
		for(int i=0;i<p.length;i++) {
			System.out.println(p[i].name);
			p[i].showInfo();
			if(p[i] instanceof Student) {
				System.out.println("Student 클래스의 인스턴스입니다.");
				Student s = (Student)p[i];
				s.grade = "A";
				s.department = "com";
			}else if(p[i] instanceof Researcher) {
				System.out.println("Researcher 클래스의 인스턴스입니다.");
				((Researcher)p[i]).researching();
			}else if(p[i] instanceof Professor) {
				System.out.println("Professor 클래스의 인스턴스입니다.");
				Professor pro = (Professor)p[i];
				pro.teaching();
			}
		}
	}
}