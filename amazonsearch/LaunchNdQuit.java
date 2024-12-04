package amazonsearch;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchNdQuit 
{
	ChromeDriver driver;
	@BeforeMethod
	public void login()
	{
		driver =new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		System.out.println("Launching browser");
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("closing browser");
		driver.quit();
	}

}
