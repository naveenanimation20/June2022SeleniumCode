package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsCloseSessionId {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();// launch chrome browser//123
		driver.get("https://www.google.com");// enter url//123

		String title = driver.getTitle();// get the title//123
		System.out.println("page title : " + title);//Google

		// close the browser:
		//driver.quit();//123
		driver.close();
		
		//System.out.println(driver.getTitle());//123 -- invalid
		
		driver = new ChromeDriver();// launch chrome browser//456 - new session id
		driver.get("https://www.google.com");//456
		System.out.println(driver.getTitle());//456
		//NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		driver.quit();//456

	}

}

