//7)	Compute the perimeter of a rectangle again but this time receive the width and the height values from the user through a Scanner object. 
import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		double perimeter, width, height;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the width = ");
		width = input.nextDouble();
		System.out.print("Enter the height = ");
		height = input.nextDouble();
		perimeter = (width *2)+  (height *2);
		
		System.out.print("The perimeter of the rectangle with the width of " + width +" and the height of " + height +" is "+ perimeter +".");
	
		
		
	}

}
