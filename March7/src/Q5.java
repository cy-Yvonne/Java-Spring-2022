//5)	Write a program that generates a random subtraction problem that subtracts smaller number from the bigger number. (Randomly generated numbers can be between 0-9)
import java.util.*;

public class Q5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num1 = (int)(Math.random() * 10), num2= (int)(Math.random() * 10), bigger = (num1 > num2 ) ? num1 : num2, smaller = (num1 > num2 ) ? num2 : num1 ,result = bigger - smaller , guess;
		
		System.out.print("What is " + bigger + " - "+ smaller +"?");
		guess = in.nextInt();
		
		if (result == guess)
			System.out.print("You are correct!");
		else {
			System.out.println("Your answer is wrong.");
			System.out.print(bigger + " - " + smaller + " should be "+ result);
		}
		
		
		
	}
}
