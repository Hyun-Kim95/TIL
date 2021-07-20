package car;

public class Bus extends Car {
	private int number;
	private int fee;
	private boolean frontDoor;
	private boolean backDoor;

	public Bus(String model, int maxSpeed, int seat, int price, String color, String energyType) {
		super(model, maxSpeed, seat, price, color, energyType);
		System.out.println("Bus 생성자 - 자동차 생성 완료");
	}

	public void openDoor() {

	}

	public void closeDoor() {

	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}
}
