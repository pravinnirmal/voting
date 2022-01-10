package vote.verify;

import java.util.Arrays;
import java.sql.*;
import java.util.Scanner;

public class Login {

	public static void login() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/voteregistration";
		String username = "root";
		String password = "dossboss";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter User ID:");
		String Userid = scan.next();

		String query = "SELECT Userid FROM userregistration WHERE Userid = ?";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, Userid);
			ResultSet result = pst.executeQuery(query);

			if (result.first()) {
				Votecount.vote();
			} else {
				System.out.println("User doesnot exist");
				Start.main(null);
			}

			scan.close();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		/*
		 * if (Arrays.asList(Users.userNames).contains(uName)){ System.out.println("");
		 * System.out.println("Welcome " + uName);
		 * System.out.println("-----------------------------");
		 * 
		 * //System.out.println(Contestants.forelim.getClass().getName());
		 * //System.out.println("There are total "+Contestants.forEli.length +
		 * " contestants this week"); System.out.println("This week contestants are:");
		 * Contestants.contestantElim(); Votecount.vote(); } else {
		 * System.out.println("User doesnot exist. Try again"); try { Start.main(null);
		 * } catch (ClassNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } }
		 */

	}
}
