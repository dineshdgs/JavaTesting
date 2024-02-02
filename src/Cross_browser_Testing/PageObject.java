package Cross_browser_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject {
	public static WebElement userName(WebDriver driver) {
		return driver.findElement(By.name(""));

	}

}
