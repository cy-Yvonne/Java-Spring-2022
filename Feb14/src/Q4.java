import java.util.*;
public class Q4 {
	public static void main(String[] args) {
		//declare stuff here
		Scanner input = new Scanner(System.in);
		float r,m;
		double answer;
		//ask for inputs
		System.out.print("r :");
		r = input.nextFloat();
		
		System.out.print("m :");
		m = input.nextFloat();
		answer = m * Math.pow(r, 2);
	}
}
