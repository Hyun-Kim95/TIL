package config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.ChangePasswordService;
import spring.MemberDao;
//import spring.MemberInfoPrinter;
//import spring.MemberListPrinter;
//import spring.MemberPrinter;
//import spring.MemberInfoPrinter;
//import spring.MemberPrinter;
import spring.MemberRegisterService;
//import spring.MemberSummaryPrinter;
//import spring.VersionPrinter;

@Configuration
public class AppCtx {
	
	//객체 MemberDao객채
	@Bean
	public MemberDao memberDao()
	{
		return new MemberDao();
	}
	//MemberRegisterService 객체
	@Bean
	public MemberRegisterService memberRegSvc()
	{
		return new MemberRegisterService(memberDao());
	}
	//ChangePasswordService 객체
	@Bean
	public ChangePasswordService changePwdSvc()
	{
		ChangePasswordService pwdSvc = new ChangePasswordService();
		return pwdSvc;
	}
	/*
	//MemberPrinter 객체
	@Bean
	public MemberPrinter memberPrinter()
	{
		return new MemberPrinter();
	}
	//MemberListPrinter 객체
	@Bean
	public MemberListPrinter listPrinter()
	{
		return new MemberListPrinter(memberDao(),memberPrinter());
	}
	//MemberInfoPrinter 객체
	@Bean
	public MemberInfoPrinter infoPrinter()
	{
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
		infoPrinter.setMemberDao(memberDao());
		infoPrinter.setPrinter(memberPrinter());
		return infoPrinter;
		
	}
	//VersionPrinter 객체
	@Bean
	public VersionPrinter versionPrinter()
	{
		VersionPrinter versionPrinter = new VersionPrinter();
		versionPrinter.setMajorVersion(5);//메이저 5
		versionPrinter.setMinorVersion(0);//마이너 0
		return versionPrinter;
	}
	
//	@Bean
//	@Qualifier("printer")
//	public MemberPrinter memberPrinter1()  //객체 1
//	{
//		return new MemberPrinter();
//	}
//	
//	@Bean
//	@Qualifier("summaryPrinter")
//	public MemberSummaryPrinter memberPrinter2() {
//		return new MemberSummaryPrinter();
//	}
//	

//	

//	

	*/
}
