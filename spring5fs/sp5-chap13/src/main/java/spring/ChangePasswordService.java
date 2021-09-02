package spring;

import org.springframework.transaction.annotation.Transactional;

public class ChangePasswordService {

	private MemberDao memberDao;
	
	@Transactional
	public void changePassword(String email, String oldPwd, String newPwd)
	{
		// email을 이용하여 memberDao에서 member객체를 추출
		Member member = memberDao.selectByEmail(email);
		// member 객체가 null이면 실행
		if(member == null)
			throw new MemberNotFoundException();
		// member객체가 있으면
		// member에 비밀번호를 새로운 비밀번호로 빠꿈
		member.changePassword(oldPwd, newPwd);
		// 문제없이 패스워드가 변경 됐으면 memberDao에 업데이트 진행
		memberDao.update(member);
	}
	
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
}