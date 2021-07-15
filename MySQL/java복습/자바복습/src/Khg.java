import java.util.Scanner;

public class Khg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		if (b < 45)
		{
			b = 60-(45-b);
			a--;
			
			if (a < 0)
			{
				a = 23;
			}
			System.out.printf("%d %d", a, b);
		}
		else
		{
			b = b-45;
			System.out.printf("%d %d", a, b);
		}
	}
}
