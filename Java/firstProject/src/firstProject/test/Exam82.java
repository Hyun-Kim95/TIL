package firstProject.test;

import java.util.Scanner;

public class Exam82 {
	// ����> 5�ڸ� ���ڸ� �Է¹޾Ƽ� �� �ڸ� ���� ���ڸ� ����Ͻÿ�.
	// �Է� ��> 12345
	// ��� ��> 1�� 2õ 3�� 4�� 5��
	public static void main(String[] args) {
		// ���� ��������
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		int time = scan.nextInt();
		int second = time%60;
		int minute = (time/60)%60;
		int hour = (time/60)/60;
		System.out.print(time+"�ʴ� ");
		System.out.print(hour+"�ð�, ");
		System.out.print(minute+"��, ");
		System.out.println(second+"���Դϴ�.");
		
		// ������ ��������
		System.out.println("5�ڸ� ������ �Է��ϼ���.");
		int num = scan.nextInt();
		int man = num/10000;
		int chun = (num/1000)%10;
		int baek = (num/100)%10;
		int sip = (num/10)%10;
		int il = (num%10);
		System.out.println(man+"�� "+chun+"õ "+baek+"�� "+sip+"�� "+il+"��");
		
		//������ ��������(for��+�迭)
		System.out.println("5�ڸ� ������ �Է��ϼ���.");
		int num1 = scan.nextInt();
		int[] a = {10000,1000,100,10,1};
		String[] b = {"��","õ","��","��","��"};
		for(int i=0;i<5;i++) {
			System.out.print(num1/a[i] + b[i]+" ");
			num1 %= a[i]; 
		}
		
		scan.close();
	}

}
