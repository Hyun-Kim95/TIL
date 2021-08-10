package chap06;

import java.util.Scanner;

public class Histogram378 {
	StringBuffer abc[];

	public Histogram378() {
		this.abc = new StringBuffer[26]; // a~z 알파벳의 개수
		System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");
	}

	String readString() {
		StringBuffer sb = new StringBuffer(); // 키 입력을 받을 스트링버퍼 생성
		Scanner sc = new Scanner(System.in);
		int[] a = new int[26];
		while (true) {
			String line = sc.nextLine(); // 텍스트 한 라인을 읽음
			if (line.equals(";")) // ';' 만 있는 라인이면 입력 끝
				break;
			sb.append(line); // 읽은 라인 문자열을 스트링버퍼에 추가
		}
		sc.close();
		return sb.toString();
	}

	String addPoint(int n) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < n; i++) {
			sb.append('-');
		}
		return sb.toString();
	}

	void drawHistogram1(String str) {
		System.out.println("히스토그램을 그립니다.");
		char c = 'A';
		for (int i = 0; i < 26; i++, c++) {
			abc[i] = new StringBuffer();
			abc[i].append(c);
			for (int j = 0; j < str.length(); j++) {
				if (str.toUpperCase().charAt(j) == c) {
					abc[i].append('-');
				}
			}
			System.out.println(abc[i]);
		}
	}

	void drawHistogram2(String str) {
		System.out.println("히스토그램을 그립니다.");
		char c = 'A';
		for (int i = 0; i < 26; i++, c++) {
			abc[i] = new StringBuffer();
			abc[i].append(c);
			if (str.toUpperCase().indexOf(c) > -1) {
				abc[i].append(addPoint(str.length() - str.toUpperCase().replace(String.valueOf(c), "").length()));
			}
			System.out.println(abc[i]);
		}
	}

	void drawHistogram3(String str) {
		System.out.println("히스토그램을 그립니다.");
		char c = 'A';
		System.out.println();
		int i = 0;
		while (c <= 'Z') {
			abc[i] = new StringBuffer();
			abc[i].append(c);
			if (str.toUpperCase().indexOf(c) > -1) {
				final char cc = c;
				abc[i].append(addPoint((int) str.toUpperCase().chars().filter(ch -> ch == cc).count()));
			}
			System.out.println(abc[i]);
			i++;
			c++;
		}
	}

	public static void main(String[] args) {
		Histogram378 histogram = new Histogram378();
		String str = histogram.readString();
//		histogram.drawHistogram1(str);
//		histogram.drawHistogram2(str);
		histogram.drawHistogram3(str);
	}
}