package selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectClsVthKeysFunct {

	public static void main(String[] args)
	{
ChromeDriver d=new ChromeDriver();
d.get("https://www.amazon.com/");
WebElement e= d.findElement(By.id("searchDropdownBox"));
e.sendKeys(Keys.ARROW_DOWN);
e.sendKeys(Keys.ARROW_DOWN);
e.sendKeys(Keys.ARROW_DOWN);
e.sendKeys(Keys.ENTER);


	}

}
