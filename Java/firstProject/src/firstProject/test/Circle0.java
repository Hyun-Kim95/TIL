package firstProject.test;
public class Circle0 {
	public int radius;	// 멤버변수(필드, 속성)
	public String name;	// 멤버변수(필드, 속성)
	public Circle0(int radius, String name) {
		// 생성자(클래스 이름과 동일한 메서드, 객체 생성시 최초에 1회 자동 호출)
		// 초기화 용도로 적합, 리턴타입이 없음
		// this는 나 자신 객체
		this.radius = radius;
		this.name = name;
	}
	public Circle0(int radius) {
		this.radius = radius;
	}
	public double getArea() {	// 메소드(기능)
		return 3.14 * radius * radius;
	}
	public static void main(String[] args) {
		Circle0 pizza = new Circle0(10, "자바피자");	// Circle0클래스로 인스턴스(객체)를 생성하여 주소를 pizza변수에 저장
		Circle0 pizza2 = new Circle0(20, "몬스터피자");
		// 생성자를 이용하면 밑에 두줄이 위 한줄로 가능
		//pizza.radius = 10;
		//pizza.name = "자바피자";
		System.out.println("pizza name: "+pizza.name+"area: "+pizza.getArea());
		System.out.println("pizza2 name: "+pizza2.name+"area: "+pizza2.getArea());
		Circle0 ob1 = new Circle0(1);
		Circle0 ob2 = new Circle0(2);
		System.out.println("ob1: "+ob1);
		System.out.println("ob2: "+ob2);
		Circle0 s = ob2;
		ob1 = s;
		System.out.println("ob1.radius="+ob1.radius);
		System.out.println("ob2.radius="+ob2.radius);
		System.out.println("ob1 : "+ob1);
		System.out.println("ob2 : "+ob2);
		System.out.println("s : "+s);
	}
}