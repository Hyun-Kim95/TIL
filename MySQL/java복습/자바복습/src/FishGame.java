

import java.util.Random;
import java.util.Scanner;

public class FishGame {

	public static void main(String[] args) {

		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int[][] hosu = new int[5][5]; // 0으로 값이 세팅
		for(int i =0;i<3;i++)
		{
			int a = r.nextInt(5); // 0~4
			int b = r.nextInt(5);

			if(hosu[a][b] == 1)
				i--;
			else
			{
				hosu[a][b] = 1;
				System.out.println("y :"+a+","+"x :"+b);
			}
		}
		
		//물고기 완료
		int x;
		int y;
		while(true)
		{
			System.out.print("좌표를 입력하세요 : ");
			y = sc.nextInt();
			x = sc.nextInt();
			if(!(x > 4 || x < 0 || y >4 || y<0))
				break;
		}
		//캐스팅
		
		int count = 3;
		
		while(true)
		{
			//잡았는지 체크
			//이동
			System.out.println("y : " + y+","+"x : "+ x);
			if(hosu[y][x] == 1)
			{
				count --;
				System.out.println("물고기를 잡았습니다. 남은 물고기 : "+count);
			}
			
			if(count == 0)
			{
				System.out.println("물고기를 다잡았습니다.");
				break;
			}
			else
			{
				//키입력 
				System.out.print("1.위 2. 아래 3. 왼쪽 4. 오른쪽 : ");
				int sel = sc.nextInt();
				if(sel == 1)
				{
					y--;
					if(y == -1)
					{
						y=0;
						System.out.println("더이상 움직일 수 없습니다.");
					}
				}
				else if(sel ==2)
				{
					y++;
					if(y == 5)
					{
						y=4;
						System.out.println("더이상 움직일 수 없습니다.");
					}
				}
				else if(sel ==3)
				{
					x--;
					if(x == -1)
					{
						x=0;
						System.out.println("더이상 움직일 수 없습니다.");
					}
				}
				else if(sel ==4)
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
			}			
		}
	}
}