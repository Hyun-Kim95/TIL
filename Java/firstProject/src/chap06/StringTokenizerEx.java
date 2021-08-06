package chap06;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		String s = "aaa,bbb,ccc";
		s.split(",");	// 문자열을 잘라서 String 배열로 리턴
		StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐","/");// 잘라서 토큰으로 관리
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		String query = "name=kitae&addr=seoul*age=21";
		StringTokenizer st2 = new StringTokenizer(query, "&");
		int n = st2.countTokens();
		System.out.println("token 개수="+n);
		for(int i = 0;i<n;i++) {
			String token = st2.nextToken();
			System.out.println(token);
		}
	}
}