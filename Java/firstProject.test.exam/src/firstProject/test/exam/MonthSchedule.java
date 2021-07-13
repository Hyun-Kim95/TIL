package firstProject.test.exam;

import java.util.Scanner;
public class MonthSchedule {
	String[] schedule;
	boolean a = true;
	Scanner sc = new Scanner(System.in);
	public MonthSchedule(String[] schedule) {
		super();
		this.schedule = schedule;
		this.a = a;
	}
	boolean input(){
		System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
		int n = sc.nextInt();
		if(n==3)
			finish(a);
		else if(n==2)
			view();
		else
			run();
		return this.a;
	}
	void view() {
		System.out.print("날짜(1~30)?");
		int day = sc.nextInt();
		System.out.printf("%d일의 할 일은 %s입니다\n",day,schedule[day-1]);
	}
	boolean finish(boolean a) {
		this.a = false;
		return this.a;
	}
	void run() {
		System.out.print("날짜(1~30)?");
		int day = sc.nextInt();
		System.out.print("할일(빈칸없이입력)?");
		String work = sc.next();
		schedule[day-1] = work;
	}
	public static void main(String[] args) {
		
		String schedule[] = new String[30];
		MonthSchedule mo = new MonthSchedule(schedule);
		System.out.println("이번달 스케쥴 관리 프로그램.");
		while(mo.a) {
			mo.input();
		}

	}

}
