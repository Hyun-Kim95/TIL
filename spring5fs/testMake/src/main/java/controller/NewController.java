package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import service.NewService;
import spring.LoginData;
import spring.RegisterData;


@Controller
public class NewController {
	
	
	  private NewService service;
	  
	  
	  public NewController(NewService service) {
		// TODO Auto-generated constructor stub
		  this.service = service;
	}
	
	
      // main -> login
	  @GetMapping("/")
	  String firstLogin(Model model)
	  {
		  model.addAttribute("loginData", new LoginData());
		  return "/mainLogin";
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
	  String submmit(RegisterData rd)
	  {
		  System.out.println(rd.getName());
		  service.insert(rd);
		  //DB 회원가입이 진행되는 소스
		  return "/mainLogin";
	  }
	  // 로그인 성공이나 실패시 나오는 화면
	  /*
	  @PostMapping("/runLogin")
	  String runLogin()
	  {
		  //DB 로그인 확인이 진행되는 소스
		  if()
		  {
			//성공이면 화면 출력  
		  }
		  else
		  {
			  //실패하면 나오는 화면 출력
		  }
	  }
	  */
	  
	  
	  
	  
}
