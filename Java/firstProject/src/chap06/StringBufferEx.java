package chap06;

public class StringBufferEx {

	public static void main(String[] args) {
		// 가변 버퍼(괄호 안에 아무것도 안주면 기본 버퍼크기 16)
		StringBuffer sb = new StringBuffer("This");
		System.out.println("현재 버퍼 크기 : "+sb.capacity());
		
		sb.append(" is pencil");
		System.out.println(sb);
		System.out.println("현재 버퍼 크기 : "+sb.capacity());
		
		sb.insert(7, " my");
		System.out.println(sb);
		System.out.println("현재 버퍼 크기 : "+sb.capacity());
		
		sb.replace(8, 10, "your");
		System.out.println(sb);
		System.out.println("현재 버퍼 크기 : "+sb.capacity());
		
		sb.delete(8, 13);
		System.out.println(sb);
		System.out.println("현재 버퍼 크기 : "+sb.capacity());
		
		sb.setLength(4);
		System.out.println(sb);
		System.out.println("현재 버퍼 크기 : "+sb.capacity());
		System.out.println("sb.reverse() : "+sb.reverse());
	}

}
