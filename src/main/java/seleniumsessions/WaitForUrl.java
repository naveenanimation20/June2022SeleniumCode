package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForUrl {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");//parent window

		By ytLink = By.xpath("(//div[@class='orangehrm-login-footer-sm1111']/a)[4]");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.waitForElementVisible(ytLink, 10).click();
		//(tried for 10 second(s) with 500 milliseconds interval)
		
		//window switch code
		
		//driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[4]")).click();//YT
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		
//		if(wait.until(ExpectedConditions.urlContains("OrangeHRMInc"))) {
//			System.out.println(driver.getCurrentUrl());
//		}

		
	}
	
	
	public static String waitForUrlContains(int timeOut, String urlFraction) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if(wait.until(ExpectedConditions.urlContains(urlFraction))) {
			return driver.getCurrentUrl();
		}
		else {
			return null;
		}
	}
	
	public static String waitForUrlIs(int timeOut, String urlValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if(wait.until(ExpectedConditions.urlToBe(urlValue))) {
			return driver.getCurrentUrl();
		}
		else {
			return null;
		}
	}
	
	
	

}
