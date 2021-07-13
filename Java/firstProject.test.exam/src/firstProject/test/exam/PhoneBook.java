package firstProject.test.exam;

import java.util.Scanner;
class phone{
	String[] name;
	String[] tel;
	public phone(String[] name, String[] tel) {
		super();
		this.name = name;
		this.tel = tel;
	}
	
}
public class PhoneBook {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수 >>");
		int num = sc.nextInt();
		String[] name  = new String[num];
		String[] tel  = new String[num];
		phone p = new phone(name, tel);
		for(int i=0;i<num;i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			p.name[i] = sc.next();
			p.tel[i] = sc.next();
		}
		
		System.out.println("저장되었습니다...");
		while(true) {
			System.out.print("검색할 이름>>");
			String name1 = sc.next();
			
			if(name1.contains("그만"))
				break;
			else {
				int cnt = 0;
				for(int i=0;i<num;i++) {
					if(p.name[i].contains(name1)) {
						cnt = i+1;
					}
				}
				if(cnt != 0) {
					System.out.printf("%s의 번호는 %s 입니다\n",name1,p.tel[cnt-1]);
				}
				else {
					System.out.printf("%s이 없습니다\n",name1);
				}
			}
		}
		sc.close();
	}
}
