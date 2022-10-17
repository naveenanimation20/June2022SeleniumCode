package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IntervalTime {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");//parent window

		By ytLink = By.xpath("(//div[@class='orangehrm-login-footer-sm1111']/a)[4]");
		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.waitForElementVisible(ytLink, 10).click();
		//(tried for 10 second(s) with 500 milliseconds interval)
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofMillis(2000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ytLink)).click();
		//(tried for 10 second(s) with 2000 milliseconds interval)
		

	}

}
