package chap08.exam;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Vector;

public class Exam12 {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		Scanner sc = new Scanner(System.in);
		InputStreamReader in = null;
		FileInputStream fin = null;
		try {
			System.out.print("대상 파일명 입력>>(c:\\\\Temp\\\\Exam10.java)");
			String p = sc.next();
			fin = new FileInputStream(p);
			in = new InputStreamReader(fin, "MS949");

			int c1;
			String c = "";
			while((c1 = in.read()) != -1){
				if((char)c1 != '\n') {
					c += (char)c1;
					continue;
				}
				v.add(c);
				c = "";
			}
			v.add(c);
			sc.nextLine();
			while(true) {
				System.out.print("검색한 단어나 문장>> ");
				String find = sc.nextLine();
				if(find.contains("그만"))
					break;
				for(int i=0;i<v.size();i++) {
					if(v.get(i).contains(find))
						System.out.println(i+1+""+v.get(i));
				}
			}
			fin.close();
		} catch(IOException e) {
			System.out.println("입출력 오류");
		}
		sc.close();
	}
}