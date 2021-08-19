package mart;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

class human{
	ArrayList<String> h;
	int money;
	public human(int money) {
		this.money = money;
	}
}
public class Mart {
	static HashMap<String,Integer> mart = new HashMap<>();
	
	static HashMap<String, Integer> h1 = new HashMap<>();
	static HashMap<String, Integer> h2 = new HashMap<>();
	static HashMap<String, Integer> h3 = new HashMap<>();
	
	static Scanner sc = new Scanner(System.in);
	public void ready() {
		mart.put("컴퓨터삼성(i7)", 205);
		mart.put("컴퓨터LG(i5)", 155);
		mart.put("에어컨삼성(벽걸이)", 105);
		mart.put("에어컨LG(스탠드)", 105);
		mart.put("냉장고삼성(양문,600L)",205);
		mart.put("냉장고삼성(4도어,800L)",355);
		mart.put("공기청정기LG",85);
		mart.put("공기청정기다이슨",65);
		buyer();
	}
	public void buyer() {
		System.out.println("첫번째 소비자의 돈을 입력하세요.");
		h1.put("money", sc.nextInt());
		System.out.println("두번째 소비자의 돈을 입력하세요.");
		h2.put("money", sc.nextInt());
		System.out.println("세번째 소비자의 돈을 입력하세요.");
		h3.put("money", sc.nextInt());
		run();
	}
	public void run() {
		System.out.println("마트게임 시작");
		while(h1.get("money") >= 60) {
			buy();
		}
		while(h2.get("money") >= 60) {
			buy();
		}
		while(h3.get("money") >= 60) {
			buy();
		}
	}
	public void buy() {
		System.out.println("상품을 선택해주세요(1.컴퓨터, 2.에어콘, 3.냉장고, 4.공기청정기)");
		int a = sc.nextInt();
		switch(a) {
		case 1:
			System.out.println("제조사를 선택해주세요.(1.삼성(i7), 2.LG(i5))");
			int b = sc.nextInt();
			if(b==1 && mart.get("컴퓨터삼성(i7)")%10 !=0) {
				h1.put("money", h1.get("money")-mart.get("컴퓨터삼성(i7)")/10*10);
				try {
					h1.put("컴퓨터삼성(i7)", h1.get("컴퓨터삼성(i7)")+1);
				} catch(Exception e) {
					h1.put("컴퓨터삼성(i7)", 1);
				}
				mart.put("컴퓨터삼성(i7)", mart.get("컴퓨터삼성(i7)")-1);
			}
			else if(b==2 && mart.get("컴퓨터LG(i5)")%10 !=0) {
				h1.put("money", h1.get("money")-mart.get("컴퓨터LG(i5)")/10*10);
				try {
					h1.put("컴퓨터LG(i5)", h1.get("컴퓨터LG(i5)")+1);
				} catch(Exception e) {
					h1.put("컴퓨터LG(i5)", 1);
				}
				mart.put("컴퓨터LG(i5)", mart.get("컴퓨터LG(i5)")-1);
			}
			else
				System.out.println("제대로 입력해주세요!");
			break;
		case 2: 
			System.out.println("제조사를 선택해주세요.(1.삼성벽걸이, 2.LG스탠드)");
			b = sc.nextInt();
			if(b==1 && mart.get("에어컨삼성(벽걸이)")%10 !=0) {
				h1.put("money", h1.get("money")-mart.get("에어컨삼성(벽걸이)")/10*10);
				try {
					h1.put("에어컨삼성(벽걸이)", h1.get("에어컨삼성(벽걸이)")+1);
				} catch(Exception e) {
					h1.put("에어컨삼성(벽걸이)", 1);
				}
				mart.put("에어컨삼성(벽걸이)", mart.get("에어컨삼성(벽걸이)")-1);
			}
			else if(b==2 && mart.get("에어컨LG(스탠드)")%10 !=0) {
				h1.put("money", h1.get("money")-mart.get("에어컨LG(스탠드)")/10*10);
				try {
					h1.put("에어컨LG(스탠드)", h1.get("에어컨LG(스탠드)")+1);
				} catch(Exception e) {
					h1.put("에어컨LG(스탠드)", 1);
				}
				mart.put("에어컨LG(스탠드)", mart.get("에어컨LG(스탠드)")-1);
			}
			else
				System.out.println("제대로 입력해주세요!");
			break;
		case 3: System.out.println("제조사를 선택해주세요.(1.삼성, 2.LG)");
		case 4: System.out.println("제조사를 선택해주세요.(1.LG, 2.다이슨)");
			default: System.out.println("제대로 입력해주세요!");
		}
	}
	public static void main(String[] args) {
		Mart m = new Mart();
		
		m.ready();

	}

}
