package seleniumsessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlerWithList {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://classic.crmpro.com/index.html");
		Thread.sleep(4000);

		driver.findElement(By.linkText("Sign Up")).click();
		Thread.sleep(2000);

		Set<String> handles = driver.getWindowHandles();

		// set to list:
		List<String> handlesList = new ArrayList<String>(handles);

		String parentWindowId = handlesList.get(0);
		System.out.println("parent window id : " + parentWindowId);

		String childWindowId = handlesList.get(1);
		System.out.println("child window id : " + childWindowId);

		// switching
		driver.switchTo().window(childWindowId);
		Thread.sleep(2000);
		System.out.println("child window title : " + driver.getTitle());
		driver.findElement(By.name("first_name")).sendKeys("naveen");
		// close child window:
		driver.close();

		driver.switchTo().window(parentWindowId);
		System.out.println("parent window title : " + driver.getTitle());

		driver.quit();

	}

}
