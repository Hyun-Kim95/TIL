package chap06;

public class WrapperTest {
	public static void main(String[] args) {
		Integer i = Integer.valueOf(10);
		Integer i2 = Integer.valueOf("10");
		Integer.parseInt("10");
		Double.parseDouble("101.1");
		Float.parseFloat("10.1");
		String.valueOf(10);
		
		Character c = Character.valueOf('c');
		
		Double d = Double.valueOf(3.14);
		Boolean b = Boolean.valueOf(true);
	}

}
