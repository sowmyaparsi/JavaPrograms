package com;

import org.openqa.selenium.chrome.ChromeDriver;

public class RightClickDisablepgm {

	public static void main(String[] args) 
	{
		ChromeDriver d=new ChromeDriver();
		d.get("https://retail.onlinesbi.sbi/npersonal/");
		d.manage().window().maximize();
		
		
	}

}
