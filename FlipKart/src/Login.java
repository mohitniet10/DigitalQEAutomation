import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) {

		//System.setProperty("webdriver.gecko.driver", "D:\\Infra Sanity\\geckodriver-v0.14.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("LM6RPg")).sendKeys("Dell");
		driver.findElement(By.className("vh79eN")).click();

	}

}
