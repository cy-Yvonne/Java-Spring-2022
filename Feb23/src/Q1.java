import java.util.Scanner;
public class Q1 {
	public static void main(String[] args) {
		Scanner money = new Scanner(System.in);
		int cents, dollars, quarters, dimes, nickels;
	
		System.out.print("Enter your total amount of money:  ");
		
		double totalMoney = money.nextDouble();
		
		cents =  (int) (totalMoney * 100);

		dollars = cents / 100;
		cents = cents % 100;
		
		quarters = cents / 25;
		cents = cents % 25;
		
		dimes = cents / 10;
		cents = cents %  10; 
		
		System.out.println("You have " + dollars + " dollars, " + quarters + " quarters, " + dimes + " dimes, and " + cents + " cents.");
		
	}
}
