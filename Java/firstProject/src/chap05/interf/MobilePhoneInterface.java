package chap05.interf;

public interface MobilePhoneInterface extends PhoneInterface{	// 인터페이스 상속
	void sendSMS();
	void receiveSMS();
}
