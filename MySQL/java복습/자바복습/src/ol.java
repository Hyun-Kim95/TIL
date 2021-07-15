import java.util.Random;

// 경주 프로그램
public class ol {
	static Random r = new Random();			// 돌발 및 이동거리 랜덤
	static String score[] = new String[4];	// 100미터 달리기 순위
	static int i = 0;						// 순위 체크용
	static boolean a = true;				// 경기종료 체크
	String country;							// 객체별 나라 저장
	int go;									// 객체별 이동거리 저장
	// 생성자
	public ol(String country, int go) {
		super();
		this.country = country;
		this.go = go;
	}
	// 이동거리
	void gogo() {
		this.go += r.nextInt(10)+1;	// 안넘으면 이동
		if(this.go >= 100)	// 100미터 넘으면 finish 호출
			finish();
	}
	void finish() {
		score[i] = this.country;
		System.out.println(i+""+score[i]);
		i++;
	}
	public static void main(String[] args) {
		ol ko = new ol("한국",0);
		ol ch = new ol("중국",0);
		ol am = new ol("미국",0);
		ol lu = new ol("러시아",0);
		ol[] runner = {ko,ch,am,lu};

		while(ol.a) {
			int s = r.nextInt(runner.length);
			int cnt = 0;
			System.out.println("------현재 거리-----------");
			for(int i = 0;i<runner.length;i++) {
				if(i != s && runner[i].go <100) {
					runner[i].gogo();
					cnt++;
				}
				System.out.println(runner[i].country+""+runner[i].go);
			}
			if(cnt == 0)
				break;
		}
		System.out.println(ol.score[0]+" 나라가 우승하였습니다!");
	}
}