package firstProject.test;

import java.util.Scanner;

public class Hello3 {

	public static void main(String[] args) {
		// System.in: ǥ�� �Է�,	System.out: ǥ�� ���
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();		// �������� Ű���� �Է� �����
		// scan.next �� ���� ������ �̿ܿ��� ���������� ���� �� ����
		System.out.println("�Է��� ����: "+a);
		//scan.next();	// ������ �������� �ʰ� ������ ���� �ι��ڸ� �׳� ��������
		String str = scan.next();//���⸦ �������� �޾Ƽ� ���� �ι��� ���ִ°� �ʿ����
		//�����Է� �ٷ� �ڿ� ������ ���ڸ� �Է¹ް� ��������(������ ���͸� �Է����� �޾Ƽ�)
		System.out.println("�Է��� ���ڿ�: "+str);
		//abc def �̷��� �Է��ϸ� abc�� ��µǰ� def�� ���ۿ� �����ְ� ��
		scan.close();// ���� scan�� ������� �ʰڴٴ� �ǹ�(�Ƚᵵ ������ �ȶ�)
	}

}
