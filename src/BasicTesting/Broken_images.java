 package BasicTesting;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Broken_images {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\Dinesh K\\\\eclipse-workspace\\\\Java_Testing\\\\driver\\\\geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		  driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.get("https://vsaconstruction.in/");
		  Thread.sleep(5000);
		  
		  List <WebElement> links = driver.findElements(By.tagName("img"));
		  System.out.println(" Number of images are " +  links.size());
		  List<String>urllist=new ArrayList<String>();
		  
		  for(WebElement link:links)
		  {
	        String url=link.getAttribute("src");
	        //urllist.add(url);
	      Checkbrokenlink(url);
 
		  }
		  
		  driver.quit();
		  
	  }
			
		  public static void Checkbrokenlink(String linkurl)
		  {
			   
			try
			{
				URL url=new URL(linkurl);
				HttpURLConnection httpurlconnect=(HttpURLConnection) url.openConnection();
				httpurlconnect.setConnectTimeout(5000);
				httpurlconnect.connect();
				
				if(httpurlconnect.getResponseCode()>=400) 
				{
					System.out.println(linkurl + " " + httpurlconnect.getResponseMessage() +  httpurlconnect.getResponseCode() + " is a broken image ");
				}
				
				  else { System.out.println(linkurl + " " + httpurlconnect.getResponseMessage()+ httpurlconnect.getResponseCode() + "is a valid image");
				  
				  }
				 
				
				
			}
			catch(Exception e)
			{
				
			}
			  
		  }
			  
		
	}


