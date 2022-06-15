import java.util.*;

public class Q4 {
	public static int indexOfSmallestElement(double[] array) {
		int index = 0;
		double min = array[index];
		
		for(int i = 1; i<array.length; i++) {
			if (min > array[i]) {
			min = array[i];
			index = i;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double[] test = new double[10];
		
		System.out.print("Enter ten numbers:\t");
		
		for (int i = 0; i<test.length; i++) {
			test[i] = in.nextDouble();
		}
		System.out.print("The index of the minimum number is\t" + indexOfSmallestElement(test));
	}

		
	}


