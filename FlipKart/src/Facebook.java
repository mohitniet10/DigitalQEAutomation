import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.automation.utility.AutomationUtility;

/**
 * 
 * @author mohit ch
 *
 */
public class Facebook {

	@Test
	public void testProp() throws Exception {
		Properties obj = AutomationUtility.getProperty();
		WebDriver driver=new FirefoxDriver();
		driver.get(obj.getProperty("url"));
		driver.manage().window().maximize();
		driver.findElement(By.id(obj.getProperty("one"))).sendKeys(obj.getProperty("username"));
		driver.findElement(By.id(obj.getProperty("two"))).sendKeys(obj.getProperty("pass"));

	driver.findElement(By.xpath(obj.getProperty("three"))).click();
	Thread.sleep(20000);
	//driver.findElement(By.className("uiIconText _5qtp")).click();
	//driver.findElement(By.cssSelector("._3en1._480e")).click();.uiIconText._5qtp
	//Thread.sleep(1000);
	driver.findElement(By.cssSelector("._3en1._480e")).sendKeys(obj.getProperty("message"));
	Thread.sleep(20000);
	driver.findElement(By.cssSelector("._1mf7._4jy0._4jy3._4jy1._51sy.selected._42ft")).click();
	}

}