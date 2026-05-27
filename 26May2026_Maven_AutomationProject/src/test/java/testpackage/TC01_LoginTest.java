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
	@Test(priority = 1)
	public void getLogin()
	{
		ob.findTitle();
		
	}
	@Test(priority=2)
	public void getverifyUrl()
	{
		ob.verifyUrl();
	}
	@Test(priority = 3)
	public void getVarifyTitle()
	{
		ob.verifyTitle();
	}
	

}
