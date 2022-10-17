package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		// open browser : chrome
		// launch url : google.com
		// get the title
		// verify the title : act vs exp
		// close the browser

		// download chromedriver.exe file - configure it

		// windows:
		// System.setProperty("webdriver.chrome.driver",
		// "c:\\users\\naveen\\downloads\\chromedriver.exe");

		// mac:

		// automation Steps:
		System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();// launch chrome browser
		driver.get("https://www.google.com");// enter url

		String title = driver.getTitle();// get the title
		System.out.println("page title : " + title);

		// verification point: act vs exp result // checkpoint
		if (title.equals("Google")) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

		String url = driver.getCurrentUrl();
		System.out.println(url);

		String source = driver.getPageSource();
		// System.out.println(source);
		if (source.contains("Copyright The Closure Library Authors")) {
			System.out.println("Pass");
		}

		// close the browser:
		driver.quit();
		// driver.close();

	}

}
