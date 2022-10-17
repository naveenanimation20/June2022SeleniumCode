package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	public static void main(String[] args) {

		
		//right click or context click
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement rightClkEle = driver.findElement(By.cssSelector("span.context-menu-one"));
		
		Actions act = new Actions(driver);
		
		act.contextClick(rightClkEle).build().perform();
		
		List<WebElement> optionsList = driver.findElements(By.xpath("//ul[contains(@class,'context-menu-list')]/li/span"));
		
		System.out.println(optionsList.size());
		
		
		for(WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
				if(text.equals("Copy")) {
					e.click();
					break;
				}
		}
		
		
		
		
	}

}
