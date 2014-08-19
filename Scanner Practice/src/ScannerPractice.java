import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		
	int favoriteJerseyNumber;
	double userChoice;
	
	Scanner BigBoy = new Scanner (System.in);	
	
	
	
	System.out.println("Please enter the jersey number of your favorite Broncos player!");
	favoriteJerseyNumber = BigBoy.nextInt();
	System.out.println("No way, number " + favoriteJerseyNumber + " is my favorite player too!");
	
	System.out.println("Please pick the most attractice of the following three options, and enter it exactly as shown: 69.69, 22.875, or 1.0 ");
	userChoice = BigBoy.nextDouble();
	
	System.out.println("Ah! " + userChoice + " is the one I like the best too!" );
	
	
	}

}
