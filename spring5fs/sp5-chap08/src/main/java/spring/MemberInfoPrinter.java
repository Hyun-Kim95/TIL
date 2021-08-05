package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("infoPrinter")
public class MemberInfoPrinter {
	private MemberDao memberDao;
	private MemberPrinter printer;
	
	public void printMemberInfo(String email)
	{
		// email로 member 객체 추출
		Member member = memberDao.selectByEmail(email);
		// member가 null이면 실행
		if(member == null)
		{
			System.out.println("데이터 없음\n");
			return;
		}
		// member print
		printer.print(member);
		System.out.println();
	}
	
//	@Autowired
	public void setMemberDao(MemberDao memberDao)
	{
		this.memberDao = memberDao;
	}
	
//	@Autowired
//	@Qualifier("printer")	// 한정자
	// @Qualifier("printer") (AppCtx)빈객체에서 이름이 같은 것이 있을 때 특정한 것을 가져올 수 있음
	public void setPrinter(MemberPrinter printer)
	{
		this.printer = printer;
	}
}