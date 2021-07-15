import java.util.Random;

class Player1
{
	int number;
	String country;
	int go;
	boolean check;
	
	public Player1(int number, String country) {
		// TODO Auto-generated constructor stub
		this.number = number;
		this.country = country;
		go = 0;
		check = true;
	}
	
	void move()
	{
		Random r = new Random();
		if(check)
		{
			this.go= this.go + r.nextInt(10)+1;
		}
		
		System.out.println(this.country + " : "+ this.go + "M 입니다.");
	}

	public void setCheck(boolean check) {
		this.check = check;
	}
	
}

class Sim
{
	//While 탈출
	boolean finish(Player1 [] p)
	{
		for(int i =0;i<p.length;i++)
		{
			if(p[i].go >=100)
				return false;
		}
		return true;
	}
	//우승자 출력
	void finishPrint(Player1 [] p)
	{
		int max = 0;
		int index = 0;
		for(int i =0;i<p.length;i++)
		{
			if(max < p[i].go)
			{
				max = p[i].go;
				index = i;
			}
		}
		System.out.println("우승국은 "+p[index].country+"입니다.");
	}
}


public class java_test_교수님 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Player1 [] p = new Player1[4];
		Sim s = new Sim();
		String[] nation = {"한국","중국","미국","러시아"};
		for(int i = 0;i<p.length;i++)
		{
			p[i] = new Player1(i+1, nation[i]);
		}
		
		while(s.finish(p))//100M넘는 선수 발생시 탈출
		{
			//돌발상황과 달리기
			int dol = r.nextInt(4);
			System.out.println("돌발 상황 레인 : " + dol + "입니다.");
			System.out.println("******************************************************");
			for(int i =0;i<p.length;i++)
			{
				if(dol == i)
				{
					p[i].setCheck(false);
					p[i].move();
				}
				else
				{
					p[i].setCheck(true);
					p[i].move();
				}
			}
			
		}
		//누가 우승했는지 출력
		s.finishPrint(p);
		
	}

}
