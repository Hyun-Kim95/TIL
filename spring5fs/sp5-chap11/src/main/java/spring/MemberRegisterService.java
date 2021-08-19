package spring;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberRegisterService {

	@Autowired
	private MemberDao memberDao;
	
	// 생성자 오버로딩
	public MemberRegisterService()
	{
		
	}
	
	public MemberRegisterService(MemberDao memberDao)
	{
		this.memberDao = memberDao;
	}
	
	public Long regist(RegisterRequest req)
	{
		//등록시 memberDao를 이용하여 이메일 중복 여부를 확인
		Member member = memberDao.selectByEmail(req.getEmail());
		//member 객체가 있으면 중복, 없으면 추가를 진행
		if(member != null)
			throw new DuplicateMemberException("dup email" + req.getEmail());
		//중복이 없으므로 RegisterRequest의 데이터를 추출하여
		//Member객체를 생성한 생성자에 RegisterRequest의 데이터 대입해서 생성
		Member newMember = new Member(req.getEmail(),req.getPassword(),
				req.getName(),req.getBirth(),LocalDateTime.now());
		//memberDao에 member를 추가
		memberDao.insert(newMember);
		// 새로 추가된 ID(정수)값을 리턴
		return newMember.getId();
	}
	
	public int checkCount(RegisterRequest req) {
		int count = memberDao.checkCount(req.getEmail(),req.getPassword());
		return count;
	}
}