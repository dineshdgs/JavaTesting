package BasicTesting;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinkTesting {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dinesh K\\eclipse-workspace\\Crm_Testing\\driver\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(ops);
		driver.get("https://www.empowertherapywellness.com/why-empower/");
		driver.manage().window().maximize();
		/*
		 * WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		 * email.sendKeys("saravanaprasad@theinfinityhub.com"); WebElement password =
		 * driver.findElement(By.xpath("//input[@id='password']"));
		 * password.sendKeys("Sksking96@"); WebElement submit =
		 * driver.findElement(By.xpath("//button[@type='submit']")); submit.click();
		 * Thread.sleep(5000);
		 */

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(" Number of Links are " + links.size());
		List<String> urllist = new ArrayList<String>();

		for (WebElement link : links) {
			String url = link.getAttribute("href");
			// urllist.add(url);
			Checkbrokenlink(url);

		}

		driver.quit();

	}

	public static void Checkbrokenlink(String linkurl) {

		try {
			URL url = new URL(linkurl);
			HttpURLConnection httpurlconnect = (HttpURLConnection) url.openConnection();
			httpurlconnect.setConnectTimeout(5000);
			httpurlconnect.connect();

			if (httpurlconnect.getResponseCode() >= 400) {
				System.out.println(linkurl + " " + httpurlconnect.getResponseMessage()
						+ httpurlconnect.getResponseCode() + " is a broken link ");
			} else {
				System.out.println(linkurl + " " + httpurlconnect.getResponseMessage()
						+ httpurlconnect.getResponseCode() + "is a valid link");

			}

		} catch (Exception e) {

		}

	}

}
