package spring;

import java.time.LocalDateTime;

public class Member {
	//id email password name registerDateTime get만 적용 set은 생성자를 통해서 set기능을 수행합니다.
	private Long id;
	private String email;
	private String password;
	private String name;
	private LocalDateTime registerDateTime;
	
	public Member(String email, String password,
			String name, LocalDateTime regDateTime)
	{
		this.email = email;
		this.password = password;
		this.name = name;
		this.registerDateTime = regDateTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public LocalDateTime getRegisterDateTime() {
		return registerDateTime;
	}
	/////////////////////////////////////////////////////////////////////////////
	//패스워드 변경시 수행하는 함수 옛날 암호 새로운암호를 인자로 받는다.
	public void changePassword(String oldPassword, String newPassword)
	{
		//옛날 암호가 지금 현재의 암호랑 다르면 실행
		if(!password.equals(oldPassword))
		{
			//WrongIdPasswordException을 호출합니다.
			throw new WrongIdPasswordException();
		}
		//위에 조건이 아니면 실행
		//현재의 암호를 올바르게 입력을 했을 경우에 현재 비밀번호를 새로운 비밀번호로 교체
		this.password = newPassword;
	}
}
