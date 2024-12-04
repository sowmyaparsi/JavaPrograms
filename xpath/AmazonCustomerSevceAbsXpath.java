package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCustomerSevceAbsXpath {

	public static void main(String[] args) throws Exception 
	{
		ChromeDriver d=new ChromeDriver();
		d.navigate().to("https://www.amazon.in/");
		d.manage().window().maximize();
		Thread.sleep(3000);
		d.findElement(By.xpath("(((//header/div/div)[5]/div)[2]/div/div/a)[9]")).click();
	}

}
