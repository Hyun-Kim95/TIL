package chap02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration	// 해당 클래스를 스프링 설정 클래스로 지정
public class AppContext {

	@Bean	// 객체를 생성하고 알맞게 초기화를 할때
	public Greeter greeter() {
		Greeter g = new Greeter();
		g.setFormat("%s, 안녕하세요!");	// 스프링, 안녕하세요!
		return g;
	}
}
