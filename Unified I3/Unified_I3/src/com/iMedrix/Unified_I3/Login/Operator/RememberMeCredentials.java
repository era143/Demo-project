package com.iMedrix.Unified_I3.Login.Operator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RememberMeCredentials {

	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://192.168.1.154/imedrix_backend/i3Unified/#/auth/signin");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		WebElement operatorRadio = driver.findElement(By.id("mat-radio-2"));
		
        WebElement doctorRadio = driver.findElement(By.id("mat-radio-3"));
        
        WebElement patientRadio = driver.findElement(By.id("mat-radio-4"));
        
        operatorRadio.click();			
        
        System.out.println("Doctor Radio button is Selected");
        
        driver.findElement(By.name("signinEmail")).sendKeys("eranna.d@imedrix.com");
		
		driver.findElement(By.name("password")).sendKeys("password");
        
		WebElement rememeberMe = driver.findElement(By.id("mat-checkbox-1"));
		
        rememeberMe.click();
        
        System.out.println("Remember me check box selected");
		
//		driver.findElement(By.xpath("/html/body/app-root/app-sign-in/div/div[2]/mat-card/mat-card-content/form/div/button")).click();
		driver.findElement(By.cssSelector("body > app-root > app-sign-in > div > div.col-lg-6.col-sm-12.col-md-12.col-xs-12.back.h-100 > mat-card > mat-card-content > form > div > button")).click();
		
		Thread.sleep(20000);
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.cssSelector("app-layout.ng-star-inserted:nth-child(2) nav.navbar.navbar-inverse.navbar-width-height:nth-child(1) div.container-fluid.navbarfont ul:nth-child(4) div.logout > button.userbtn.mat-button")).click();
		
		driver.findElement(By.cssSelector("#cdk-overlay-1 > div > div > button:nth-child(2)")).click();
		
		Thread.sleep(1000);
		WebElement username = driver.findElement(By.name("signinEmail"));
		String usernameval = username.getAttribute("value");
		
		WebElement password = driver.findElement(By.name("password"));
		String passwordval = password.getAttribute("value");
		
		System.out.println(usernameval+","+ passwordval);
		
	}
	

}
