package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PesudoElementHandle {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		String fn_JScript = "return window.getComputedStyle(document.querySelector(\"label[for='input-lastname']\"), '::before').getPropertyValue('content')";
		checkElementIsMandatory(fn_JScript);
	}

	public static boolean checkElementIsMandatory(String jsScript) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		String man_text = js.executeScript(jsScript).toString();

		System.out.println(man_text);

		if (man_text.contains("*")) {
			System.out.println("ele is a mandatory field");
			return true;
		} else {
			System.out.println("FN is not a mandatory field");
			return false;
		}

	}

}
