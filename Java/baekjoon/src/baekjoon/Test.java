package baekjoon;

import java.util.Scanner;

public class Test {
	public long sum(int[] a) {
		long sum = 0;
		for(int i = 0;i<a.length;i++) {
			sum += a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++)
			a[i] = sc.nextInt();
		Test ts = new Test();
		System.out.println(ts.sum(a));
	}

}
