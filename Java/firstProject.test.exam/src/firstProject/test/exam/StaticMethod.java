package firstProject.test.exam;

public class StaticMethod {
	int n;
	void f1(int x) {n = x;}
	void f2(int x) {n = x;}	// new를 사용해야 사용 가능한 것들
	
	static int m;
	static void s1(int x) {
		StaticMethod staticMethod = new StaticMethod();
		staticMethod.n = x;	// 객체를 만들어야 접근 가능해서
	}
	static void s2(int x) {
		StaticMethod staticMethod = new StaticMethod();
		staticMethod.f1(3);	// 객체를 만들어야 접근 가능해서
	}
	static void s3(int x) {m=x;}
	static void s4(int x) {s3(3);}

}
