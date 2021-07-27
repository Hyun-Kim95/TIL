package chap05.interf;

public class InterfaceEx {
	public static void main(String[] args) {
//		SamsungPhone phone = new SamsungPhone();
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("3과 5를 더하면 "+ phone.calculate(3, 5));
		phone.receiveCall();
		phone.schedule();
//		phone.flash();
	}

}
