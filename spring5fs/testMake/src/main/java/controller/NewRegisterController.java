package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import Service.NewService;
import spring.RegisterData;

@Controller
public class NewRegisterController {

	 private NewService service;
	
	public NewRegisterController(NewService service) {
		// TODO Auto-generated constructor stub
		this.service = service;
	}
	
	
	  // 회원가입화면
	  @GetMapping("/register")
	  String register(Model model)
	  {
		  model.addAttribute("registerData", new RegisterData());
		  return "/register";
	  }
	  
	  // 회원가입 버튼 입력시 실행
	  @PostMapping("/submmit")
	  String submmit(@ModelAttribute("registerData")RegisterData rd)
	  {
		  System.out.println(rd.getName());
		  service.insert(rd);
		  //DB 회원가입이 진행되는 소스
		  return "/mainLogin";
	  }
	
}
