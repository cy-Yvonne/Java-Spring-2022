import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount of meters:   ");
		double feet = input.nextDouble();
		double meter = 0.305*feet;
		System.out.println(feet + " feet is " + meter + " meters.");
	}
}
