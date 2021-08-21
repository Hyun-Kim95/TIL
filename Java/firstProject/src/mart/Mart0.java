package mart;

import java.util.Scanner;

class Computer {
	String[] co = new String[10];

	for(
	int i = 0;i<5;i++)
	{
		co[i] = "삼성 i7 200";
	}for(
	int j = 5;i<10;j++)
	{
		co[j] = "LG i5 150";
	}
}

class Aircon {

}

class Fresh {

}

class Clean {

}

class Mart {
	Computer[] com;
	Aircon[] air;
	Fresh[] fre;
	Clean[] cle;
}

class Buyer {
	Mart[] bag;
	int money;

	public Buyer(int money) {
		this.money = money;
	}

	public void buy(int a, int b) {
		switch (a) {
		case 1:
		case 2:
		case 3:
		case 4:
		default:
			System.out.println("제대로 입력해주세요.");
		}
	}
}

public class Mart0 {
	static Buyer[] b;
	static Scanner sc;
	
	static void shopping(Buyer bu) {
		int a = sc.nextInt();
		System.out.println("제조사 및 사양을 선택해주세요 1.삼성(i7) 2.LG(i5)");
		int b = sc.nextInt();
		bu.buy(a,b);
	}
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		b = new Buyer[3];
		for(int i=0;i<3;i++) {
			System.out.print(i+1+"번 소비자의 돈을 입력하세요 : ");
			b[i] = new Buyer(sc.nextInt());
		}
		while(true) {
			for(int i=0;i<3;i++) {
				System.out.println(i+1+"번 소비자 상품을 선택해 주세요 1.컴퓨터 2.에어컨 3.냉장고 4.공기청정기");
				shopping(b[i]);
			}
		}
	}
}