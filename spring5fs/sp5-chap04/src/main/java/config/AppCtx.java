package config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.ChangePasswordService;
import spring.MemberDao;
import spring.MemberInfoPrinter;
import spring.MemberListPrinter;
import spring.MemberPrinter;
import spring.MemberRegisterService;
import spring.MemberSummaryPrinter;
import spring.VersionPrinter;

// 설정에 관련
@Configuration
public class AppCtx {

	//빈객체
	@Bean
	public MemberDao memberDao()
	{
		return new MemberDao();
	}
	
	@Bean
	public MemberRegisterService memberRegSvc()
	{
		return new MemberRegisterService();
	}
	
	@Bean
	public ChangePasswordService changePwdSvc()
	{
		ChangePasswordService pwdSvc = new ChangePasswordService();
		return pwdSvc;
	}
	
	@Bean
	public MemberPrinter memberPrinter()
	{
		return new MemberPrinter();
	}
	
	@Bean
	public MemberPrinter memberPrinter3()
	{
		return new MemberPrinter();
	}
	
	@Bean
	@Qualifier("printer")
	public MemberPrinter memberPrinter1()  //객체 1
	{
		return new MemberPrinter();
	}
	
	@Bean
	@Qualifier("summaryPrinter")	// 굳이 같은 이름으로 햇갈리게 코딩하지 않는데 이런게 있다 정도만 알아두기
	public MemberSummaryPrinter memberPrinter2() {
		return new MemberSummaryPrinter();
	}
	
	@Bean
	public MemberListPrinter listPrinter()
	{
		return new MemberListPrinter();
	}
	
	@Bean
	public MemberInfoPrinter infoPrinter()
	{
		 
		return new MemberInfoPrinter();
	}

	@Bean
	public VersionPrinter versionPrinter()
	{
		VersionPrinter versionPrinter = new VersionPrinter();
		versionPrinter.setMajorVersion(5);
		versionPrinter.setMinorVersion(5);
		return versionPrinter;
	}
	
}
