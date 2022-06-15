import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds:  ");
		double weight = 0.45359237 * input.nextDouble();
		
		System.out.print("Enter height in inches:  ");
		double height = 0.0254 * input.nextDouble();
		
		float bmi = (float) (weight / Math.pow(height, 2));
		
		System.out.println("BMI is "+ bmi);
	}
}
