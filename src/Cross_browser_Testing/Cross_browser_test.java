package Cross_browser_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Cross_browser_test {
	
	public static WebDriver driver;
	
	@Test()
	  public void lauchsite() throws InterruptedException 
	  {
		  driver.get("https://www.1clxlite.com/");
		  Thread.sleep(5000);
		  
		  
	  }
	  
	    @BeforeMethod
	    @Parameters({"browser"})
	  public void Choosing_browser(String browser) throws Exception
	  {
		  if(browser.equalsIgnoreCase("Chrome"))
		  {
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh K\\eclipse-workspace\\Java_Testing\\driver\\chromedriver.exe");
			 // WebDriverManager.chromedriver().setup();
			  driver=new ChromeDriver();
			  driver.manage().window().maximize();
			  
		  }
		  else if(browser.equalsIgnoreCase("Firefox"))
		  {
			  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dinesh K\\eclipse-workspace\\Java_Testing\\driver\\geckodriver.exe");
			  //WebDriverManager.firefoxdriver().setup();
			  driver=new FirefoxDriver();
			  driver.manage().window().maximize();
	      }
		  else if(browser.equalsIgnoreCase("Edge"))
		  {
			  System.setProperty("webdriver.edge.driver", "C:\\Users\\Dinesh K\\eclipse-workspace\\Java_Testing\\driver\\msedgedriver.exe");
			  //WebDriverManager.edgedriver().setup();
			  driver=new EdgeDriver();
			  driver.manage().window().maximize();
	      }
		  
	  }

	 @AfterMethod
	 public void quit_browser()
	 {
		 driver.quit();
	 }

}
