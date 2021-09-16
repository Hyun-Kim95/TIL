package Controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import Service.NewService;
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
	  String firstLogin()
	  {
		  return "/mainLogin";
	  }
	

	  // 로그인 성공이나 실패시 나오는 화면
	  
	  @PostMapping("/runLogin")
	  String runLogin(/*@RequestParam Map<String, Object> paramMap*/HttpServletRequest req)
	  {
//		  String id = paramMap.get("id").toString();
//		  String pw = paramMap.get("password").toString();
//		  
//		  LoginData ld = new LoginData();
//		  ld.setId(id);
//		  ld.setPassword(pw);
		  
		  String id = req.getParameter("id");
		  String pw = req.getParameter("password");
		  
		  LoginData ld = new LoginData();
		  ld.setId(id);
		  ld.setPassword(pw);
		  
		  boolean flag = service.loginCheck(ld);
		  
		  //DB 로그인 확인이 진행되는 소스
		  
		  if(flag)
		  {
			//성공이면 화면 출력
			  return "/sucess";
		  }
		  else
		  {
			  //실패하면 나오는 화면 출력
			  return "/fail";
		  }
		  
		  
	  }
	  
	  
	  
	  
	  
}
