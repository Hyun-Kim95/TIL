package chap07;

import java.util.HashMap;
import java.util.Scanner;

public class Ex06 {
	String 도시;
	String 경도;
	String 위도;

	public Ex06(String 도시, String 경도, String 위도) {
		this.도시 = 도시;
		this.경도 = 경도;
		this.위도 = 위도;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Ex06> location = new HashMap<>();
		System.out.println("도시,경도,위도를 입력하세요.");
		String[] X = new String[4];
		for (int i = 0; i < 4; i++) {
			String[] x = sc.nextLine().split(",");
			X[i] = x[0];
			location.put(x[0], new Ex06(x[0].trim(), x[1].trim(), x[2].trim()));
		}
		System.out.println("---------------------------");
		System.out.println(location.get(X[0]).도시+"\t"+location.get(X[0]).경도+"\t"+location.get(X[0]).위도);
		System.out.println(location.get(X[1]).도시+"\t"+location.get(X[1]).경도+"\t"+location.get(X[1]).위도);
		System.out.println(location.get(X[2]).도시+"\t"+location.get(X[2]).경도+"\t"+location.get(X[2]).위도);
		System.out.println(location.get(X[3]).도시+"\t"+location.get(X[3]).경도+"\t"+location.get(X[3]).위도);
	
		System.out.println("---------------------------");
		while (true) {
			int chk = 0;
			System.out.print("도시 이름 >>");
			String s = sc.next();
			if (s.equals("그만"))
				break;
			for (int i = 0; i < 4; i++) {
				if (location.get(X[i]).도시.equals(s)) {
					chk++;
					System.out.println(location.get(X[i]).도시 + "\t" + location.get(X[i]).경도 + "\t" + location.get(X[i]).위도);
				}
			}
			if (chk == 0)
				System.out.println(s+"는 없습니다.");
		}
	}
}