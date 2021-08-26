package chap08.exam;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileInputStream fin1 = null;
		FileInputStream fin2 = null;
		InputStreamReader in1 = null;
		InputStreamReader in2 = null;
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		try {
			System.out.println("첫번째 파일 이름을 입력하세요>>(c:\\\\Temp\\\\test.txt)");
			String p1 = sc.next();
			System.out.println("두번째 파일 이름을 입력하세요>>(c:\\\\Temp\\\\test2.txt)");
			String p2 = sc.next();
			fin1 = new FileInputStream(p1);
			fin2 = new FileInputStream(p2);
			in1 = new InputStreamReader(fin1, "MS949");
			in2 = new InputStreamReader(fin2, "MS949");
			System.out.println(p1+"와 "+p2+"를 비교합니다.");

			int c1,c2 = 0,cnt=0;

			while((c1 = in1.read()) != -1 || c2 != -1){
				c2 = in2.read();
				if(c1 != c2) {
					cnt++;
				}
			}
			if(cnt == 0)
				System.out.println("파일이 같습니다.");
			else
				System.out.println("파일이 서로 다릅니다.");
			fin1.close();
			fin2.close();
		} catch(IOException e) {
			System.out.println("입출력 오류");
		}
		sc.close();
	}
}