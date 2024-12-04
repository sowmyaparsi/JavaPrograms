package controlfrm1Wndw2OtherWndw;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonParent2Child {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe");
		driver.findElement(By.id("nav-search-submit-button")).sendKeys(Keys.ENTER);
		WebElement e2=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		e2.click();
		System.out.println(driver.getWindowHandles());
		Set<String> id=driver.getWindowHandles();
		Iterator<String> li=id.iterator();
		System.out.println(li);
		String parentid =li.next();
		String childid=li.next();
		System.out.println(parentid);
		System.out.println(childid);
		driver.switchTo().window(childid);
		WebElement e3=driver.findElement(By.id("add-to-cart-button"));
		e3.click();
		
		
	}

}
