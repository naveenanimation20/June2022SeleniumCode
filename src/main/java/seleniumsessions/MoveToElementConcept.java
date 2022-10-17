package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

//		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
//		
//		By content = By.className("menulink");
//		By courses = By.linkText("COURSES");
//		handleLevel1MenuItems(content, courses);
		
		driver.get("https://www.spicejet.com/");
		By parentMenu = By.xpath("//div[text()='Add-ons']");
		By childMenu = By.xpath("//div[text()='Friends and Family']");
		handleLevel1MenuItems(parentMenu, childMenu);
	}

	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	public static void handleLevel1MenuItems(By parentMenu, By childMenu) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentMenu)).build().perform();
		Thread.sleep(3000);
		getElement(childMenu).click();
	}
	
	
	public static void handleLevel2MenuItems(By parent1Menu, By parent2Menu, By childMenu) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parent1Menu)).build().perform();
		Thread.sleep(3000);
		act.moveToElement(getElement(parent2Menu)).build().perform();
		Thread.sleep(3000);
		getElement(childMenu).click();
	}
	
	
	
	
	

}
