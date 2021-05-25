package com.iMedrix.Unified_I3.Login.IMXAdmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RememberMeAdminCredentials {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://192.168.1.154/imedrix_backend/i3Unified/#/auth/signin/admin");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.name("signinEmail")).sendKeys("v.krishna@imedrix.com");
		
		driver.findElement(By.name("password")).sendKeys("password");
		
//		driver.findElement(By.xpath("/html/body/app-root/app-sign-in/div/div[2]/mat-card/mat-card-content/form/div/button")).click();
		driver.findElement(By.cssSelector("body > app-root > app-adminsign-in > div > div.col-8 > div.col-6.InnerDiv > form > div > button")).click();
		
		Thread.sleep(5000);
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.cssSelector("body > app-root > app-layout > nav > div > ul:nth-child(4) > div > button")).click();
		
		driver.findElement(By.className("mat-menu-item")).click();
		
		Thread.sleep(1000);
		WebElement username = driver.findElement(By.name("signinEmail"));
		String usernameval = username.getAttribute("value");
		
		WebElement password = driver.findElement(By.name("password"));
		String passwordval = password.getAttribute("value");
		
		System.out.println(usernameval+","+ passwordval);
	}

}
