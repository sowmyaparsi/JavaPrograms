package selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassPgm {

	public static void main(String[] args) 
	{
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.amazon.com/");
		d.manage().window().maximize();
	   WebElement e=d.findElement(By.id("searchDropdownBox"));
	   Select s=new Select(e);
	   //s.selectByIndex(4);
	   //s.selectByValue("search-alias=beauty");
	   s.selectByVisibleText("Amazon Resale");
	  
	   

	}

}
