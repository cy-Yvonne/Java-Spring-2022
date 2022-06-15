
public class Q3 {
	public static void main(String[] args) {
		System.out.println("25 / 4 is " + 25 / 4);
		// 25 / 4 = 6.25, but the result on the program is 6. This is because the numbers are assumed to be integers due to not having any decimals. 
		System.out.println("25 / 4.0 is " + 25 / 4.0);
		// because 4.0 has a decimal, the number is treated like a double. When you do math with a double, the the result would be a double as well
		System.out.println("3 * 2 / 4 is " + 3 * 2 / 4);
		System.out.println("3.0 * 2 / 4 is " + 3.0 * 2 / 4);
		//For the previous lines of code, the same logic I mentioned above applies
		
		//TD;LR Eventhough 1 = 1.0, they are treated differently. 1 would be treated like an integer while 1.0 would be treated like a double. When you do math with doubles, the result would be a double as well.

	}
}
