import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cookies {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver-v0.15.0-win64\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
Set <Cookie> cookies=driver.manage().getCookies();
System.out.println("size of cookies"+cookies.size());
	}

}
