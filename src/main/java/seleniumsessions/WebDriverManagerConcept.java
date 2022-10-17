package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {

		
		
		//System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver");

		
		//.exe(100) --102 ---> chrome(100) --> 102
		
		
		//WDM - 3rd party lib
		//chrome 100 ---> system --> .exe 100
		//chrome 101 ---> system ----> .exe 100 --> 101
		//chrome 102 ---> 102.exe
		//chrome 95 ---> 95.exe
		//chrome 102 --> if 102.exe --> yes -- no need to download
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		System.out.println(driver.getTitle());

		driver.quit();
		
		
		
	}

}
