import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String first, second, order;
		
		System.out.println("Enter the first city:     ");
		first = in.nextLine().trim();
		
		System.out.println("Enter the second city:     ");
		second = in.nextLine().trim();
		
		System.out.println(first.compareTo(second));
		
		if (first.compareTo(second) > 0 )
			order = second + " " + first ;
		else
			order = first + " " + second ;
		
		System.out.println("The cities in alphabetical order are "+order);
		
	}

}
