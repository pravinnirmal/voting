package vote.verify;

import java.util.ArrayList;
import java.util.Scanner;

public class Votecount {
	private static int name;
	private static int votes;
	static int vCount = 10;
	static int fcount = 0;

	static int tCount;
	static ArrayList<Votecount> v = new ArrayList<Votecount>();

	static void vote() {
		System.out.println("");
		System.out.println("Choose the person to eliminate");
		Scanner scan = new Scanner(System.in);
		name = scan.nextInt();
		
		System.out.println("You have selected " + Contestants.forelim[name]);
		System.out.println("");
		System.out.println("Enter number of votes");
		votes = scan.nextInt();
		if (votes > 10 || votes <= 0) {
			System.out.println("Error!! Enter value between 1-10 ");
			Contestants.contestantElim();
			vote();
		}
		tCount = vCount - votes; // total votes left
		System.out.println("You have " + tCount + " votes left");

		fcount += tCount;
		while (fcount >= 0 || fcount <= 10) { //

			System.out.println("Choose the person to eliminate");
			System.out.println("");
			Contestants.contestantElim();
			name = scan.nextInt();
			System.out.println("You have selected " + Contestants.forelim[name]);
			System.out.println("");
			System.out.println("Enter number of votes");
			votes = scan.nextInt();
			tCount = fcount - votes;
			System.out.println("");
			System.out.println("You have " + tCount + " votes left");
			System.out.println("");
			fcount -= tCount;
			if (tCount == 0) {
				System.out.println("Thank You.Voting finished");
				System.exit(tCount);

			}

		}

		System.out.println("You have exhausted your votes");
		scan.close();

	}

	/*
	 * do {
	 * 
	 * System.out.println("Choose the person you want to eliminate:");
	 * Contestants.contestantElim(); System.out.println("");
	 * System.out.println("You have " + tCount + " votes left"); Scanner scan = new
	 * Scanner (System.in); System.out.println("Type contestant and your votes");
	 * name = scan.next(); votes = scan.nextInt();
	 * 
	 * tCount=vCount- votes; v.add(new Votecount(name,votes));
	 * 
	 * 
	 * //System.out.println(tCount);
	 * 
	 * 
	 * 
	 * 
	 * } while (tCount <= 10 && tCount >0); //add while range from 0 to 10
	 * System.out.println("You have exhausted your votes"); System.exit(0);
	 * 
	 * 
	 */

	Votecount(int name, int votes) {
		Votecount.name = name;
		Votecount.votes = votes;
		// Votecount.tCount=tCount;
	}
}
