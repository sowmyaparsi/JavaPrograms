package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartRightClick {

	public static void main(String[] args) throws InterruptedException
	{

		ChromeDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com");
		d.manage().window().maximize();
	  Thread.sleep(3000);
	  WebElement e=d.findElement(By.linkText("Mobiles"));
	  Thread.sleep(2000);
	  Actions a1=new Actions(d);
	  a1.contextClick(e).perform();
	  System.out.println("welcome");
	  
	  
	}

}
