package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExcConcept {

	public static void main(String[] args) throws InterruptedException {

		//browser -- JS
		//CD - RWD - WD
		//	RWD - JSE -- executeScript()	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		js.executeScript("alert('hello java')");
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
//		jsUtil.generateAlert("hello CRM");
		
		//jsUtil.refreshBrowserByJS();
		
//		String pageText = jsUtil.getPageInnerText();
//		
//		System.out.println(pageText);
//		System.out.println(pageText.contains("Marketing Automation"));
		
		//System.out.println(jsUtil.getTitleByJS());
		
		//1. click
		//2. actions click
		//3. js click
		//WebElement loginbtn = driver.findElement(By.xpath("//input[@value='Login']"));
//		jsUtil.clickElementByJS(signup);
		
		//jsUtil.flash(loginbtn);
		
//		jsUtil.scrollPageDown();
//		Thread.sleep(2000);
//		jsUtil.scrollPageUp();
//		Thread.sleep(2000);
//		jsUtil.scrollPageDown();
		
		WebElement books = driver.findElement(By.xpath("//span[text()='Top Sellers in Books for you']"));
		jsUtil.scrollIntoView(books);
		
		jsUtil.drawBorder(books);

	}

}
