import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double  side, area;
		
		System.out.print("Enter the length of the pentagon's radius:    ");
		side = in.nextDouble() * 2 * Math.sin(Math.PI /5);
		area = (5.0 * Math.pow(side, 2.0))/(4.0*Math.tan(Math.PI/5.0));

		area = Math.round(area * 100) /100.0;
		 System.out.println("The area of the pentagon is " + area);

	}

}
