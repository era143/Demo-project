package com.iMedrix.Unified_I3.Login.Operator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OperatorAndDoctorLogin {

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
        
        System.out.println("Operator Radio button is Selected");
        
        driver.findElement(By.name("signinEmail")).sendKeys("eranna.d@imedrix.com");
		
		driver.findElement(By.name("password")).sendKeys("password");
        
		WebElement rememeberMe = driver.findElement(By.id("mat-checkbox-1"));
		
        rememeberMe.click();
        
        System.out.println("Remember me check box selected");
		
//		driver.findElement(By.xpath("/html/body/app-root/app-sign-in/div/div[2]/mat-card/mat-card-content/form/div/button")).click();
		driver.findElement(By.cssSelector("body > app-root > app-sign-in > div > div.col-lg-6.col-sm-12.col-md-12.col-xs-12.back.h-100 > mat-card > mat-card-content > form > div > button")).click();
		
		Thread.sleep(5000);
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.cssSelector("body > app-root > app-layout > nav > div > ul:nth-child(3) > div > button")).click();
		
		driver.findElement(By.cssSelector("#cdk-overlay-16 > div > div > button:nth-child(2)")).click();
		
		Thread.sleep(1000);
		
		doctorRadio.click();
		
		driver.findElement(By.name("signinEmail")).sendKeys("saikumar.b@imedrix.com");
		
		driver.findElement(By.name("password")).sendKeys("password");
		
		driver.findElement(By.cssSelector("body > app-root > app-sign-in > div > div.col-lg-6.col-sm-12.col-md-12.col-xs-12.back.h-100 > mat-card > mat-card-content > form > div > button")).click();
		
		Thread.sleep(5000);
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
	}

}
