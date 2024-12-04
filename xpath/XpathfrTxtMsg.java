package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathfrTxtMsg {

	public static void main(String[] args) 
	{
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		d.findElement(By.xpath("(//span[.='Grocery'])[2]")).click();
		//System.out.println("Output is"+e1);
	}

}
