package chap05.abs;

public abstract class Calculator {
	public static final int ABC = 10;	// 상수
	public int def = 10;
	abstract public int add(int a, int b);		// 두 정수의 합을 리턴	// abstract위치는 여기도 됨
	public abstract int subtract(int a, int b);	// 두 정수의 차를 리턴
	public abstract double average(int[] a);	// 배열에 저장된 정수의 평균 리턴
	void print() {
		
	}
}