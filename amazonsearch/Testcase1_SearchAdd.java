package amazonsearch;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcase1_SearchAdd extends LaunchNdQuit
{
	@Test
	public void testcasesearchadd() throws InterruptedException
	{
		System.out.println("Testcase1");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe");
		//driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.id("nav-search-submit-button")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement e1=driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
		e1.click();
		Set <String>s1=driver.getWindowHandles();
		System.out.println(s1);
		Iterator<String> s2=s1.iterator();
		String parent=s2.next();
		String child=s2.next();
		System.out.println(parent);
		System.out.println(child);
		driver.switchTo().window(child);
		System.out.println(driver.getWindowHandle());
		Thread.sleep(000);
		driver.findElement(By.xpath("(//span[.='Add to Cart'])[1]")).click();
	}

}
