package firstProject.test;

import java.util.Scanner;

public class Hello4 {
	public static void main(String[] args) {
		//������
		//���ǹ� 1�� ���
		int i = 2;
		int j = 1;
		while(i<=9) {
			System.out.print(i+" x "+j+" = "+ i*j);
			j++;
			System.out.println();
			if(j>9) {
				j = 1;
				i++;
				System.out.println();
			}
		}
		//���ǹ� 2�� ���
		i = 2;
		j = 1;
		while(true) {
			System.out.print(i+" x "+j+" = "+ i*j);
			j++;
			System.out.println();
			if(j>9) {
				j = 1;
				i++;
				System.out.println();
			}
			if(i>9) break;
		}
		//���ǹ� 0�� ���
		i = 2;
		j = 1;
		for(i=2;i<=9;) {
			System.out.println(i+" x "+j+" = "+ i*j);
			i = i + j/9;
			j %=9;
			j++;
		}
		
		//a,b �ٲٱ�
		int a =10;
		int b =20;
		int c = 0;
		//ù��° ���
		System.out.println("a:"+a+",b:"+b);
		c = a;
		a = b;
		b = c;
		System.out.println("a:"+a+",b:"+b);
		//�ι�° ���
		a = a + b;
		b = a-b;
		a = a - b;
		System.out.println("a:"+a+",b:"+b);
		
		// ����������
		Scanner scan = new Scanner(System.in);
		System.out.println("0:����,1:����,2:��");
		System.out.println("A��B�� ���ڸ� ����� �Է��ϼ���.");
		int A = scan.nextInt();
		int B = scan.nextInt();
		//ù��° ���
		if(A==B) {
			System.out.println("�����ϴ�");
		}else if((A==0&&B==1)||(A==1&&B==2)||(A==2&&B==0)) {
			System.out.println("B�� �̰���ϴ�.");
		}else {
			System.out.println("A�� �̰���ϴ�.");
		}
		//�ι�° ���
		if(A-B==0) {
			System.out.println("�����ϴ�");
		}else if(((B-A)==1)||(B-A==-2)) {
			System.out.println("B�� �̰���ϴ�.");
		}else {
			System.out.println("A�� �̰���ϴ�.");
		}
		//�ִ�����
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		int chk = (number1>number2)?number2:number1;
		//ù��° ���
		while(true) {
			if(number1 % chk == 0) {
				if(number1%chk == 0) {
					System.out.println(chk);
					break;
				}
				chk -= 1;
			}
			chk -= 1;
		}
		//�ι�° ���
		int yak = 2;
		int count = 1;
		int check = 0;
		while(true) {
			if(number1%yak == 0 && number2%yak == 0) {
				number1 /= yak;
				number2 /= yak;
				count *= yak;
				check = 0;
			}else {
				yak++;
			}
			if(number1 < yak || number2 < yak) {
				if(check == 1) {
					break;
				} else {
					yak = 2;
					check = 1;
				}
			}
		}
		System.out.println(count);
	}
}
