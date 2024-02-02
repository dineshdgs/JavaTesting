package BasicTesting;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

 

public class PriceSearching {
	public static WebDriver driver;

	 public static void main(String[] args) throws InterruptedException {
		 
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh K\\eclipse-workspace\\Java_Testing\\drivercurrent\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.get("https://www.1clxlite.com/");
			driver.manage().window().maximize();
			 
			driver.findElement(By.xpath("//button[@class='msme-btn msme_close_btn']")).click();

			Thread.sleep(3000);

			driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();

			List <WebElement> Values = driver.findElements(By.id("tooltip"));

			System.out.println(Values.size());

			for (int i = 0; i < Values.size(); i++)

			{

			System.out.println(Values.get(i).getAttribute("title"));

			}

			 

			
		 
		 

	}
}

