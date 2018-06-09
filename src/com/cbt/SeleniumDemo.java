package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
	public static void main(String[] args) {
	//set system properties
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\amjkh\\Documents\\Selenium Dependencies\\drivers\\chromedriver.exe");
	//create driver object	
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		
		
		driver.get("https://www.amazon.com");

		
	}
}
