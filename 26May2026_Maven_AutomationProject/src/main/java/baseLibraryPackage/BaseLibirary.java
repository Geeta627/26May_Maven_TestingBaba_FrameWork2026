package baseLibraryPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseLibirary 
{
	public static WebDriver driver;
	
	public void launchUrl(String url)
	{
		 driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	
	@AfterTest
	public void teamDown()
	{
		driver.quit();
	}
	

}
