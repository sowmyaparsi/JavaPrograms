package autoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutoSuggtnPgm {

	public static void main(String[] args) throws Exception 
	{
		 ChromeDriver d=new ChromeDriver();
		 d.get("https://amazon.in");
		 d.manage().window().maximize();
		 d.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
		 Thread.sleep(2000);
		 List<WebElement> e1=d.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		 Thread.sleep(2000);
		 int len=e1.size();
		 System.out.println(len);
		 for(int i=0;i<len-1;i++)
		 {
		 WebElement a=e1.get(i);
		 String s=a.getText();
		 System.out.println(s);
		 }
		 e1.get(len-5).click();
		d.close(); 
	}
}



