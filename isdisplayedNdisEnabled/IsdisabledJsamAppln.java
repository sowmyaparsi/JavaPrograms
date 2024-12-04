package isdisplayedNdisEnabled;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsdisabledJsamAppln {

	public static void main(String[] args) throws Exception 
	{

		ChromeDriver d=new ChromeDriver();
		d.get("file:///C:/Users/VedaKarthik/Downloads/grotechminds.html");
		d.manage().window().maximize();
		WebElement e=d.findElement(By.xpath("(/html/body/input)[1]"));
		e.sendKeys("Sowmya");
		WebElement e1=d.findElement(By.xpath("(/html/body/input)[2]"));
		e1.sendKeys("test");
		WebElement e2=d.findElement(By.xpath("(/html/body/input)[3]"));
		e2.sendKeys("Parsi123");
		WebElement e3=d.findElement(By.xpath("(/html/body/form/input)[1]"));
		e3.sendKeys("Sowmya");
		
		Thread.sleep(3000);
		WebElement lastname=d.findElement(By.name("lname"));
		boolean b1=lastname.isDisplayed();
		boolean b2=lastname.isEnabled();
		System.out.println(b1);
		System.out.println(b2);
		if(b1==true && b2==true)
			lastname.sendKeys("sowmya parsi");
		else
			System.out.println("textbox is not enabled");
	}
}
