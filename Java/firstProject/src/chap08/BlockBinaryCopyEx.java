package chap08;

import java.io.*;

public class BlockBinaryCopyEx {

	public static void main(String[] args) {
		File src = new File("c:\\Temp\\javasample\\img1.png");

		File dest = new File("c:\\Temp\\desert.png");// 복사 파일
		try {
			// 파일 입력 바이트 스트림
			FileInputStream fi = new FileInputStream(src);
			// 파일 출력 바이트 스트림
			FileOutputStream fo = new FileOutputStream(dest);
			byte[] buf = new byte[1024 * 10]; // 10KB 버퍼
			while (true) {
				// 버퍼 크기만큼 읽기, n은 실제 읽은 바이트
				int n = fi.read(buf);
				// buf[0] 부터 n 바이트 쓰기
				fo.write(buf, 0, n);
				// 버퍼 크기보다 작게 읽었기 때문에 파일 끝에 도달, 복사 종료
				if (n < buf.length)
					break;
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}
	}
}
