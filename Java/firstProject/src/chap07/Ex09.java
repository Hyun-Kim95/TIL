package chap07;

public class Ex09 {
	public static void main(String[] args) {
		IStack<Integer> stack = new MyStack_<Integer>();
		for(int i=0;i<10;i++) stack.push(i);	// 10개의 정수 푸쉬
		while(true) {	// 스택이 빌 때까지 pop
			Integer n = stack.pop();
			if(n==null) break;	// 스택이 빈 경우
			System.out.print(n+" ");
		}
	}
}