import java.util.*;
public class Q3 {
	
	
	public static double min(double[] array) {
		double min = array[0];
		
		for(int i = 1; i<array.length; i++) {
			min = (min>array[i])? array[i]:min;
		}
		
		return min;
	}
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double[] test = new double[10];
		
		System.out.print("Enter ten numbers:\t");
		
		for (int i = 0; i<test.length; i++) {
			test[i] = in.nextDouble();
		}
		System.out.print("The minimum number is \t" + min(test));
	}

}
