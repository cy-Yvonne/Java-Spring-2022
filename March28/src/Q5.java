import java.util.*;

public class Q5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = (int) ( Math.random()*101);
		int guess = -1;
		
		System.out.println("Guess a magic number between 0 and 100");
		while(guess != num) {
			System.out.print("Enter your guess:\t");
			guess = in.nextInt();
			
			if (guess > num)
				System.out.println("Your guess is too high.");
			else if(guess < num)
				System.out.println("Your guess is too low.");
		}
		
		System.out.println("Yes, the number is "+ num);
	}

}
