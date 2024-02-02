package BasicTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Status_bar_message_testing {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh K\\eclipse-workspace\\Java_Testing\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mahizhconstruction.com/");
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.id("//body/div[2]/section[13]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/p[5]/input[1]"))).perform();

		String statusBarMessage = driver.findElement(By.id("statusbarId")).getText();
		System.out.println("Status bar message: " + statusBarMessage);

		if (statusBarMessage.equals("Expected Message")) {
		    System.out.println("Status bar message is correct.");
		} else {
		    System.out.println("Status bar message is incorrect.");
		}
		driver.quit();

	}

}
