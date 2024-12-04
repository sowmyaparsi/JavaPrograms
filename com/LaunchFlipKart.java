package com;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFlipKart {

	public static void main(String[] args)
	{
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
	}

}
