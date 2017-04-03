package com.automation.account.orders;

import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.automation.utility.AddressUtility ;

/**
 * 
 * @author mohit ch
 *
 */

public class AddressVerify {
	@Test
	public void testProp() throws Exception {
		Properties obj = AddressUtility .getProperty();
		WebDriver driver=new FirefoxDriver();
		
		driver.get(obj.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath(obj.getProperty("login"))).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(obj.getProperty("mobileno"))).sendKeys(obj.getProperty("username"));
		Thread.sleep(10000);
		driver.findElement(By.xpath(obj.getProperty("password"))).sendKeys(obj.getProperty("pass"));
		Thread.sleep(10000);
		driver.findElement(By.xpath(obj.getProperty("submit"))).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText(obj.getProperty("account"))).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(obj.getProperty("myAddress"))).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(obj.getProperty("deleteAddress"))).click();


		
	

}
}