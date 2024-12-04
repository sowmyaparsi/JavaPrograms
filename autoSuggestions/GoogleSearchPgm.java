package autoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchPgm {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Bangalore");
		//driver.findElement(By.name("btnK")).click();
		Thread.sleep(2000);
		List<WebElement> e2=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int length=e2.size();
		System.out.println(length);
		
		for(int i=0;i<length-1;i++)
		{
		WebElement a=e2.get(i);
		String element=a.getText();
		System.out.println(element);
		}
		e2.get(length-3).click();
		
	}

}
