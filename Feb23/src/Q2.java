import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double c, f;
		
		System.out.print("Enter a degree in Celsius:   ");
		c = input.nextDouble();
		
		f = ( c * (9.0/5.0) ) + 32.0;
		
		System.out.println(c + " Celsius is " + f + " Fahrenheit"); 
	} 
}
