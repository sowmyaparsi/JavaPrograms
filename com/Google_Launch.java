package com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Launch {

	public static void main(String[] args) {		
ChromeDriver driver= new ChromeDriver();
driver.get("https://www.google.com");
driver.manage().window().maximize();
driver.findElement(By.name("q")).sendKeys("India");
driver.findElement(By.name("btnK")).click();
driver.close();
	}

}
