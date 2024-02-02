package Cross_browser_Testing;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_image {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh K\\eclipse-workspace\\Java_Testing\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.1clxlite.com/");
        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("Total images: " + images.size());
        for (WebElement image : images) {
            if (image != null) {
                verifyImageActive(image.getAttribute("src"));
            }
        }
        driver.quit();
    }

    public static void verifyImageActive(String linkURL) throws IOException {
        URL url = new URL(linkURL);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(3000);
        httpURLConnection.connect();
        if (httpURLConnection.getResponseCode() == 200) {
            //System.out.println(linkURL + " - " + httpURLConnection.getResponseMessage());
        } else {
            System.out.println(linkURL + " - " + httpURLConnection.getResponseMessage());
        }
    }
}
