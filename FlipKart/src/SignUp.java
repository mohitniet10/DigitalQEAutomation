
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.FileInputStream;
import java.util.Properties;

public class SignUp {

	public static void main(String[] args)throws Exception {
		Properties obj = new Properties();   
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\objects.properties");
		//System.setProperty("webdriver.gecko.driver", "D:\\Infra Sanity\\geckodriver-v0.14.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		obj.load(objfile);
		WebDriver driver=new FirefoxDriver();
		driver.get(obj.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(20000);
		driver.findElement(By.xpath(obj.getProperty("signup"))).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(obj.getProperty("one"))).sendKeys(obj.getProperty("username"));
		Thread.sleep(2000);
		driver.findElement(By.xpath(obj.getProperty("mail"))).sendKeys(obj.getProperty("email"));
		Thread.sleep(2000);
		driver.findElement(By.xpath(obj.getProperty("two"))).sendKeys(obj.getProperty("pass"));
		Thread.sleep(20000);
	driver.findElement(By.xpath(obj.getProperty("three"))).click();
	//Thread.sleep(20000);
	//driver.findElement(By.className("uiIconText _5qtp")).click();
	//driver.findElement(By.cssSelector("._3en1._480e")).click();.uiIconText._5qtp
	//Thread.sleep(1000);
	//driver.findElement(By.cssSelector("._3en1._480e")).sendKeys(obj.getProperty("message"));
	//Thread.sleep(20000);
	//driver.findElement(By.cssSelector("._1mf7._4jy0._4jy3._4jy1._51sy.selected._42ft")).click();

	


	}

}