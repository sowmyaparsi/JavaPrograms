package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonSiginhoverover {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver d=new ChromeDriver();
		d.navigate().to("https://www.amazon.in/");
		d.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e=d.findElement(By.xpath("//span[.='Hello, sign in']"));
		Actions a1=new Actions(d);
		a1.moveToElement(e).perform();
		d.findElement(By.xpath("//span[.='Sign in']")).click();
		
	}

}
