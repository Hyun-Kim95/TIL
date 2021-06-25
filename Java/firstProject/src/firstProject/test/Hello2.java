package firstProject.test;

public class Hello2 {

	public static void main(String[] args) {
		System.out.println("Hello2 main start");
		// 기본 데이터 타입(+초기화)
		boolean a = true;
		char b = 65;			// 아스키코드 값 A
		byte c = 127;			// 정수 1바이트, -128~127
		short d = 32767;		// 정수 2바이트, -32768~32767
		int e = 2100000000;		// 정수 4바이트
		long f = 2200000000L;	// 정수 8바이트, 뒤에 L을 붙혀야 long형이 됨
		float g = 0.2F;			// 실수 4바이트, float형의 값은 뒤에 F를 붙혀야 함
		double h = 0.2;			// 실수 8바이트
		System.out.println("boolean a : "+a);
		if(a) {
			System.out.println("a의 값은 true입니다");
		}
		System.out.println("char b : "+b);
		System.out.println("byte c : "+c);
		System.out.println("short d : "+d);
		System.out.println("int e : "+e);
		System.out.println("long f : "+f);
		
		System.out.println("float g : "+g);	// float끼리는 오차값이 같아서 같게 나옴
		System.out.println("double h : "+h);
		if(c==d) {
			System.out.println("byte(1) == short(2)");
		}
		if(d==e) {
			System.out.println("short(2) == int(4)");
		}
		if(e==f) {
			System.out.println("int(4) == long(8)");
		}
		if(g==h) {	// 대부분 같지 않다고 나옴(오차범위 때문에 절반으로 만들어지는 값만 같음)
			System.out.println("h float(4) == h double(8)");
		}else {
			System.out.println("g float(4) != h double(8)");
		}
		
	}

}
