package navigationMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethodPgm {

	public static void main(String[] args) throws Exception
	{
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.navigate().back();
		Thread.sleep(3000);
		//driver.navigate().forward();
		//Thread.sleep(3000);
		driver.navigate().refresh();

	}

}
