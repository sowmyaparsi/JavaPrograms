package com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login {

	public static void main(String[] args) 
	{
ChromeDriver driver= new ChromeDriver();
driver.get("Https://facebook.com");
driver.findElement(By.name("email")).sendKeys("Sowmya");
driver.findElement(By.name("pass")).sendKeys("parsisowmya");
driver.findElement(By.name("login")).click();
//driver.close();
	}

}
