package mart;

import java.util.Scanner;

abstract class Appliances {
	public abstract void useAppliances();
}

class Computer0 extends Appliances {
	String company;
	String type;
	int price;

	public Computer0(String company, String type, int price) {
		this.company = company;
		this.type = type;
		this.price = price;
	}

	public String getcompany() {
		return company;
	}

	public String gettype() {
		return type;
	}

	public int getprice() {
		return price;
	}

	@Override
	public void useAppliances() {
		System.out.println("제조사가 " + company + "인 " + type + "컴퓨터를 사용한다");
	}
}

class Aircleaner extends Appliances {
	String company;
	int price;

	public Aircleaner(String company, int price) {
		super();
		this.company = company;
		this.price = price;
	}

	public String getcompany() {
		return company;
	}

	public int getprice() {
		return price;
	}

	@Override
	public void useAppliances() {
		System.out.println("제조사가 " + company + "인 " + "공기청정기가 공기를 깨끗하게 한다 ");
	}
}

class Airconditioner extends Appliances {
	String company;
	String type;
	int price;

	public Airconditioner(String company, String type, int price) {
		super();
		this.company = company;
		this.type = type;
		this.price = price;
	}

	public String getcompany() {
		return company;
	}

	public String gettype() {
		return type;
	}

	public int getprice() {
		return price;
	}

	@Override
	public void useAppliances() {
		System.out.println("제조사가 " + company + "인 " + type + "에어콘을 사용한다");
	}
}

class Refrigerator extends Appliances {
	String company;
	String type;
	String capacity;
	int price;

	public Refrigerator(String company, String type, String capacity, int price) {
		super();
		this.company = company;
		this.type = type;
		this.capacity = capacity;
		this.price = price;
	}

	public String getcompany() {
		return company;
	}

	public String gettype() {
		return type;
	}

	public int getprice() {
		return price;
	}

	@Override
	public void useAppliances() {
		System.out.println("제조사가 " + company + "인 " + type + "형 " + capacity + "냉장고가 식품을 관리한다");
	}
}

class Mart0 {
	static int a = 60;
	private Computer0[] StoredComputer0;
	private Airconditioner[] StoredAirconditioner;
	private Refrigerator[] StoredRefrigerator;
	private Aircleaner[] StoredAircleaner;

	public Mart0() {
		StoredComputer0 = new Computer0[10];
		StoredAirconditioner = new Airconditioner[10];
		StoredRefrigerator = new Refrigerator[10];
		StoredAircleaner = new Aircleaner[10];
	}

	public void ready() {
		for (int i = 0; i < 5; i++) {
			StoredComputer0[i] = new Computer0("삼성", "i7", 200);
			StoredAirconditioner[i] = new Airconditioner("삼성", "벽걸이", 100);
			StoredRefrigerator[i] = new Refrigerator("삼성", "양문", "600L", 200);
			StoredAircleaner[i] = new Aircleaner("LG", 80);
		}
		for (int i = 5; i < 10; i++) {
			StoredComputer0[i] = new Computer0("LG", "i5", 150);
			StoredAirconditioner[i] = new Airconditioner("LG", "스탠드", 250);
			StoredRefrigerator[i] = new Refrigerator("LG", "4도어", "800L", 350);
			StoredAircleaner[i] = new Aircleaner("다이슨", 60);
		}
	}

	public Appliances sellItem(int num, String companyname, Buyer0 guest) {
		Appliances Item;
		switch (num) {
		case 1:
			Item = searchComputer0(companyname, guest);
			break;
		case 2:
			Item = searchAirconditioner(companyname, guest);
			break;
		case 3:
			Item = searchRefrigerator(companyname, guest);
			break;
		case 4:
			Item = searchAircleaner(companyname, guest);
			break;
		default:
			Item = null;
			break;
		}
		return Item;
	}

	private Appliances searchComputer0(String companyname, Buyer0 guest) {
		Appliances Item;
		for (int i = 0; i < StoredComputer0.length; i++) {
			try
			{
				if (StoredComputer0[i].getcompany().equals(companyname)) {
					if (guest.getMoney() < StoredComputer0[i].getprice()) {
						return null;
					}
					else {
						Item = StoredComputer0[i];
						guest.setMoney(guest.getMoney() - StoredComputer0[i].getprice());
						StoredComputer0[i] = null;
						return Item;
					}
				}
			} catch (Exception E) {}
		}
		return null;
	}

	private Appliances searchAirconditioner(String companyname, Buyer0 guest) {
		Appliances Item;
		for (int i = 0; i < StoredAirconditioner.length; i++) {
			try
			{
				if (StoredAirconditioner[i].getcompany().equals(companyname)) {
					if (guest.getMoney() < StoredAirconditioner[i].getprice()) {
						return null;
					}
					else {
						Item = StoredAirconditioner[i];
						guest.setMoney(guest.getMoney() - StoredAirconditioner[i].getprice());
						StoredAirconditioner[i] = null;
						if(i == 4)
							Mart0.a = 150;
						return Item;
					}
				}
			} catch (Exception e) {
			}
		}
		return null;
	}

	private Appliances searchRefrigerator(String companyname, Buyer0 guest) {
		Appliances Item;
		for (int i = 0; i < StoredRefrigerator.length; i++) {
			try
			{
				if (StoredRefrigerator[i].getcompany().equals(companyname)) {
					if (guest.getMoney() < StoredRefrigerator[i].getprice()) {
						return null;
					}
					else {
						Item = StoredRefrigerator[i];
						guest.setMoney(guest.getMoney() - StoredRefrigerator[i].getprice());
						StoredRefrigerator[i] = null;
						return Item;
					}

				}
			} catch (Exception e) {
			}
		}
		return null;
	}

	private Appliances searchAircleaner(String companyname, Buyer0 guest) {
		Appliances Item;

		for (int i = 0; i < StoredAircleaner.length; i++) {
			try
			{
				if (StoredAircleaner[i].getcompany().equals(companyname)) {
					if (guest.getMoney() < StoredAircleaner[i].getprice()) {
						return null;
					}
					else {
						Item = StoredAircleaner[i];
						guest.setMoney(guest.getMoney() - StoredAircleaner[i].getprice());
						StoredAircleaner[i] = null;
						if(i == 4)
							Mart0.a = 80;
						else if(i==9)
							Mart0.a = 100;
						return Item;
					}
				}
			} catch (Exception e) {
			}
		}
		return null;
	}
}

class Buyer0 {
	private Appliances[] goods;
	private int money;

	public Buyer0(int money) {
		goods = new Appliances[20];
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int buyItem(Appliances Item) {
		if (Item == null)
			return 0;
		for (int i = 0; i < goods.length; i++) {
			if (goods[i] == null) {
				goods[i] = Item;
				return 1;
			}
		}
		return 1;
	}

	public void showMoney() {
		System.out.println("현재 잔액: " + money);
	}

	public void showAppliances(int index) {
		for (int i = 0; i < goods.length; i++) {
			if (goods[i] != null) {
				System.out.print(index + "번째 소비자가 ");
				goods[i].useAppliances();
			} else
				return;
		}
	}
}

public class Mart0game {
	private static Mart0 mt;
	private static Buyer0[] b;
	private static Scanner sc;

	private static int num;
	private static int companynum;
	private static String companyname;

	public static void main(String[] args) {
		mt = new Mart0();
		b = new Buyer0[3];
		for(int i=0;i<3;i++) {
			System.out.println((i+1)+"번 소비자의 돈을 입력하세요");
			b[i] = new Buyer0(sc.nextInt());
		}
		mt.ready();
		sc = new Scanner(System.in);
		while (true) {
			for (int i = 0; i < b.length; i++) {
				if (b[i].getMoney() < 60)
					continue;
				System.out.println();
				System.out.print(i + 1 + "번 소비자 상품을 선택 해주세요.  현재잔액: ");
				System.out.println(b[i].getMoney());
				System.out.print("1.컴퓨터, 2.에어콘, 3.냉장고, 4.공기청정기 : ");

				num = sc.nextInt();
				if ((num < 1) || (num > 4)) {
					System.out.println();
					System.out.println("잘못된 입력입니다.");
					System.out.println("다음사용자로 넘어갑니다.");
					System.out.println();
					sc.nextLine();
					continue;
				}
				sc.nextLine();
				System.out.println("제조사 및 사양을 선택해주세요");
				switch (num) {
				case 1:
				case 2:
				case 3:
					System.out.print("1.삼성, 2.LG : ");
					break;
				case 4:
					System.out.print("1.LG, 2.다이슨 : ");
					break;
				}
				companynum = sc.nextInt();
				if ((companynum < 1) || (companynum > 2)) {
					System.out.println();
					System.out.println("잘못된 입력입니다.");
					System.out.println("다음사용자로 넘어갑니다.");
					System.out.println();
					sc.nextLine();
					continue;
				}
				sc.nextLine();
				switch (num) {
				case 1:
				case 2:
				case 3:
					if (companynum == 1)
						companyname = "삼성";
					else
						companyname = "LG";
					break;
				case 4:
					if (companynum == 1) {
						companyname = "LG";
					}
					else {
						companyname = "다이슨";
					}
					break;
				}
				
				if(b[i].buyItem(mt.sellItem(num, companyname, b[i])) == 0) {
					System.out.println();
					System.out.println("구매 할 수 없습니다!! ");
					System.out.println("잔액 또는 상품의 재고가 부족합니다");
					System.out.println("다음사용자로 넘어갑니다.");
					System.out.println();
				}
				b[i].showMoney();
			}
			if ((b[0].getMoney() < Mart0.a) && (b[1].getMoney() < Mart0.a) && (b[2].getMoney() < Mart0.a))
				break;
		}
		
		System.out.println("물건 사용");
		b[0].showAppliances(1);
		System.out.println();
		b[1].showAppliances(2);
		System.out.println();
		b[2].showAppliances(3);
	}
}