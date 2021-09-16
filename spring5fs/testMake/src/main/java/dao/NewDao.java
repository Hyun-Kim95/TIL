package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

import spring.LoginData;
import spring.RegisterData;

public class NewDao {

	private JdbcTemplate jdbcTemplate;
	
	public NewDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void insert(RegisterData rd)
	{
		//쿼리문 실행
		jdbcTemplate.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection con)
					throws SQLException {
				// 파라미터로 전달받은 Connection을 이용해서 PreparedStatement 생성
				PreparedStatement pstmt = con.prepareStatement(
						"insert into newmember (id, password, name, sung, homeNumber, telNumber, email) " +
								"values (?, ?, ?, ?, ?, ?, ?)");
				// 인덱스 파라미터 값 설정
				pstmt.setString(1, rd.getId());
				pstmt.setString(2, rd.getPassword());
				pstmt.setString(3, rd.getName());
				pstmt.setString(4,rd.getSung());
				pstmt.setString(5,rd.getHomeNumber());
				pstmt.setString(6,rd.getTelNumber());
				pstmt.setString(7,rd.getEmail());
				// 생성한 PreparedStatement 객체 리턴
				return pstmt;
			}
		});
	}
	
	public boolean loginCheck(LoginData ld)
	{
		Integer count = jdbcTemplate.queryForObject(
				"select count(*) from newmember where id ='"+ld.getId()+"' and password ='"+ld.getPassword()+"'", Integer.class);
		if(count == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
}
