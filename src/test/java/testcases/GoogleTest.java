package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

	@Test(priority = 1)
	public void searchTest() {
		boolean flag = driver.findElement(By.name("q")).isDisplayed();
		System.out.println(flag);
		Assert.assertEquals(flag, false);
	}

	@Test(priority = 2)
	public void pageTitleTest() {
		String title = driver.getTitle();
		System.out.println("page title: " + title);
		Assert.assertEquals(title, "Google");
	}

}

