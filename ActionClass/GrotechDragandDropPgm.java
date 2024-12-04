package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GrotechDragandDropPgm {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver d=new ChromeDriver();
		d.get("https://grotechminds.com/drag-and-drop/");
		d.manage().window().maximize();
		WebElement e1=d.findElement(By.xpath("((//div[@class='cont']/div)[3]/span/div/img)[1]"));
		WebElement e2=d.findElement(By.xpath("(//div[@class='cont']/div)[2]"));
		Actions a=new Actions(d);
		a.dragAndDrop(e1, e2).perform();
		Thread.sleep(2000);
		a.dragAndDrop(e2, e1).perform();
	}

}
