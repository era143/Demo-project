package com.iMedrix.Unified_I3.Login.Operator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * This Testcase verification of UI components in the Operator Login Page
 */

public class OperatorLoginUI {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://192.168.1.154/imedrix_backend/i3Unified/#/auth/signin");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
	}

}
