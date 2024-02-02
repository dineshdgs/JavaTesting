package BasicTesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Security_Testing {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh K\\eclipse-workspace\\Java_Testing\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.1clxlite.com/");

		String pageSource = driver.getPageSource();

		if (pageSource.contains("<script>") || pageSource.contains("eval(") || pageSource.contains("document.cookie")) {
		    System.out.println("No security");
		} else {
		    System.out.println("Fully secured");
		}
		driver.quit();

		
	}

}
