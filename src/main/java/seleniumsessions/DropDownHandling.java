package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandling {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// drop down : select tag is mandatory
		// tag name : select --> option
		// Select class in Selenium

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		WebElement country = driver.findElement(By.id("Form_getForm_Country"));
		// country.sendKeys("India");

		Select sel = new Select(country);
		
		List<WebElement> countryOptions = sel.getOptions();
		
		System.out.println("total options: " + (countryOptions.size()-1));
		
		for(WebElement e : countryOptions) {
			String text = e.getText();
			System.out.println(text);
		}
		
		
		
		
		

		// sel.selectByIndex(5);
		// sel.selectByVisibleText("India");
		// sel.selectByValue("Armenia");

		// 10 drop downs --> 10 times
		
		//By country = By.id("Form_getForm_Country");
//		doSelectDropDownByIndex(country, 20);
//		doSelectDropDownByIndex(country, 30);
//		doSelectDropDownByVisibleText(country, "India");
//		doSelectDropDownByValue(country, "Brazil");
		
	}
	
	public static void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void doSelectDropDownByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	
	public static void doSelectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static List<WebElement> getDropDownOptions(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions();
	}
	
	public static int getDropDownOptionsCount(By locator) {
		return getDropDownOptions(locator).size();
	}
	
	
	

}
