/* I didn't know if we were supposed to use 
 	the ACII number for 'a' to solve this question, so 
 	I created two solutions for it. One uses the ACII code while the 
 	other sorts through the characters to find the lower case letters.
 	To prevent confusion, I will add comments throughout the program.
*/
import java.util.*;

public class Q7 {
	public static void main(String[] args) {
		// Declare a character variable. It be the only value printed for the user to see. 
		char x;
		
		/*  
		    Solution 1: 
			If I didn't know the ACII code, I would just sort 
			through a set of random numbers until I find a lower case letter
		*/
		
		// I want the user to get a list of letters. This also helps me know if the letters a-z are all possible outputs for this program
		for(int i = 0; i <= 100; i++)
		{
			x = (char) (Math.random() * 160); // 160 was found through trial an error. The domain is definitely smaller, but this works fine
			
			// until I get a lower case letter, the program would continue assigning random values to x
			while ((Character.isLetter(x) && Character.isLowerCase(x)) == false ) 
				x = (char) (Math.random() * 150);
			
			// once a number is found, the associated character is printed
			System.out.println(x);
		}
		//End of solution 1. I will now move on to the next one
		
		// I don't know how to clear the console or how to make java wait; but, this works for now.
		System.out.println("Enter any key to continue to next solution....		");
		new Scanner(System.in).next();
		
		for(int i = 0; i <= 50; i++)
		System.out.println("\n"); 
		
		/*
		 Solution 2:
		 Considering that the ACII code for 'a' = 97, we only need to generate 26 numbers from 97 to 122
		 */
		 
		// Once again, I will create a list of numbers
		
		for(int i = 0; i <= 100; i++) 
		{
			x = (char) (Math.random() * 26 + 97);
			System.out.println(x);
		}
		// End of solution 2. This solution is cleaner, but it doesn't help me practice what we learned in class today
		
	}
}
