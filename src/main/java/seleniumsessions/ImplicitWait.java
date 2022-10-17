package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {

	public static void main(String[] args) {

		//ImplicitWait:
			//1. global wait
			//2. it will be applied on all the web elements by default
			//3. applied after the driver decalration
			//4. not recommended
			//5. it does not support non web elements -- title, url, alerts
		
			//we never use imp wait in framework
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement emailid = driver.findElement(By.id("input-email11"));
		emailid.sendKeys("naveen@gmail.com");
		
		//login page: 10 secs
		//e1 - 5 secs --> 10-5 = 5 secs (ignored)
		//e2 -- 0 sec --> 10-0 = 10 secs (ignored)
		//e3
		
		//home page: 5 secs
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//e4
		//e5
		//e6
		
		//login page: 10 secs:
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//register page: 0 sec: nullify imp wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

		
		
		
	}

}
