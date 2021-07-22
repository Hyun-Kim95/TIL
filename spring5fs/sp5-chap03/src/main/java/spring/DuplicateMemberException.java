package spring;

public class DuplicateMemberException extends RuntimeException{

	//생성자를 생성할때 인자로 문자열 받는다.
	public DuplicateMemberException(String message)
	{
		//RuntimeException에 객체를 생성할때 문자열 전달합니다.
		//전달을 하면 RuntimeException에서 여기서 정의한 문자열 출력이 됩니다.
		super(message);
	}
	
}
