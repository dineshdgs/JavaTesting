package BasicTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Content_testing {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh K\\eclipse-workspace\\Java_Testing\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mahizhconstruction.com/");

		String pageTitle = driver.getTitle();
		String pageHeading = driver.findElement(By.tagName("h1")).getText();
		System.out.println(pageHeading);

		if (pageTitle.equals("உங்கள் மகிழ்ச்சியின் தொடக்கம் இங்கே!") && pageHeading.equals("உங்கள் மகிழ்ச்சியின் தொடக்கம் இங்கே!")) {
		    System.out.println("Content is accurate and consistent.");
		} else {
		    System.out.println("Content is not accurate and consistent.");
		}
		driver.quit();

		
	}

}
