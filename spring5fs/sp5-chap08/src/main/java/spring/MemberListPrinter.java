package spring;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("listPrinter")
public class MemberListPrinter {

	private MemberDao memberDao;
	private MemberPrinter printer;

	public MemberListPrinter() {
	}
	
	public MemberListPrinter(MemberDao memberDao, MemberPrinter printer) {
		this.memberDao = memberDao;
		this.printer = printer;
	}

	public void printAll() {
		// Collection 최상위 부모(LIst, Set, Map ...) 클래스 형변환
		// Map을 받는게 확실하면 Map으로 하면 되는데
		// Map으로 받으면 키값으로 value 값을 빼내야 돼서 collection으로 value만 받음 
		Collection<Member> members = memberDao.selectAll();
		members.forEach(m -> printer.print(m));
		// 람다식
	}

	@Autowired
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	@Autowired
	@Qualifier("printer")
	public void setMemberPrinter(MemberPrinter printer)
	{
		this.printer = printer;
	}
}