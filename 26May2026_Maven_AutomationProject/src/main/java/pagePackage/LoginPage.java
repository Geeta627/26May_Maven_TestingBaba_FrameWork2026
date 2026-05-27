package pagePackage;

import org.testng.Assert;

import baseLibraryPackage.BaseLibirary;

public class LoginPage extends BaseLibirary
{
	public void findTitle()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
    public void verifyTitle()
    {
    	Assert.assertEquals(driver.getTitle(), "Testing Baba","Validation Not confirm");
    }
}
