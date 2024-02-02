package Cross_browser_Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import javax.mail.Store;

import com.testing.framework.EmailUtils;

public class EmailOtp {
	
	public static void main(String[] args) throws Exception, IOException {
		
		EmailUtils emailUtils = new EmailUtils();
		Properties prop = new Properties();
		prop.load(new FileInputStream("C:\\Users\\Dinesh K\\eclipse-workspace\\Java_Testing\\Notepad\\config-otp.properties"));
		Store connection = emailUtils.connectToGmail(prop);
		
		List emailtext = emailUtils.getUnreadMessageByFromEmail(connection, "Inbox", "selvamjwork@gmail.com", "Verify Email");
		if (emailtext.size()<1) {
			throw new Exception("No Email Received");
			
		} 
		else {
			String regex= "[^\\d]+";
			String[] OTP =((String) emailtext.get(0)).split(regex);
			System.out.println("OTP is  : "+OTP[1]);

		}
	}
}
    