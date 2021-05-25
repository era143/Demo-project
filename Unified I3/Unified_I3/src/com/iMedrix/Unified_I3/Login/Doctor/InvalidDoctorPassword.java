package com.iMedrix.Unified_I3.Login.Doctor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidDoctorPassword {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://192.168.1.154/imedrix_backend/i3Unified/#/auth/signin");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		WebElement operatorRadio = driver.findElement(By.id("mat-radio-2"));
		
        WebElement doctorRadio = driver.findElement(By.id("mat-radio-3"));
        
        WebElement patientRadio = driver.findElement(By.id("mat-radio-4"));
        
        doctorRadio.click();			
        System.out.println("Doctor Radio button is Selected");
		
		driver.findElement(By.name("signinEmail")).sendKeys("saikumar.b@imedrix.com");
		
		driver.findElement(By.name("password")).sendKeys("password1");
		
		driver.findElement(By.cssSelector("body > app-root > app-sign-in > div > div.col-lg-6.col-sm-12.col-md-12.col-xs-12.back.h-100 > mat-card > mat-card-content > form > div > button")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div/div[2]/div/mat-dialog-container/app-signin-alert/div[1]/p")).getText();
		
		System.out.println(driver.findElement(By.xpath("/html/body/div/div[2]/div/mat-dialog-container/app-signin-alert/div[1]/p")).getText());
	
	}

}
