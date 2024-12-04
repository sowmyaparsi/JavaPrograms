package com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Amazon {

	public static void main(String[] args) {
ChromeDriver driver =new ChromeDriver();
driver.get("https://amazon.in");
driver.manage().window().maximize();
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe");
//driver.findElement(By.id("nav-search-submit-button")).click();
driver.findElement(By.id("nav-search-submit-button")).sendKeys(Keys.ENTER);

	}

}
