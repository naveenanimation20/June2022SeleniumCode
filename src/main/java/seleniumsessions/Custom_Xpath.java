package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_Xpath {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");

		
		//xpath - address of the element in DOM
		
		//1. abs xpath : /html/body/header/div/div/div[2]/div/input
		//2. relative/custom xpath:
		
		//htmltag[@attr='value']
		//input[@name='email']
		
		//By emailId = By.xpath("//input[@name='email']");
		
		
		//htmltag[@attr1='value' and @attr2='value']
		//input[@name='email' and @type='text']
		//input[@name='email' and @type='text' and @id='input-email']
		//input[@type='text' and @placeholder='E-Mail Address']
		//input[@class='form-control' or @type='text']
		
		//text():
		//htmltag[text()='value']
		//h2[text()='Returning Customer']
		//a[text()='Wish List']
		
		//text() with attr:
		//htmltag[@attr='value' and text()='value']
		//a[@class='list-group-item' and text()='Wish List']
		//a[text()='Wish List' and @class='list-group-item' ]
		
		//htmltag[@attr1='value' and @attr2='value' and text()='value']
		
		//contains() with attr:
		//htmltag[contains(@attr,'value')]
		//input[contains(@id,'email')]
		//input[contains(@id,'password')]
		
		//dynamic attr:
		// <input id='firstname_123'>
		// <input id='firstname_456'>
		// <input id='firstname_12344'>
		
		//input[contains(@id,'firstname_')]
		
		//contains() with text():
		//htmltag[contains(text(),'value')]
		//p[contains(text(),'easy-to-use')]
		
		//h1[contains(text(),'Love your software')]
		//h1[text()='Love your software']
		//a[contains(text(),'Directors')]
		//a[text()='Board of Directors']
		//a[contains(text(),'Amazon')]
		
		//contains() with text() and contains() with attr:
		//htmltag[contains(@attr,'value') and contains(text(),'value')]
		//htmltag[contains(text(),'value') and contains(@attr,'value')]
		//a[contains(text(),'About Amazon') and contains(@class,'nav_a')]
		
		//contains() with text() and attr:
		//htmltag[contains(text(),'value') and @attr='value']
		//a[contains(text(),'About') and @class='nav_a']
		
		//contains() with attr1 and attr2
		//htmltag[contains(@attr1,'value') and @attr2='value']
		//input[contains(@name,'keywords') and @id='twotabsearchtextbox']
		
		//a[contains(@href,'nav_cs_help')]
		//a[contains(@href,'route=account/login')]
		
		//starts-with():
		//htmltag[starts-with(@attr,'value')]
		//input[starts-with(@name,'field')]
		//a[starts-with(text(),'Fresh')]
		
		//ends-with() in xpath: NA
		
		//index:
		// (//input[@class='form-control'])[1]
		//By firstName = By.xpath("(//input[@class='form-control'])[1]");
		// (//input[@class='form-control'])[position()=1]
		// (//input[@class='form-control'])[last()]
		// (//input[@class='form-control'])[last()-1]
		
		//By help = By.xpath("(//div[@class='navFooterVerticalRow navAccessibility']//a)[last()]");
		// (//div[@class='navFooterVerticalRow navAccessibility']//a)[last()]
		// (//div[@class='navFooterVerticalRow navAccessibility']//a)[last()-1]
		
		//InvalidSelectorException - invalid xpath or any locator
		//driver.findElement(By.xpath("//////input[$#$#id=username']")).sendKeys("test@gmail.com");
		
		//form-control private-form__control login-email
		//form-control private-form__control login-password m-bottom-3
		
		//invalid
		//driver.findElement(By.className("form-control private-form__control login-email")).sendKeys("test@gmail.com");
		//InvalidSelectorException: Compound class names not permitted
		
		
		//valid
		//driver.findElement(By.xpath("//input[@class='form-control private-form__control login-email']")).sendKeys("test@gmail.com");
		
		//valid
		//className -- only one single class is allowed
//		driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.className("login-password")).sendKeys("test@123");
		
		//invalid
		//driver.findElement(By.className("private-form__control login-email"));
		
		//valid
		driver.findElement(By.cssSelector(".form-control.private-form__control.login-email")).sendKeys("test@gmail.com");
		
		//invalid - NSE
		//driver.findElement(By.cssSelector("form-control private-form__control login-email")).sendKeys("test@gmail.com");
				
		
		
		//NSE
		//driver.findElement(By.xpath("//input[@class='private-form__control login-email']")).sendKeys("test@gmail.com");
		
		//div[@class='private-form__input-wrapper']/child::input[@id='username']
		
		//input[@id='username']/../../../../../../../../../..
		
		
		//*[@id='username'] --200
		//input[@id='username']

		//*[@id] -- 17 out of 200
		//input[@id] -- 3 out of 200
		
	}

}
