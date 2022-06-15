//Write an if statement that increases pay by 3% if score is greater than 90.


import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double pay, score;
		
		System.out.println("Enter score:   ");
		
		score = in.nextDouble();
		
		System.out.println("Enter pay:   ");
		
		pay = in.nextDouble();
		
		if (score > 90)
			pay += .3 * pay;

	}
}
