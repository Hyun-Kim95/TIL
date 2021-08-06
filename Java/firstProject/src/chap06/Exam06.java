package chap06;

import java.util.Calendar;
import java.util.Scanner;

class Player{
	String name;
	int start;
	int end;
	int scr;
	public Player(String name){
		this.name = name;
	}
}
public class Exam06 {
	static Scanner sc = new Scanner(System.in);
	
	public static void run(Player[] p) {
		for(int i = 0;i<p.length;i++) {
			System.out.print(p[i].name+" 시작<Enter>키 >>");
			sc.nextLine();
			
			Calendar now1 = Calendar.getInstance();
			p[i].start = now1.get(Calendar.SECOND);
			System.out.println("현재 초 시간 = "+ p[i].start);
			
			System.out.print("10초 예상 후 <Enter>키 >>");
			sc.nextLine();
			
			Calendar now2 = Calendar.getInstance();
			p[i].end = now2.get(Calendar.SECOND);
			
			System.out.println("현재 초 시간 = "+ p[i].end);
			
			if(p[i].end >= p[i].start) {
				p[i].scr = p[i].end - p[i].start;
			}else {
				p[i].scr = 60 - p[i].start + p[i].end;
			}
		}
		int win = -100;
		String winner = "";
		for(int i=0;i<p.length;i++) {
			System.out.print(p[i].name+"의 결과 "+p[i].scr+", ");
			winner = (win< Math.abs(p[i].scr-10))?p[i].name:winner;
			if(win==p[i].scr)
				winner = "없습니다.";
			win = (win< Math.abs(p[i].scr-10))?p[i].scr:win;
		}
		System.out.println("승자는 "+winner);
	}
	
	public static void main(String[] args) {
		System.out.println("몇명이 플레이 하십니까?");
		int a = sc.nextInt();
		sc.nextLine();
		
		Player[] p = new Player[a];
		System.out.println("플레이어를 입력하세요");
		for(int i = 0;i<a;i++) {
			p[i] = new Player(sc.nextLine());
		}
		
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		run(p);
	}
}