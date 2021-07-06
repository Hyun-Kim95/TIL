package firstProject.test;
public class TV {
	boolean power;
	int ch;
	int vol;
	float inch;
	String model;
	public TV(){
        this(0,0,0,".");	// 무조건 this()는 첫번째 문장이어야 함
        System.out.println("생성자호출");	// 얘가 위로 가면 오류발생
    }
	public TV(int ch, int vol, float inch, String model) {
		super();	// 부모클래스의 기본생성자
		this.ch = ch;
		this.vol = vol;
		this.inch = inch;
		this.model = model;
	}
	void power() {
		this.power = !this.power;
		System.out.println("TV power: "+this.power);
	}
	void setTVInfo(int ch) {
		System.out.println("void setTVInfo(int ch)");
		this.ch = ch;
	}
	void setTVInfo(int ch, int vol) {
		System.out.println("void setTVInfo(int ch, int vol)");
		this.ch = ch;
		this.vol = vol;
	}
	void setTVInfo(int ch, float inch) {
		System.out.println("void setTVInfo(int ch, float inch)");
		this.ch = ch;
		this.inch = inch;
	}
	void tvInfo() {
		System.out.println("---------------------");
		System.out.println("model: "+this.model);
		System.out.println("power: "+this.power);
		System.out.println("inch: "+this.inch);
		System.out.println("ch: "+this.ch);
		System.out.println("vol: "+this.vol);
	}
	void chUp() {
		if(!this.power)	return;
		this.ch++;
		System.out.println("ch: "+this.ch);
	}
	void chDown() {
		if(!this.power)	return;
		this.ch--;
		System.out.println("ch: "+this.ch);
	}
	void volUp() {
		if(!this.power)	return;
		this.vol++;
		System.out.println("vol: "+this.vol);
	}
	void volDown() {
		if(!this.power)	return;
		this.vol--;
		System.out.println("vol: "+this.vol);
	}
	public static void main(String[] args) {
		TV tv1 = new TV(1,1,1,"tv1");
		tv1.setTVInfo(2, 1);
		tv1.tvInfo();
		TV tv2 = new TV();
		tv2.setTVInfo(0);
		tv2.tvInfo();
	}
}
