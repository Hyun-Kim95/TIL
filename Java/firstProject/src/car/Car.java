package car;

public class Car {
	private String model;
	private int speed;
	private int seat;
	private int maxSpeed;
	private int price;
	private String color;
	private String energyType;
	
	public Car(String model, int maxSpeed, int seat, int price,
			String color, String energyType) {
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.seat = seat;
		this.price = price;
		this.color = color;
		this.energyType = energyType;
		System.out.println("Car 생성자 - 자동차 생성 완료");
	}
	public void carInfo() {
		System.out.println("====== 자동차 정보 ======");
		System.out.println("모델명 : "+ model);
		System.out.println("최고속도 : "+ maxSpeed);
		System.out.println("현재속도 : "+ speed);
		System.out.println("좌석수 : "+ seat);
		System.out.println("가격 : "+ price);
		System.out.println("색상 : "+ color);
		System.out.println("연료방식 : "+ energyType);
	}
	public void move(int speed) {
		this.speed = speed;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getEnergyType() {
		return energyType;
	}
	public void setEnergyType(String energyType) {
		this.energyType = energyType;
	}
}
