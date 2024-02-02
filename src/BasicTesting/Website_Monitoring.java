package BasicTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class Website_Monitoring {
    public static void main(String[] args) throws InterruptedException {
        //Set up web driver
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh K\\eclipse-workspace\\Java_Testing\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Enter the URL to monitor
        driver.get("https://mahizhconstruction.com/");
        //Find the element on the page and store its text
        WebElement element = driver.findElement(By.xpath("//body/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[4]/a[1]"));
        String elementText = element.getText();
        System.out.println(elementText);
        //Compare the stored text with the expected value
        if (!elementText.equals("Project")) {
            //Send email if the values don't match
            sendEmail("Subject", "The expected value is not present on the page. Actual value: " + elementText);
        }
        //Close the browser
       // driver.quit();
     
    }
    public static void sendEmail(String subject, String body) {
        //Set up email properties
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "info@mahizhconstruction.com");
        props.put("mail.smtp.port", "465");
        props.put("mail.smtp.ssl.protocol", "TLS");
        props.put("mail.smtp.ssl.ciphersuites", "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
     // Example code to set the SMTP host and port
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "465");
     // Example code to set the email account credentials
        props.put("mail.smtp.auth", "true");
     // Example code to set the SSL properties
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.socketFactory.fallback", "false");

        Session session = Session.getInstance(props,
          new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(subject, body);
            }
          });

        //Create a session
		/* Session session = Session.getInstance(props, null); */
        //Create the message
        MimeMessage message = new MimeMessage(session);
        try {
            message.setFrom(new InternetAddress("info@mahizhconstruction.com"));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress("sachinanand584@gmail.com"));
            message.setSubject(subject);
            message.setText(body);
            //Send the message
            Transport transport = session.getTransport("smtp");
            transport.connect("smtp.gmail.com", "info@mahizhconstruction.com", "Infinityhub@123!");
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        } catch (AddressException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}


 
