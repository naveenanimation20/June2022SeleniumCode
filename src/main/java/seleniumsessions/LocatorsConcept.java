package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		
		//

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		// 1. id: unique -- I
		//By.id("test");

		// 2. name: can be duplicate -- II
//		driver.findElement(By.name("email")).sendKeys("test@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("test@123");
		
		//100 --> id = username --1 ele
		//100 --- name = test -- 5 eles
		
		//By.type - NA
		
		//3. className: can be duplicate most of the time for diff elements -- III
		//driver.findElement(By.className("form-control")).sendKeys("naveen");
		
		//4. linkText: only for links
		//htmltag = <a>
		//anchor tag
		//driver.findElement(By.linkText("Login")).click();
		
		//5. partialLinkText:only for links
		// Forgotten username
		// Forgotten password
		// hi this is my login link
//		driver.findElement(By.partialLinkText("Forgotten")).click();
//		driver.findElement(By.partialLinkText("my login")).click();
		
		//6. xpath: address of the web element on the page (DOM)
		//its not an attribute
		//driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("naveen");
		//driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		
		
		//7. css selector:
		//its not an attribute
		//driver.findElement(By.cssSelector("#input-lastname")).sendKeys("testing");
		

		//8. tag name:
		//html tag: not an attribute
		//driver.findElement(By.tagName("input")).sendKeys("testing");
//		String header = driver.findElement(By.tagName("h1")).getText();
//		System.out.println(header);
		
		By header = By.tagName("h1");
		By recPayment = By.linkText("Recurring payments");
		By warnMesg = By.className("alert");
		
		By continueBtn = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		
		
		String actHeader = doGetText(header);
		if(actHeader.equals("Register Account")) {
			System.out.println("correct header");
		}
		else {
			System.out.println("incorrect header");
		}
		
		//
		String recPaymentText = doGetText(recPayment);
		System.out.println(recPaymentText);
		
		
		//
		doClick(continueBtn);
		
		String warMesgValue = doGetText(warnMesg);
		System.out.println(warMesgValue);
	}
	
	public static String doGetText(By locator) {
		return getElement(locator).getText();
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	
	
	
	
	

}
