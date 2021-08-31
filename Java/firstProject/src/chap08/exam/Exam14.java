package chap08.exam;

import java.io.File;
import java.util.Scanner;
import java.util.Vector;

public class Exam14 {

	public static File chk(String s, File[] b) {
		for(File f: b) {
			if(f.getName().equals(s)) {
				return f;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<String> v = new Vector<>();
		String l = "c:\\";
		v.add(l);
		String m = "***** 파일 탐색기입니다. *****";
		System.out.println(m);

		while (true) {
			File cnt;
			File a = new File(l);
			System.out.println("\t[" + a.getPath() + "]");
			File[] b = a.listFiles();
			for (File f : b) {
				if (f.isDirectory())
					System.out.print("dir\t");
				else
					System.out.print("file\t");
				System.out.printf("%-10s\t %s\n",f.length()+"바이트", f.getName());
			}
			System.out.print(">>");
			m = sc.nextLine();
			if (m.contains("그만"))
				break;
			else if (m.contains("..")) {
				if (!l.equals("c:\\")) {
					v.remove(v.size() - 1);
					l = v.get(v.size() - 1);
				}
				continue;
			}
			String[] mr = m.trim().split(" ");
			String l2 = l;
			if(mr.length == 1) {
				cnt = chk(mr[0],b);
				if (cnt == null || !cnt.isDirectory()) {
					System.out.println("정확한 디렉토리명을 입력해주세요");
					continue;
				}
				l += "\\" + m;
				v.add(l);
			} else if(mr.length == 2 && mr[0].contains("mkdir")) {
				cnt = chk(mr[1],b);
				if(cnt != null) {
					System.out.println("같은 이름이 존재합니다.");
					continue;
				}
				l2 += "\\" + mr[1];
				File A = new File(l2);
				A.mkdir();
				System.out.println(mr[1]+" 디렉터리를 생성하였습니다.");
			} else if(mr.length == 3 && mr[0].contains("rename")) {
				cnt = chk(mr[1],b);
				if(cnt == null) {
					System.out.println(mr[1]+"는 존재하지 않습니다.");
					continue;
				}
				cnt = chk(mr[2],b);
				if(cnt != null) {
					System.out.println(mr[2]+"와 같은 이름이 존재합니다.");
					continue;
				}
				File A = new File(l2+"\\"+mr[1]);
				File B = new File(l2+"\\"+mr[2]);
				A.renameTo(B);
				System.out.println(mr[1]+"를 "+mr[2]+"로 변경하였습니다.");
			}else {
				System.out.println("올바른 명령어를 입력해주세요");
			}
		}
		sc.close();
	}
}