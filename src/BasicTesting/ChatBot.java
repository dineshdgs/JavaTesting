package BasicTesting;

import java.util.Scanner;

import java.util.Scanner;
import java.sql.*;

public class ChatBot {
	 public static final String DB_URL = "jdbc:mysql://localhost:3306/mydb";
	    public static final String USER = "username";
	    public static final String PASS = "password";
  
public static void ScannerMethod() {
	  Scanner input = new Scanner(System.in);
      String username, password, email;

      System.out.println("Welcome to our signup chatbot!");

      System.out.print("Please enter your desired username: ");
      username = input.nextLine();

      System.out.print("Please enter your desired password: ");
      password = input.nextLine();

      System.out.print("Please enter your email address: ");
      email = input.nextLine();

      System.out.println("Thank you for signing up, " + username + "!");
      System.out.println("Your email address is " + email + ".");
}
 

public static void StoringDatabase() {
	
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Welcome to the sign-up chatbot! Please enter your information below.");
	        
	        System.out.print("First Name: ");
	        String firstName = scanner.nextLine();
	        
	        System.out.print("Last Name: ");
	        String lastName = scanner.nextLine();
	        
	        System.out.print("Email Address: ");
	        String email = scanner.nextLine();
	        
	        System.out.print("Password: ");
	        String password = scanner.nextLine();
	        
	        // Store data in the database
	        Connection conn = null;
	        Statement stmt = null;
	        try {
	            conn = DriverManager.getConnection(DB_URL, USER, PASS);
	            stmt = conn.createStatement();
	            String sql = "INSERT INTO users (first_name, last_name, email, password) " +
	                         "VALUES ('" + firstName + "', '" + lastName + "', '" + email + "', '" + password + "')";
	            stmt.executeUpdate(sql);
	            System.out.println("User has been registered successfully!");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (stmt != null) stmt.close();
	                if (conn != null) conn.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	
 public static void main(String[] args) {
	 StoringDatabase();
	 ScannerMethod();
}
}
      
    

