package chap08.exam;

import java.io.File;
import java.util.Scanner;
import java.util.Vector;

public class Exam13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<String> v = new Vector<>();
		String l = "c:\\";
		v.add(l);
		String m = "***** 파일 탐색기입니다. *****";
		System.out.println(m);

		while (true) {
			int cnt = 0;
			File a = new File(l);
			System.out.println("\t[" + a.getPath() + "]");
			File[] b = a.listFiles();
			for (File f : b) {
				if (f.isDirectory()) {
					System.out.println("dir\t" + f.length() + "바이트\t" + f.getName());
				} else {
					System.out.println("file\t" + f.length() + "바이트\t" + f.getName());
				}
			}
			System.out.print(">>");
			m = sc.nextLine();
			if (m.contains("그만"))
				break;
			else if (m.contains("..")) {
				if (l.equals("c:\\")) {
					continue;
				} else {
					v.remove(v.size() - 1);
					l = v.get(v.size() - 1);
				}
			} else {
				for (File f : b) {
					if (f.getName().equals(m) && f.isDirectory())
						cnt++;
				}
				if (cnt == 0) {
					System.out.println("정확한 디렉토리명을 입력해주세요");
					continue;
				}
				if (l.charAt(l.length() - 1) == '\\')
					l += m;
				else
					l += "\\" + m;
				v.add(l);
			}
		}
		sc.close();
	}
}