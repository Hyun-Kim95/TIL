package firstProject.test;

public class Hello2 {

	public static void main(String[] args) {
		System.out.println("Hello2 main start");
		// �⺻ ������ Ÿ��(+�ʱ�ȭ)
		boolean a = true;
		char b = 65;			// �ƽ�Ű�ڵ� �� A
		byte c = 127;			// ���� 1����Ʈ, -128~127
		short d = 32767;		// ���� 2����Ʈ, -32768~32767
		int e = 2100000000;		// ���� 4����Ʈ
		long f = 2200000000L;	// ���� 8����Ʈ, �ڿ� L�� ������ long���� ��
		float g = 0.2F;			// �Ǽ� 4����Ʈ, float���� ���� �ڿ� F�� ������ ��
		double h = 0.2;			// �Ǽ� 8����Ʈ
		System.out.println("boolean a : "+a);
		if(a) {
			System.out.println("a�� ���� true�Դϴ�");
		}
		System.out.println("char b : "+b);
		System.out.println("byte c : "+c);
		System.out.println("short d : "+d);
		System.out.println("int e : "+e);
		System.out.println("long f : "+f);
		
		System.out.println("float g : "+g);	// float������ �������� ���Ƽ� ���� ����
		System.out.println("double h : "+h);
		if(c==d) {
			System.out.println("byte(1) == short(2)");
		}
		if(d==e) {
			System.out.println("short(2) == int(4)");
		}
		if(e==f) {
			System.out.println("int(4) == long(8)");
		}
		if(g==h) {	// ��κ� ���� �ʴٰ� ����(�������� ������ �������� ��������� ���� ����)
			System.out.println("h float(4) == h double(8)");
		}else {
			System.out.println("g float(4) != h double(8)");
		}
		
	}

}
