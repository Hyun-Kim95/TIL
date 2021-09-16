package Service;

import DAO.NewDao;
import spring.LoginData;
import spring.RegisterData;

public class NewService {

	private NewDao dao;
	
	public NewService(NewDao dao) {
		// TODO Auto-generated constructor stub
		this.dao = dao;
	}
	
	
	public void insert(RegisterData rd)
	{
		dao.insert(rd);
	}
	
	public boolean loginCheck(LoginData ld)
	{
		return dao.loginCheck(ld);
	}
	
}
