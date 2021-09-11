package config;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import controller.LoginCommand;
import controller.LoginCommandValidator;
import spring.AuthService;
import spring.WrongIdPasswordException;

@Controller
@RequestMapping("/login")
public class LoginController {
	public void setAuthService(AuthService authService) {
	}

	@GetMapping
	public String form(LoginCommand loginCommand) {
		return "login/loginForm";
	}

	@PostMapping
	public String submit(LoginCommand loginCommand, Errors errors) {
		new LoginCommandValidator().validate(loginCommand, errors);
		if (errors.hasErrors()) {
			return "login/loginForm";
		}
		try {
			// TODO 세션에 authInfo 저장해야 함
			return "login/loginSuccess";
		} catch (WrongIdPasswordException e) {
			errors.reject("idPasswordNotMatching");
			return "login/loginForm";
		}
	}
}