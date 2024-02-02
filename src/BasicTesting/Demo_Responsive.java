package BasicTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Demo_Responsive {
  private WebDriver driver;

  @BeforeTest
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
    Map<String, String> mobileEmulation = new HashMap<>();
    mobileEmulation.put("deviceName", "iPhone X");
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
	/*
	 * DesiredCapabilities capabilities = new DesiredCapabilities();
	 * capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
	 */
    driver = new ChromeDriver(chromeOptions);
  }

  @Test
  public void testResponsive() {
    driver.get("https://www.1clx.com/");
    // Perform your responsive testing here
    // Example: Check if the header and footer are present in the mobile view
    boolean header = driver.findElement(By.id("header")).isDisplayed();
    boolean footer = driver.findElement(By.id("footer")).isDisplayed();
    System.out.println("Header is displayed: " + header);
    System.out.println("Footer is displayed: " + footer);
  }

  @AfterTest
  public void tearDown(String name) throws IOException {
	  File src=((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
   	FileHandler.copy(src, new File("C:\\Users\\Dinesh K\\eclipse-workspace\\Java_Testing\\Screenshots\\"+name+".png"));
    driver.quit();
  }
  
}


 