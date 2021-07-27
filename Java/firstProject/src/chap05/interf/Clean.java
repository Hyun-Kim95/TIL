package chap05.interf;

public class Clean implements ChatInterface{

	@Override
	public String sendMessage(String message) {
		if(message.contains("xyz")) {	// true, false 로 반환
			return "클린봇에 의해 삭제되었습니다.";
		}else {
			return message;
		}
	}
}
