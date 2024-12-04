package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartShoesHoverover {

	public static void main(String[] args) throws Exception 
	{
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e=d.findElement(By.xpath("//span[.='Fashion'][1]"));
		Actions a1=new Actions(d);
		a1.moveToElement(e).perform();
		WebElement e1=d.findElement(By.xpath("((//object)[1]/a)[4]"));
		a1.moveToElement(e1).perform();
		d.findElement(By.linkText("Men's Sports Shoes")).click();
		
	}
	}


