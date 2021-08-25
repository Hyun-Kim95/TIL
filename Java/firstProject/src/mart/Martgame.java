package mart;

import java.util.Scanner;

class Computer {
	String[] co = new String[10];

	public Computer() {
		for (int i = 0; i < 5; i++)
			co[i] = "삼성 i7 200";
		for (int i = 5; i < 10; i++)
			co[i] = "LG i5 150";
	}
}

class Aircon {
	String[] ai = new String[10];

	public Aircon() {
		for (int i = 0; i < 5; i++)
			ai[i] = "삼성 벽걸이 100";
		for (int i = 5; i < 10; i++)
			ai[i] = "LG 스탠드 250";
	}
}

class Fresh {
	String[] fr = new String[10];

	public Fresh() {
		for (int i = 0; i < 5; i++)
			fr[i] = "삼성 양문 600L 200";
		for (int i = 5; i < 10; i++)
			fr[i] = "LG 4도어 800L 350";
	}
}

class Clean {
	String[] cl = new String[10];

	public Clean() {
		for (int i = 0; i < 5; i++)
			cl[i] = "LG 80";
		for (int i = 5; i < 10; i++)
			cl[i] = "다이슨 60";
	}
}

class Mart {
	static Scanner sc;
	static Computer co;
	static Aircon ai;
	static Fresh fr;
	static Clean cl;

	public Mart() {
		sc = new Scanner(System.in);
		co = new Computer();
		ai = new Aircon();
		fr = new Fresh();
		cl = new Clean();
	}

	public void shopping(Buyer bu) {
		System.out.println("번 소비자님 상품을 선택해 주세요 1.컴퓨터 2.에어컨 3.냉장고 4.공기청정기");
		int a = sc.nextInt();
		switch (a) {
		case 1:
		case 2:
		case 3:
			System.out.println("제조사를 선택해주세요 1.삼성 2.LG");
			break;
		case 4:
			System.out.println("제조사를 선택해주세요 1.LG 2.다이슨");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}
		if (a > 4 || a < 1)
			return;
		int b = sc.nextInt();
		if (b < 1 || b > 2) {
			System.out.println("잘못된 입력입니다.");
			return;
		}

		bu.buy(a, b);
	}
}

class Buyer {
	String[] bag;
	int money;

	public Buyer(int money) {
		this.money = money;
		bag = new String[20];
	}

	public void buy(int a, int b) {
		switch (a) {
		case 1:
			goods("Computer ", Mart.co.co, b);
			break;
		case 2:
			goods("Aircon ", Mart.ai.ai, b);
			break;
		case 3:
			goods("Fresh ", Mart.fr.fr, b);
			break;
		case 4:
			goods("Clean ", Mart.cl.cl, b);
			break;
		default:
			System.out.println("제대로 입력해주세요.");
		}
	}

	public void goods(String k, String[] a, int b) {
		for (int i = 0; i < 20; i++) {
			if (bag[i] == null) {
				if (b == 1) {
					for (int j = 0; j < 5; j++) {
						if (a[j] != null) {
							bag[i] = k + a[j];
							String[] aj = a[j].split(" ");
							if (Integer.parseInt(aj[aj.length - 1]) > money) {
								System.out.println("금액이 부족합니다.");
								break;
							}
							money -= Integer.parseInt(aj[aj.length - 1]);
							a[j] = null;
							break;
						}
						if (j == 4) {
							System.out.println("상품이 없습니다.");
							break;
						}
					}
				} else {
					for (int j = 5; j < 10; j++) {
						if (a[j] != null) {
							bag[i] = k + a[j];
							String[] aj = a[j].split(" ");
							if (Integer.parseInt(aj[aj.length - 1]) > money) {
								System.out.println("금액이 부족합니다.");
								break;
							}
							money -= Integer.parseInt(aj[aj.length - 1]);
							a[j] = null;
							break;
						}
						if (j == 9) {
							System.out.println("상품이 없습니다.");
							break;
						}
					}
				}
				System.out.println("남은 금액: " + money);
				break;
			}
		}
	}

	public void use(int num) {
		for (int i = 0; i < 20; i++) {
			if (bag[i] == null)
				break;
			System.out.print(num + "번 소비자가 ");
			String[] k = bag[i].split(" ");
			switch (k[0]) {
			case "Computer":
				System.out.println("제조사가 " + k[1] + "인 " + k[2] + "컴퓨터를 사용한다");
				break;
			case "Aircon":
				System.out.println("제조사가 " + k[1] + "인 " + k[2] + "에어콘을 사용한다");
				break;
			case "Fresh":
				System.out.println("제조사가 " + k[1] + "인 " + k[2] + "형 " + k[3] + "냉장고가 식품을 관리한다");
				break;
			case "Clean":
				System.out.println("제조사가 " + k[1] + "인 공기청정기가 공기를 깨끗하게 한다");
			}
		}
	}
}

public class Martgame {
	static Scanner sc;
	static Buyer[] b;
	static Mart m = new Mart();

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		b = new Buyer[3];
		System.out.println("마트게임 시작");
		for (int i = 0; i < 3; i++) {
			System.out.print(i + 1 + "번 소비자의 돈을 입력하세요 : ");
			b[i] = new Buyer(sc.nextInt());
		}
		while (true) {
			for (int i = 0; i < b.length; i++) {
				if (b[i].money < 60)
					continue;
				System.out.print(i + 1);
				m.shopping(b[i]);
			}
			if (b[0].money < 60 && b[1].money < 60 && b[2].money < 60) {
				break;
			}
		}
		for (int j = 0; j < 3; j++) {
			b[j].use(j + 1);
			System.out.println();
		}
		System.out.println("마트게임 종료");
	}
}