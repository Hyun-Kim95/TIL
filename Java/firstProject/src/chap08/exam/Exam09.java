package chap08.exam;

import java.io.File;

public class Exam09 {

	public static void main(String[] args) {
		File a = new File("c:\\Temp");
		System.out.println(a.getPath() + "디렉터리의 .txt 파일을 모두 삭제합니다....");

		int cnt = 0;
		File[] b = a.listFiles();
		for (File f : b) {
			String name = f.getName();
			if(name.contains(".txt")) {
				System.out.println(name + " 삭제");
				f.delete();
				cnt++;
			}
		}
		System.out.println("총 "+cnt+"개의 .txt 파일을 삭제하였습니다.");
	}
}