package car;

public class Truck extends Car {
	private int ton;

	public Truck(String model, int maxSpeed, int seat, int price, String color, String energyType, int ton) {
		super(model, maxSpeed, seat, price, color, energyType);
		this.ton = ton;
		System.out.println("Truck 생성자 - 자동차 생성 완료");
	}
}
