package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		// explicit wait
		// its applied for a specific element, not for all the elements
		// not a global wait
		// can be used for non web elements: title, url, alerts
		// polling/interval
		// 1. webdriverwait
		// 2. fluentwait

		// WebDriverWait(c) -- extends --> FluentWait(c) ---implements--> Wait(I) -
		// until();

		// FluentWait(c) -- unit() -- @override + other methods

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By emailId = By.id("input-email");
		By pwd = By.id("input-password");
		By logo = By.cssSelector("img.img-responsive");

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		
//		WebElement email_el = wait.until(ExpectedConditions.presenceOfElementLocated(emailId));
//		email_el.sendKeys("naveen@gmail.com");
//		
//		driver.findElement(pwd).sendKeys("test@123");
//		
//		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
//		WebElement logo_el = wait1.until(ExpectedConditions.presenceOfElementLocated(logo));
//		boolean flag = logo_el.isDisplayed();
//		System.out.println(flag);

		// boolean flag = driver.findElement(logo).isDisplayed();
		// System.out.println(flag);

		waitForElementPresence(emailId, 10).sendKeys("test@gmail.com");
		getElement(pwd).sendKeys("test@123");
		if (waitForElementPresence(logo, 5).isDisplayed()) {
			System.out.println("logo is present");
		}

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	
	//An expectation for checking that an element is present on the DOM of a page. 
	//This does not necessarily mean that the element is visible.
	public static WebElement waitForElementPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page and visible. 
	 * Visibility means that the element is not only displayed but also has a height and width that is greater than 0.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static WebElement waitForElementVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	
	
	

}
