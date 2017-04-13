package com.automation.account.orders;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;


public class AppiumTest {

 public AndroidDriver dr;
 
 @Test
 public void call() throws MalformedURLException{
  
  DesiredCapabilities capabilities = new DesiredCapabilities();
  capabilities.setCapability("deviceName", "ASUS_Z010D");
  capabilities.setCapability("platformVersion", "6.0.1");
  capabilities.setCapability("platformName", "Android");
  capabilities.setCapability("appPackage", "com.asus.contacts");
  capabilities.setCapability("appActivity", "com.android.contacts.activities.DialtactsActivity");



  dr = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
  
  //dr.findElement(By.id("com.android.dialer:id/floating_action_button")).click();
  
  //Dial a number
//  dr.findElement(By.id("com.android.dialer:id/one")).click();
//  dr.findElement(By.id("com.android.dialer:id/one")).click();
 // dr.findElement(By.id("com.android.dialer:id/one")).click();
  
  
  //Dialing a number
 // dr.findElement(By.id("com.android.dialer:id/dialpad_floating_action_button")).click();
 
 }
}