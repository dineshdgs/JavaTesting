package BasicTesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Perfomance_Testing {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh K\\eclipse-workspace\\Java_Testing\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://pasumai.tba.ai/");

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;

		System.out.println("Page load time: " + totalTime + " milliseconds");
		driver.quit();
		
	}
	

}
