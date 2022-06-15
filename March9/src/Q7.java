import java.util.*;

public class Q7 {

	public static void main(String[] args) {
		int d1, d2, d3, n;
		Scanner in= new Scanner(System.in);
		
		System.out.print("Enter a three-digit number:   ");
		n = in.nextInt();
		
		d1 = n / 100;
		d2 = (n - d1 * 100)/10;
		d3 = (n - (d1 * 100 + d2 * 10));
		
		if(d1 == d3)
			System.out.println(n + " is a palindrome");
		else
			System.out.println(n + " is not a palindrome");

	}

}
