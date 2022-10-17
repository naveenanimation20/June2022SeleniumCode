package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopUpHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();// browser - ch

		String username = "admin";
		String password = "admin";

		driver.get("https://" + username + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth");

		String mesg = driver.findElement(By.xpath("//div[@id='content']//p")).getText();
		System.out.println(mesg);
		
		driver.navigate().to("abc");

	}

}
