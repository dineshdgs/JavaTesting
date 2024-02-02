package BasicTesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Cross_Browser_Testing {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh K\\eclipse-workspace\\Java_Testing\\driver\\chromedriver.exe");
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dinesh K\\eclipse-workspace\\Java_Testing\\driver\\geckodriver.exe");
    System.setProperty("webdriver.edge.driver", "C:\\Users\\Dinesh K\\eclipse-workspace\\Java_Testing\\driver\\msedgedriver.exe");
	WebDriver chromeDriver = new ChromeDriver();
	WebDriver firefoxDriver = new FirefoxDriver();
	//WebDriver safariDriver = new SafariDriver();
    WebDriver edgeDriver = new EdgeDriver();
	chromeDriver.get("https://www.tba.ai/blogs/an-effective-seo-checklist-to-better-your-seo-results-in-2023");
	//safariDriver.get("https://www.example.com");
	firefoxDriver.get("https://www.tba.ai/blogs/an-effective-seo-checklist-to-better-your-seo-results-in-2023");
    edgeDriver.get("https://www.tba.ai/blogs/an-effective-seo-checklist-to-better-your-seo-results-in-2023");
	String chromeTitle = chromeDriver.getTitle();
	String firefoxTitle = firefoxDriver.getTitle();
	//String safariTitle = safariDriver.getTitle();
    String edgedriverTitle =edgeDriver.getTitle();
	if (chromeTitle.equals(firefoxTitle) && chromeTitle.equals(edgedriverTitle)) {
	    System.out.println("Website is displayed correctly in all browsers.");
	} else {
	    System.out.println("Website is not displayed correctly in all browsers.");
	}
	chromeDriver.quit();
	firefoxDriver.quit();
	//safariDriver.quit();
    edgeDriver.quit();
 
}

}
