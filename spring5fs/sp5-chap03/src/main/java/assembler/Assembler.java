package assembler;

import spring.ChangePasswordService;
import spring.MemberDao;
import spring.MemberRegisterService;

public class Assembler {
	
	private MemberDao memberDao;
	private MemberRegisterService regSvc;
	private ChangePasswordService pwdSvc;
	
	public Assembler()
	{
		memberDao = new MemberDao();
		regSvc = new MemberRegisterService(memberDao); // 생성자를 만들때 memberDao를 넣어줍니다.
		pwdSvc = new ChangePasswordService();// ChangePasswordService 객체만 생성합니다.
		pwdSvc.setMemberDao(memberDao);//setMemberDao를 호출해서 memberDao를 넣어줍니다.
	}
	
	public MemberDao getMemberDao()
	{
		return memberDao;
	}
	
	public MemberRegisterService getMemberRegisterService()
	{
		return regSvc;
	}
	public ChangePasswordService getChangePasswordService()
	{
		return pwdSvc;
	}
}
