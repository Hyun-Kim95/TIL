package chap09;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller	//View(JSP)랑 연동하는 클래스
public class HelloController {

	@GetMapping("/hello")
	public String hello(Model model,
			@RequestParam(value = "name", required = false) String name) {
		System.out.println("hello");
		//Model을 이용해서 Java에 있는 데이터를
		//JSP(View)로 올릴 수가 있구나
		model.addAttribute("greeting", "안녕하세요, " + name);
		return "hello";
	}
}