package BasicTesting;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBroken {
  public static void main(String[] args) {
    // Set up the web driver
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh K\\eclipse-workspace\\Java_Testing\\driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    // Navigate to the website to be tested
    driver.get("https://www.1clxlite.com/features");

    // Find all the links on the page
    List<WebElement> links = driver.findElements(By.tagName("a"));

    // Check each link for a 200 (OK) response
    for (WebElement link : links) {
      String linkUrl = link.getAttribute("href");
      try {
        URL url = new URL(linkUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setConnectTimeout(3000);
        connection.connect();

        if (connection.getResponseCode() != 200) {
          System.out.println("Broken link: " + linkUrl);
        }
      } catch (Exception e) {
        System.out.println("Broken link: " + linkUrl);
      }
    }

    // Close the web driver
    driver.quit();
  }
}
 