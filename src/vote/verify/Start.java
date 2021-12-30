package vote.verify;

import java.util.Scanner;

public class Start {
	static int choice ;

	public static void main(String[] args) {
		System.out.println("Login (1) | Register (2)" );
		Scanner scan = new Scanner (System.in);
		choice = scan.nextInt();
		
		if (choice == 1) {
			Login.login();
		}
		else {
		Register.register();
		
		}
	}
		

}
