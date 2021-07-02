package firstProject.test;

public class NumException {

	public static void main(String[] args) {
		int a[];	// 참조 데이터 타입
		// String 은 참조 데이터 타입
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		System.out.println("str1: "+str1);
		System.out.println("str2: "+str2);
		System.out.println("str3: "+str3);
		str3 = str1;	// str1의 주소를 옮겨 줌으로서 str3는 str1과 주소를 같이 갖게 됨
		String[] stringNumber = {"23", "12", "3.141592", "998"};
		int i=0;
		for(i=0;i<stringNumber.length;i++) {
			try {
				int j = Integer.parseInt(stringNumber[i]);
				System.out.println("정수로 변환된 값은 : "+j);
			}catch(NumberFormatException e) {
				System.out.println(stringNumber[i]+"는 정수로 변환할 수 없습니다.");
			}
		}
	}
	public static void f01() {
		String[] stringNumber = {"23", "12", "3.141592", "998"};
		int i=0;
		for(i=0;i<stringNumber.length;i++) {
			try {
				int j = Integer.parseInt(stringNumber[i]);//String을 정수로 바꿔줌
				System.out.println("정수로 변환된 값은 : "+j);
			}catch(NumberFormatException e) {
				System.out.println(stringNumber[i]+"는 정수로 변환할 수 없습니다.");
			}
		}
	}
}
