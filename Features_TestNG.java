package com.testNG;

import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Features_TestNG {
	
		public static WebDriver driver;
	
	 	@BeforeSuite
		public void browser_Launch() {
	 		driver = new ChromeDriver();
	 		driver.get("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	 		driver.manage().window().maximize();
		}

		@Test(priority = -1)
		public void Login() {
			driver.findElement(By.id("ap_email")).sendKeys("harishvasanthi1409@gmail.com");
			driver.findElement(By.id("ap_password")).sendKeys("vasanthiharish");
			driver.findElement(By.id("signInSubmit")).click();
		}
		
		@Test(dependsOnMethods = "Login")
		public void Search() {
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iQOO Z7 5G");
			driver.findElement(By.id("nav-search-submit-button")).click();
		}
		
		@Test(timeOut = 8000)
		public void Select_Mobiles() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
			driver.findElement(By.xpath("(//button[text()='Add to Cart'])[1]")).click();
		}
		
		@Test(dependsOnMethods = "Select_Mobiles")
		public void AddCart_Page() {
			driver.findElement(By.id("nav-cart-count")).click();
		}

		@AfterSuite
		public void ScreenShot() throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File SRC = ts.getScreenshotAs(OutputType.FILE);
			File DES = new File("C:\\Users\\inbaraj\\eclipse-workspace\\Maven_TCF\\src\\test\\java\\com\\testNG\\Feature_TestNG.png");
			FileUtils.copyFile(SRC, DES);
		}

}
