package chap08;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	public static void main(String[] args) {
		FileReader fin = null;
		try {
			// 문자 입력 스트림 생성
			fin = new FileReader("c:\\windows\\system.ini");
			int c;
			// 한 문자씩 파일 끝까지 읽는다.
			while((c=fin.read()) != -1) {
				System.out.print((char)c);
			}
			fin.close();
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}
}