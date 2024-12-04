package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsamApplnInReltivXpath {

	public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver();
		d.get("file:///C:/Users/VedaKarthik/Downloads/grotechminds.html");
		d.manage().window().maximize();
		WebElement e1=d.findElement(By.xpath("//input[@name='username']"));
		e1.sendKeys("test1");
		
	}

}
