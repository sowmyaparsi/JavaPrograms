package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartDoubleClick {

	public static void main(String[] args) throws Exception
	{
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com");
		d.manage().window().maximize();
	  Thread.sleep(3000);
	  WebElement e=d.findElement(By.xpath("//span[.='Mobiles'][1]"));
	  Thread.sleep(2000);
	  Actions a1=new Actions(d);
	  a1.doubleClick(e).perform();
	}
}
	  
	  