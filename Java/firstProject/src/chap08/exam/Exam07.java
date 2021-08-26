package chap08.exam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.filechooser.FileNameExtensionFilter;

public class Exam07 {

	public static void main(String[] args) {
		File a = new File("c:\\Temp");
		System.out.println(a.getPath() + "디렉터리의 .txt 파일을 모두 삭제합니다....");

		File[] b = a.listFiles();
		for (File f : b) {
			String name = f.getName();
			System.out.println(name);
		}
		
//		while(true) {
//		}
		
		
	}
}