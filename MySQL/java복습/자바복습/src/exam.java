import java.util.Random;
import java.util.Scanner;

class People{
	static Scanner sc = new Scanner(System.in);
	
	int number;
	int cnt;

	public People(int cnt, int number) {
		super();
		this.number = number;
		this.cnt = cnt;
	}
	void game() {
		for(int i=0;i<10;i++) {
			drink();			// 참가자 별로 10번 마심
		}
		System.out.println(this.number+"번 선수가 총 마신 물: "+this.cnt);
	}
	void drink(){
		cnt += Water.water();	// 랜덤한 물의 양 누적
	}
}
class Water{
	static Random r = new Random();
	static int water() {
		return r.nextInt(10)+1;	// 랜덤한 물의 양 반환
	}
}
public class exam {
	public static void main(String[] args) {
		People[] plist = new People[3];		// 참가자 3명
		for(int i=0;i<plist.length;i++) {	// 마신 물 0, 참가번호 1~3
			plist[i] = new People(0,i+1);
		}
			for(int i=0;i<3;i++) {			// 순서대로 게임 진행
				plist[i].game();
			}
		int max, value, ans;	// 가장 많이 마신사람 확인
		value = (plist[0].cnt>plist[1].cnt)?plist[0].cnt:plist[1].cnt;
		max = (plist[0].cnt>plist[1].cnt)?plist[0].number:plist[1].number;
		max = (value > plist[2].cnt)?max:plist[2].number;
		
		while(true) {
			System.out.println("제일 많이 마신 사람을 선택하세요(1/2/3): ");
			ans = People.sc.nextInt();
			if(ans == max) {
				System.out.println("정답입니다!");
				break;
			}
			else {
				System.out.println("틀렸습니다.");
			}
		}
	}
}