package BasicTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusBarMessage {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh K\\eclipse-workspace\\Java_Testing\\driver\\chromedriver.exe");
        driver =new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
		WebElement getStarted = driver.findElement(By.xpath("(//a[@target='_blank'])[5]"));
		getStarted.click();
		Thread.sleep(3000);
}
}