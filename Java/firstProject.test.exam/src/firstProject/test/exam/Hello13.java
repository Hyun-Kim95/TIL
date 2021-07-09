package firstProject.test.exam;

public class Hello13 {
	int a;
	static int b;
	void f01() {
		System.out.println("f01에서 접근한 a: "+a);
		System.out.println("f01에서 접근한 b: "+b);
	}
	static void f02() {
		//System.out.println("f02에서 접근한 a: "+a);
		System.out.println("f02에서 접근한 b: "+b);
	}
	public static void main(String[] args) {
		Hello13 h = new Hello13();	// 클래스를 이용해 인스턴스를 생성(인스턴스화)
		h.a = 10;	// h1 참조변수를 통해 인스턴스(객체)에 접근하는 방식
		h.b = 10;	// static 멤버변수를 참조변수를 통해 접근
		Hello13.b = 10;	// 클래스이름을 통해 static멤버변수 접근가능(인스턴스 없어도 됨)
		h.f01();
		h.f02();	// 참조변수를 통해서 static 메소드를 접근하는 것은 가능하나 비추천(노란줄)
		Hello13.f02();	// 클래스이름을 통해서 static 메소드를 접근가능(인스턴스 없어도 됨)
		Hello13 hi = new Hello13();
		hi.a = 20;
		hi.b = 20;
		hi.f01();
		hi.f02();
		System.out.println("h.a: "+h.a);
		System.out.println("h.b: "+h.b);
		System.out.println("hi.a: "+hi.a);
		System.out.println("hi.b: "+hi.b);
	}
}