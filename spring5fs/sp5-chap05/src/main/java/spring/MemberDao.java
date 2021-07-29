package spring;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class MemberDao {	// 데이터 관리하는 역할
	private static long nextId = 0;
	
	// 컬렉션 자료구조 Map(key, Value)
	private Map<String,Member> map = new HashMap();
	
	public Member selectByEmail(String email)
	{
		return map.get(email);
	}
	
	public void insert(Member member)
	{
		member.setId(++nextId);
		map.put(member.getEmail(), member);
		
		//           key             value
	}
	
	public void update(Member member)
	{
		map.put(member.getEmail(),member);
	}
	
	public Collection<Member> selectAll() {
		return map.values();
	}
}
