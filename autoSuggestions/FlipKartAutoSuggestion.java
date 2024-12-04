package autoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartAutoSuggestion {

	public static void main(String[] args) throws Exception 
	{
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		WebElement e1=d.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		e1.sendKeys("Shoe");
		Thread.sleep(7000);
		List<WebElement> e2=d.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc']/li"));
		Thread.sleep(7000);
		System.out.println(e2);
		int len=e2.size();
		System.out.println(len);
		d.close();
	}

}
