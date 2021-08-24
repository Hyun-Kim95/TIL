package chap08;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// file에 글 써줌
		FileWriter fout = null;
		try {
			// 파일과 연결된 출력 문자 스트림 생성
			fout = new FileWriter("c:\\Temp\\test.txt");
			while(true) {
				// 한줄 읽기(line에는 '\n'이 들어가지 않음
				String line = scanner.nextLine();
				// 한 줄에 <Enter> 키만 입력한 경우
				if(line.length() == 0)
					break;
				// 읽은 문자열을 파일에 저장
				fout.write(line,0,line.length());
				// 한 줄 띄기 위해(윈도우는 \r\n 을 같이 사용해야 줄바꿈됨)
				// 요즘은 \n만 적어도 되긴 함(이러면 뒤 숫자 1로 바꿔야함)
				fout.write("\r\n",0,2); 
			}
			fout.close();
		} catch(IOException e) {
			System.out.println("입출력 오류");
		}
		scanner.close();
	}
}