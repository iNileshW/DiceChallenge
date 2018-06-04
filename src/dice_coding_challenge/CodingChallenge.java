/*Question:
 * Guessing Dice Game
 
- Create a method that rolls a dice
 
            - Roll twice and add to get a total
 
- Create a method to take in user input
 
            - Compare the guess with the total
 
- Output if it's correct or wrong
 
 
- User input must only be integers
- User input must be within boundary values
- User is able to 3 attempts 

 */
package dice_coding_challenge;

import java.util.Random;
import java.util.Scanner;

public class CodingChallenge {

	public static void main(String[] args) {
		// Dice 1 & Dice 2 variable
		int d1, d2;

		//Random Dice Number Generation
		d1 = (int) (Math.random() * 6 + 1);
		d2 = (int) (Math.random() * 6 + 1);
		int sum = d1 + d2;
		//Loop for number of attempts
		for (int i = 1; i <= 3; i++) {
			//Input from user
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter the Total to guess : ");
			int Total = scanner.nextInt();
			//Loop for valid integer entry
			if (Total <= 12 && Total > 0) {
				//Loop for Win-Loose Decision
				if (sum == Total) {
					System.out.println("You Win");
					break;
				} else if(i<3) {
					System.out.println("Try Again");
				}
				else {
					System.out.println("You loose!");
				}
			}
			else {
				System.out.println("Invalid Entry");
			}	
		}
	}
}
