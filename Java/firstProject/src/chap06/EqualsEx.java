package chap06;

public class EqualsEx {
	public static void main(String[] args) {
		Point a = new Point(2,3);
		Point b = new Point(2,3);
		Point c = new Point(3,4);
		Point d = c;
		
		System.out.println("a : "+a.toString()+
				", hash : "+Integer.toHexString(a.hashCode()));
		System.out.println("b : "+b.toString()+
				", hash : "+Integer.toHexString(b.hashCode()));
		System.out.println("c : "+c.toString()+
				", hash : "+Integer.toHexString(c.hashCode()));
		System.out.println("d : "+d.toString()+
				", hash : "+Integer.toHexString(d.hashCode()));
		
		if(a == b) 		System.out.println("a==b");	// 객체가 같은지 확인
		if(c == d) 		System.out.println("c==d");
		if(a.equals(b)) System.out.println("a is equla to b");	// 값이 같은지 확인
		if(a.equals(c)) System.out.println("a is equal to c");
		if(d.equals(c)) System.out.println("d is equal to c");
	}
}