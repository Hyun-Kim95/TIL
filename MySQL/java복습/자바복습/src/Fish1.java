

import java.util.Random;
import java.util.Scanner;

class map{
	static Random r = new Random();
	static Scanner sc = new Scanner(System.in);
	static int[][] hosu = new int[5][5];	// 호수
	static String net[] = new String[3];	// 그물
	static int i;
	static boolean a = true;
}
class Fish {
	int x;
	int y;
	
	public Fish(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
}
class Player{
	int x;	// 현재위치
	int y;	// 현재위치
	int m;	// 입력값
	
	public Player(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	boolean move() {
		if(map.hosu[y][x]==1) {
			map.net[map.i] = "fish"+map.i;
			System.out.println(map.net[map.i]);
			map.hosu[y][x] = 0;
			map.i++;
		}
		if (map.i == 3) {
			System.out.println("물고기를 다 잡았습니다.");
			map.a = false;
			return map.a;
		}
		System.out.println("어느쪽으로 움직일까요?");
		System.out.print("1.위 2. 아래 3. 왼쪽 4. 오른쪽 : ");
		System.out.println("낚싯대의 위치 y: "+y+" x: "+x);
		m = map.sc.nextInt();
		switch(m) {
		case 1:
			y--;
			if(y == -1)
			{
				y=0;
				System.out.println("더이상 움직일 수 없습니다.");
			}
		case 2:
			
		case 3:
		case 4:
			default: 
		}
		if(m == 1)
		{
			y--;
			if(y == -1)
			{
				y=0;
				System.out.println("더이상 움직일 수 없습니다.");
			}
		}
		else if(m ==2)
		{
			y++;
			if(y == 5)
			{
				y=4;
				System.out.println("더이상 움직일 수 없습니다.");
			}
		}
		else if(m ==3)
		{
			x--;
			if(x == -1)
			{
				x=0;
				System.out.println("더이상 움직일 수 없습니다.");
			}
		}
		else if(m ==4)
		{
			x++;
			if(x == 5)
			{
				x = 4;
				System.out.println("더이상 움직일 수 없습니다.");
			}
		}
		else
			System.out.println("잘못된 입력입니다.");
		return true;
	}
	
}	
public class Fish1{
	public static void main(String[] args) {
		Fish fish[] = new Fish[3]; // 물고기
		
		// 물고기 생성
		for(int i=0;i<fish.length;i++) {
			int a = map.r.nextInt(4);
			int b = map.r.nextInt(4);
			fish[i] = new Fish(a,b);
			if(map.hosu[a][b] == 1)
				i--;
			else {
				map.hosu[a][b] = 1;
				System.out.println("y: "+a+"x: "+b);
			}
		}
		// 낚시 시작 위치 생성
		int A;
		int B;
		while(true) {
			System.out.println("좌표를 입력하세요: ");
			A = map.sc.nextInt();
			B = map.sc.nextInt();
			if(!(B > 4 || B < 0 || A >4 || A<0))
				break;
		}
		Player p = new Player(B,A);	// 낚시꾼
		
		// 낚시 시작
		while(map.a) {
			p.move();
		}
	}
}