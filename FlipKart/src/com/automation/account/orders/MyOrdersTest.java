package com.automation.account.orders;

import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.automation.utility.OrderAutomaion;

/**
 * 
 * @author mohit ch
 *
 */

public class MyOrdersTest {
	@Test
	public void testProp() throws Exception {
		Properties obj = OrderAutomaion.getProperty();
		WebDriver driver=new FirefoxDriver();
		
		driver.get(obj.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id(obj.getProperty("login"))).click();
		Thread.sleep(1000);
		driver.findElement(By.id(obj.getProperty("mobileno"))).sendKeys(obj.getProperty("username"));
		Thread.sleep(1000);
		driver.findElement(By.id(obj.getProperty("password"))).sendKeys(obj.getProperty("pass"));
		Thread.sleep(1000);
		driver.findElement(By.id(obj.getProperty("submit"))).click();
		Thread.sleep(1000);
		driver.findElement(By.id(obj.getProperty("account"))).click();
		Thread.sleep(1000);
		driver.findElement(By.id(obj.getProperty("myorders"))).click();
		Thread.sleep(1000);
		driver.findElement(By.id(obj.getProperty("vieworders"))).click();


		
	

}
}
