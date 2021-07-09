package firstProject.test;	// 접근 지정자

import sample.Sample;	// sample패키지의 Sample 클래스를 import

public class AccessEx {
	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.a = 10;
		//sample.b = 10;	// error	private
		sample.setB(10);
		//sample.c = 10;	// error	default
		sample.setA(10);
	}
}
