package com.iMedrix.Unified_I3.Login.Operator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmptyOperatorUsername {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://192.168.1.154/imedrix_backend/i3Unified/#/auth/signin");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());

		WebElement operatorRadio = driver.findElement(By.id("mat-radio-2"));
		
        WebElement doctorRadio = driver.findElement(By.id("mat-radio-3"));
        
        WebElement patientRadio = driver.findElement(By.id("mat-radio-4"));
        
        operatorRadio.click();			
        
        System.out.println("Operator Radio button is Selected");
        
        WebElement loginButton = driver.findElement(By.cssSelector("body > app-root > app-sign-in > div > div.col-lg-6.col-sm-12.col-md-12.col-xs-12.back.h-100 > mat-card > mat-card-content > form > div > button"));
		
		driver.findElement(By.name("signinEmail")).sendKeys("");
		
		driver.findElement(By.name("password")).sendKeys("password1");
		
		boolean actualValue = loginButton.isEnabled();

		if (actualValue) {
			System.out.println("Login Button is enabled");
		}else {
			System.out.println("LoginButton is disabled");
		}
		       
	}

}
