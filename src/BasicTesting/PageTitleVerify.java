package BasicTesting;

import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTitleVerify {
	public static WebDriver driver;
	
	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh K\\eclipse-workspace\\Java_Testing\\driver\\chromedriver.exe");
        driver =new ChromeDriver();
		driver.get("https://www.1clx.com/");
		driver.manage().window().maximize();
		String expectedTitle = "Tag Expo | Textiles"; 
		//Get page title
		String actualTitlte=driver.getTitle();
		System.out.println("actualPagetitle is " + actualTitlte);   
		  if (actualTitlte.equalsIgnoreCase(expectedTitle)) {
			  System.out.println("title matched");
			
		} else {
			System.out.println("title didn't match");

		}
		  driver.quit();
		 
		}
		 
	}
	
	 
