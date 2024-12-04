package testngprograms;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class AmazonUsngBmAm
{
	@BeforeMethod
	public void login()
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe");
		driver.findElement(By.id("nav-search-submit-button")).sendKeys(Keys.ENTER);
	}
	
	
}
