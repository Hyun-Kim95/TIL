package firstProject.test;

public class Hello {

	public static void main(String[] args) {
		final int a = 10;	// final을 붙히면 상수가 됨
							// 값으로 들어간 10 이라는 이름이 따로 없는 값을 리터럴 이라고 함
		// a= 20;	// 에러
		double e = 1234E-4;	// 1234 * 10^-4 즉, 0.1234 와 같음
		var price = 200;	// var 키워드를 사용하면 타입이 자동으로 결정됨
	}

}
