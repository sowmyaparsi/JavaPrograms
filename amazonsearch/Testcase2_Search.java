package amazonsearch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Testcase2_Search extends LaunchNdQuit {

	@Test
	public void testcase2search()
	{
		System.out.println("Testcase2");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe");
		//driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.id("nav-search-submit-button")).sendKeys(Keys.ENTER);


	}

}
