package chap05.interf;

public interface ChatInterface {
	// 채팅에서 메시지를 입력하면 분석하여 안좋은 말을 걸러주는 메서드
	String sendMessage(String message);
}
