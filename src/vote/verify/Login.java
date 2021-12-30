package vote.verify;

import java.util.Arrays;
import java.util.Scanner;

public class Login {
	static String uName;
	public static void login() {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter user name:");
	uName = scan.next();
	
	if (Arrays.asList(Users.userNames).contains(uName)){
		System.out.println("");
		System.out.println("Welcome " + uName);
		System.out.println("-----------------------------");
		
		//System.out.println(Contestants.forelim.getClass().getName());
		//System.out.println("There are total "+Contestants.forEli.length + " contestants this week");
		System.out.println("This week contestants are:");
		Contestants.contestantElim();
	}
	else {
	System.out.println("User doesnot exist. Try again");
	Start.main(null);
	}
	
scan.close();
}
}

