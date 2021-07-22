package spring;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemberDao {
	private static long nextId = 0;
	
	//컬렉션 Map -> <Key,Value> => 키가 문자열, 값이 Member
	//ArrayList Map 배열은 많이 안써요
	//index     key
	private Map<String,Member> map = new HashMap();
	
	public Member selectByEmail(String email)
	{
		return map.get(email); //emali값을 키로 써서 map에 있는 Member를 넘겨준다.
	}
	
	public void insert(Member member)
	{
		//인자로 받은 member에서 setId 함수를 호출을 하는데 정수값으 nextID를 1을 증가해서 넣어줍니다.
		member.setId(++nextId);
		//Map컬랙션에 키값을 member에 이메일로 값을 member로 추가를 해줍니다.
		map.put(member.getEmail(), member);
	}
	
	public void update(Member member)
	{
		//Map컬랙션에 키값을 member에 이메일로 값을 member로 추가를 해줍니다.
		map.put(member.getEmail(),member);
	}
	
	//전체를 출력
	public Collection<Member> selectAll()
	{
		//값으로만 구성된 컬렉션을 주는게 map.values();
		return map.values();
	}
}
