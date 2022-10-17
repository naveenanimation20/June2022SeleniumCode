package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CRMClick {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		driver.findElement(By.xpath("//div[@class='container']//a[text()='Sign Up']")).click();
		Thread.sleep(2000);
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		it.next();
		String chilId = it.next();
		driver.switchTo().window(chilId);
		
		driver.findElement(By.xpath("//form[@id='multipleForm']//input[@name='first_name']")).sendKeys("sarita");
		
		
		Thread.sleep(2000);

		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String mand_text = 
					js.executeScript("return window.getComputedStyle(document.querySelector(\".form-control-feedback.glyphicon.glyphicon-ok\"),'::before').getPropertyValue('content')")
						.toString();
		
		System.out.println(mand_text);


	}
}
