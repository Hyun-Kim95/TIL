package chap08;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadHangulSuccess {
	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		try {
			// 미리 만들어 놓기
			fin = new FileInputStream("c:\\Temp\\hangul.txt");
			// MS에서 만든 한글 확장 완성형 문자 집합(US-ASCII로 하면 한글 깨짐)
			in = new InputStreamReader(fin, "MS949");
			int c;
			
			// 문자집합 이름 리턴
			System.out.println("인코딩 문자 집합은 "+in.getEncoding());
			while((c = in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		} catch(IOException e) {
			System.out.println("입출력 오류");
		}
		// 이거 한글이 깨지면 텍스트 파일에서 다른 이름으로 저장 -> ANSI 로 바꿔주기
	}
}