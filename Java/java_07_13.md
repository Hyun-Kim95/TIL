### static

* static 함수에서는 this를 사용할 수 없음
  * StaticAndThis staticAndThis = new StaticAndThis();
  * staticAndThis.n = x;
  * 이렇게 객체를 만들어 사용해야 함
* static 변수에서는 this 보다 클래스명으로 접근이 바람직함
  * StaticAndThis.m = x;

### final

* 변경불가(상수)
* 상수명 전부 대문자로 작성하는게 관례

### 생성자

* 우클릭 -> Source -> Generate Constructor using Fields...
  * 자동으로 생성자를 만들어줌

### list.contains(str)

* str이 들어 있는지 확인해서 true, false 중에 반환해줌

### a.equals(b)

* a와 b가 같은지 확인

## 종합코드

```java
package firstProject.test.exam;

import java.util.Scanner;

public class Exam12 {
	Scanner sc = new Scanner(System.in);
	String S[];
	String A[];
	String B[];
	String[][] K = {S,A,B};
	String[] k = {"S","A","B"};
	boolean a = true;
	
	public Exam12(String[][] k) {
		super();
		this.K = k;
	}
	boolean input() {
		System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >>");
		int x = sc.nextInt();
		if(x==1)
			reserve();
		else if(x==2)
			view();
		else if(x==3)
			cancel();
		else
			finish();
		return this.a;
	}
	void reserve() {
		System.out.print("좌석구분 S(1), A(2), B(3) >>");
		int y = sc.nextInt();
		System.out.printf("%s>> ",this.k[y-1]);
		for(int i=0;i<10;i++) System.out.print(this.K[y-1][i]+" ");
		System.out.println();
		System.out.print("이름>>");
		String name = sc.next();
		System.out.print("번호>>");
		int num = sc.nextInt();
		this.K[y-1][num-1] = name;
	}
	void view() {
		for(int j=0;j<3;j++) {
			System.out.printf("%s>> ",this.k[j]);
			for(int i=0;i<10;i++) System.out.print(this.K[j][i]+" ");
			System.out.println();
		}
		System.out.println("<<<조회를 완료하였습니다.>>>");
	}
	void cancel() {
		System.out.print("좌석 S:1, A:2, B:3 >>");
		int chk =sc.nextInt();
		System.out.printf("%s>> ",this.k[chk-1]);
		for(int i=0;i<10;i++) System.out.print(this.K[chk-1][i]+" ");
		System.out.println();		
		System.out.print("이름>>");
		String name1 = sc.next();
		for(int j=0;j<10;j++) {
			if(this.K[chk-1][j].contains(name1))
				this.K[chk-1][j] = "---";
		}
	}
	boolean finish() {
		this.a = false;
		return this.a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S[] = {"---","---","---","---","---","---","---","---","---","---"};
		String A[] = {"---","---","---","---","---","---","---","---","---","---"};
		String B[] = {"---","---","---","---","---","---","---","---","---","---"};
		String[][] K = {S,A,B};
		Exam12 e = new Exam12(K);
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		while(e.a) {
			e.input();
		}
	}
}
```

