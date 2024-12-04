
package com;

import org.openqa.selenium.chrome.ChromeDriver;

public class SampleProgram {


	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		//driver.close();
		System.out.println(driver.getWindowHandle());
		driver.quit();
	}

}
