package selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClsPgmGrotech {

	public static void main(String[] args) throws Exception {
		ChromeDriver d = new ChromeDriver();
		d.get("https://grotechminds.com");
		d.manage().window().maximize();
		Thread.sleep(3000);
	/*	WebElement e2 = d.findElement(By.linkText("Automate me"));
		e2.click();
		Thread.sleep(3000);
		WebElement e3 = d.findElement(By.className("elementor-flip-box__button"));
		if (e3.isDisplayed()) {
			e3.click();
		}*/
		d.get("https://grotechminds.com/registration/");
		WebElement e = d.findElement(By.id("Skills"));
		Select s = new Select(e);
		s.selectByVisibleText("Technical Skills");
		Thread.sleep(3000);
		WebElement e1 = d.findElement(By.id("Country"));
		Select s1 = new Select(e1);
		s1.selectByValue("United States");
		Thread.sleep(3000);
		WebElement e4 = d.findElement(By.id("Relegion"));
		Select s2 = new Select(e4);
		s2.selectByValue("Hindu");

	}

}
