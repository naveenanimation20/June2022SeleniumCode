package seleniumsessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SeleniumTopCasting {

	public static void main(String[] args) {

		
		//1. chrome/FF/Safari/Edge
		//valid
		//ChromeDriver driver = new ChromeDriver();
		
		//valid
		//2. WD - CD
		//run test cases locally
//		WebDriver driver = new ChromeDriver();
//		driver = new FirefoxDriver();
//		driver = new SafariDriver();
//		driver = new EdgeDriver();
		
		//3. valid but not useful
		//SearchContext driver = new ChromeDriver();
		
		//4. valid and useful
		//RemoteWebDriver driver = new ChromeDriver();
		
		//5. WD - RWD : valid and userful
		//to run test cases on remote machine -- cloud, server, grid, AWS
		//WebDriver driver = new RemoteWebDriver(new URL("https://192.190.10.11/wd/hub"), capabilities);
		
		//6. SC -- RWD: valid and not useful
		
		
		
		
	}

}
