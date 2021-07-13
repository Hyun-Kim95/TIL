package firstProject.test.exam;

public class StaticAndThis {
	int n;
	static int m;
	void f1(int x) {
		this.n = x;
	}
	void f2(int x) {
		//this.m = x;
		StaticAndThis.m = x;
	}
	static void s1(int x) {
		StaticAndThis staticAndThis = new StaticAndThis();
		staticAndThis.f1(x);	// this를 반드시 사용해야 하면 이렇게 가능
		staticAndThis.n = x;
	}
	static void s2(int x) {
		StaticAndThis.m = x;
	}
}
