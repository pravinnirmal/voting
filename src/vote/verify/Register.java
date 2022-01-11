package vote.verify;

import java.sql.*;
import java.util.Scanner;

public class Register  {
	
	static void register() throws ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/voteregistration";
		String username = "root";
		String password = "dossboss";
		String query = "INSERT INTO userregistration(Username, Userid)  VALUES (?,?)";
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement stt = con.prepareStatement(query);
			
			System.out.println("----Welcome to Voting Registration ----");
			System.out.println("");
			System.out.println("Enter Your Name");
			Scanner scan = new Scanner (System.in);
			String Username = scan.next();
			System.out.println("Enter your login id");
			String Userid = scan.next();
			
			stt.setString(1, Username);
			stt.setString(2, Userid);
			stt.execute();
			
			System.out.println("Registration Success.");
			Start.main(null);
			
			scan.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
