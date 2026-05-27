package testpackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibraryPackage.BaseLibirary;
import pagePackage.LoginPage;

public class TC01_LoginTest extends BaseLibirary

{
	LoginPage ob;
	@BeforeTest
	public void getLaunchurl()
	{
		launchUrl("https://testingbaba.com/old/");
		ob=new LoginPage();
		
	}
	@Test(priority = 0)
	public void getLogin()
	{
		ob.findTitle();
	}
	@Test(priority = 1)
	public void getVerifyTitle()
	{
		ob.verifyTitle();
	}
	

}
