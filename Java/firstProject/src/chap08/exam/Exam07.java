package chap08.exam;

import java.io.*;

public class Exam07 {

	public static void main(String[] args) {
		File src = new File("c:\\Temp\\a.jpg");
		File dest = new File("c:\\Temp\\b.png");
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			System.out.println("10%마다 *를 출력합니다.");
			byte[] buf = new byte[(int) (src.length()/10)];
			for(int i=0;i<10;i++) {
				System.out.print("*");
				int n = fi.read(buf);
				fo.write(buf, 0, n);
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}
	}
}