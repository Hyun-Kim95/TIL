import java.util.Random;
import java.util.Scanner;

class Fish0
{
	
}
class Lake
{
	Fish0[][] lake = new Fish0[5][5];
	
	public Lake() {
		// TODO Auto-generated constructor stub
		Random r = new Random();
		for(int i =0;i<3;i++)
		{
			int a = r.nextInt(5); // 0~4
			int b = r.nextInt(5);

			if(lake[a][b] != null)
			{
				i--;
			}
			else
			{
				lake[a][b] = new Fish0();
				System.out.println("y :"+a+","+"x :"+b);
			}
		}
	}
	Fish0 sendFish(int[] index)
	{
		return lake[index[0]][index[1]];
	}	
}
class Fisher
{
	private int x;
	private int y;
	Fish0[] mang = new Fish0[3];
	
	void counting()
	{
		int count = 0;
		for(int i =0;i<mang.length;i++)
		{
			if(mang[i] != null)
			{
				count++;
			}
		}
		System.out.println("잡은 물고기 : "+ count);
	}
	void receiveFish(Fish0 f)
	{
		for(int i =0;i<mang.length;i++)
		{
			if(mang[i] == null)
			{
				mang[i] = f;	
				break;
			}
		}
		counting();
	}
	boolean check()
	{
		for(int i =0;i<mang.length;i++)
		{
			if(mang[i] == null)
			{
				return true;
			}
		}
		return false;
	}
	int[] casting(Scanner sc)
	{
		int[] temp = new int[2];
		while(true)
		{
			System.out.print("좌표를 입력하세요 : ");
			y = sc.nextInt();
			x = sc.nextInt();
			if(!(x > 4 || x < 0 || y >4 || y<0))
			{
				break;
			}
		}
		temp[0] = y;
		temp[1] = x;
		
		return temp;
	}
	int[] move(Scanner sc)
	{
		System.out.print("1.위 2. 아래 3. 왼쪽 4. 오른쪽 : ");
		int[] temp = new int[2];
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
		{
			System.out.println("잘못된 입력입니다.");
		}
		temp[0] = y;
		temp[1] = x;
		
		return temp;
	}
}
class Controller
{
	public Controller() {
		// TODO Auto-generated constructor stub
		Scanner sc = new Scanner(System.in);
		Lake l = new Lake();
		Fisher human = new Fisher();
		human.receiveFish(l.sendFish(human.casting(sc)));
		while(human.check())
		{
			human.receiveFish(l.sendFish(human.move(sc)));
		}
	}
}
public class FishInstance_교수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Controller();
	}
}