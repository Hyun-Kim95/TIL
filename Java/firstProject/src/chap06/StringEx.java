package chap06;

public class StringEx {
	public static void main(String[] args) {
		String java = "java";
		String cpp = "c++";
		int res = java.compareTo(cpp);	// 크기 비교(알파벳 순서)
		System.out.println("java.compareTo(cpp) : "+res);
		if(res == 0) 		System.out.println("the same");
		else if(res < 0)	System.out.println(java+" < "+cpp);
		else 				System.out.println(java+" > "+cpp);
		
		System.out.println("'I love.concat('java.') : "+"I love".concat("java."));	// 합쳐진 새로운 녀석을 만듬
		
		String a = "    abcd    def    ";
		String b = "       xyz\t1111";
		String c = a.trim();	// 양끝 공백 제거
		String d = b.trim();
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);
		System.out.println("d : "+d);
		
		String e = "class";
		System.out.println("'class'.charAt(2) : "+e.charAt(2));
		
		String a1 = new String(" C# C# C#");
		String b1 = new String(", C++, aa, bb, cc");
		System.out.println("b1 : "+b1);
		System.out.println(a1+"의 길이는 "+a1.length());
		System.out.println("a1.contains('#') : "+a1.contains("#"));
		a1 = a1.concat(b1);
		System.out.println("a1.concat(b1) : "+a1);
		
		a1 = a1.trim();
		System.out.println("a1.trim() : "+a1);
		
		a1 = a1.replace("C#", "Java");
		System.out.println("a1.replace('C#','Java') : "+a1);
		
		String s[] = a1.split(",");
		for(int i = 0; i<s.length;i++) {
			System.out.println("분리된 문자열 "+i+" : "+s[i] );
		}
		a1 = a1.substring(5);
		System.out.println("a1.substring(5) : "+a1);
		
		char c1 = a1.charAt(2);
		System.out.println(c1);
		
		String s2 = "AbCDEFg";
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toUpperCase());
	}
}