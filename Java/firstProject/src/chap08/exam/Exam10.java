package chap08.exam;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> h = new HashMap<>();
		InputStreamReader in = null;
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("c:\\Temp\\phone.txt");
			in = new InputStreamReader(fin, "MS949");
			int c;
			String name = "";
			String num = "";
			int i =0;

			while((c = in.read()) != -1) {
				if((char)c == ' ') {
					i = 1;
					continue;
				}
				if((char)c == '\n') {
					h.put(name, num);
					i = 0;
					name = "";
					num = "";
					continue;
				}
				if(i == 0) {
					name += (char)c;
				}else {
					num += (char)c;
				}
			}
			h.put(name, num);
			System.out.println("총 "+h.size()+"개의 전화번호를 읽었습니다.");
			while(true) {
				System.out.print("이름>> ");
				String user = sc.next();
				if(user.contains("그만"))
					break;
				if(h.get(user) == null)
					System.out.println("찾는 이름이 없습니다.");
				else
					System.out.println(h.get(user));
			}
			in.close();
			fin.close();
		} catch(IOException e) {
			System.out.println("입출력 오류");
		}
		sc.close();
	}
}