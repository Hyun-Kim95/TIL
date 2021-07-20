package car;

public class CarEx {
	public static void main(String[] args) {
		// String model, int maxSpeed, int seat, int price,String color, String
		// energyType
		Car car = new Car("소나타", 130, 5, 3000, "검정", "휘발유");
		car.carInfo();
		Bus bus = new Bus("버스1", 110, 25, 15000, "파랑", "전기");
		bus.carInfo();
		Truck truck = new Truck("포터", 120, 3, 2000, "흰색", "경유", 1);
		truck.carInfo();
	}
}