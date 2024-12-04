package controlfrm1Wndw2OtherWndw;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriRegistration {

	public static void main(String[] args) throws Exception {

		ChromeDriver d=new ChromeDriver();
		d.navigate().to("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		d.manage().window().maximize();
		Thread.sleep(1000);
		//WebElement e1=d.findElement(By.id("register_Layer"));
		//e1.click();
		//Thread.sleep(2000);
		WebElement e2=d.findElement(By.xpath("//span[.='Google']"));
		e2.click();
		System.out.println(d.getWindowHandles());
		Set<String> ids=d.getWindowHandles();
		Iterator<String> li=ids.iterator();
		String parentid = li.next();
		String childid=li.next();
		d.switchTo().window(childid);
		System.out.println(d.getWindowHandle());
		
		
		
	}

}
