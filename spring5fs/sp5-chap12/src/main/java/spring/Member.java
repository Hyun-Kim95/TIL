package spring;

import java.time.LocalDateTime;

public class Member {
	private Long id;
	private String email;
	private String birth;
	private String password;
	private String name;
	private LocalDateTime registerDateTime;
	
	public Member(String email, String password,
			String name, String birth, LocalDateTime regDateTime)
	{
		this.email = email;
		this.birth = birth;
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
	
	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public void changePassword(String oldPassword, String newPassword)
	{
		//현재 저장되어 있는 password와 데이터로 넘어온 oldPassword가 같지 않으면 실행
		if(!password.equals(oldPassword))
		{
			throw new WrongIdPasswordException();
		}
		// 위에 조건이 아니면 실행
		this.password = newPassword;
	}
}
