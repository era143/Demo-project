package com.iMedrix.Unified_I3.Login.IMXAdmin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminLoginUI {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://192.168.1.154/imedrix_backend/i3Unified/#/auth/signin/admin");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
	}

}
