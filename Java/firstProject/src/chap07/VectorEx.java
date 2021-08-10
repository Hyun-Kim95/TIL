package chap07;

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();	// 정수 값만 다루는 벡터 생성
		v.add(Integer.valueOf(5));	// 5 삽입
		v.add(4);	// 4 삽입		자동박싱(Integer 값으로 자동변경)
		v.add(-1);	// -1삽입
		//v.add(10.2)	// 제네릭에 의해 다른 타입의 데이터는 입력 불가
		
		// 벡터 중간에 삽입
		v.add(2,100);	// 4와 -1 사이에 정수 100 삽입
		
		System.out.println("벡터 내의 요소 객체 수: "+v.size());	// 크기 3
		System.out.println("벡터의 현재 용량: "+v.capacity());	// 벡터 용량 10
		
		// 모든 요소 정수 출력하기
		for(int i=0;i<v.size();i++) {
			int n = v.get(i);			// 벡터의 i번째 정수	자동언박식
			System.out.println(n);
		}
		
		// 벡터 속의 모든 정수 더하기
		int sum = 0;
		for(int i=0;i<v.size();i++) {
			int n = v.elementAt(i);		// 벡터의 i번째 정수
			sum += n;
		}
		System.out.println("벡터에 있는 정수 합: "+sum);
		Integer obj = v.get(1);
		System.out.println(obj.intValue());
		System.out.println(v.get(1));
		v.remove(1);
		System.out.println(v);
		System.out.println("firstElement :"+v.firstElement());
		System.out.println("lastElement : "+v.lastElement());
	}
}