package firstProject.test;

public class Hello8 {

	public static void main(String[] args) {
		// 배열 선언하는 방법
		int num[] = new int[10];
		int num2[] = {10,20,30};
		int num3[] = num2;
		for(int i = 0;i<10;i++) {
			num[i] = i+1;
		}
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
		for(int i=0;i<num2.length;i++) {
			System.out.println(num2[i]);
		}
		System.out.println("------------------------------");
		for(int n:num2) {
			System.out.println(n);
		}
		System.out.println("------------------------------");
		for(int n:num3) {
			System.out.println(n);
		}
	}

}
