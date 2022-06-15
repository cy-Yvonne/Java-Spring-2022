package classExample;
import java.io.*;
import java.util.*;

public class ReadRandom {

	public static void main(String[] args) throws Exception {
		// Create a file instance (you need to do that in order to read from the file)
		java.io.File file = new java.io.File("c:\\Users\\aletia\\Desktop\\numbers.txt");
		
		// Create a Scanner for the file
		Scanner in = new Scanner(file);
		
		// Create an arrau
		int[] numbers = new int[10];
		int i = 0;
		
		// Read data from a file
		while(in.hasNext()) {
			numbers[i] = in.nextInt();
			i++;
		}
		
		for(int j = 0; j<10; j++) {
			System.out.print(numbers[j]+" ");
		}
		
		// Close the file
		in.close(); //not necessary b/c you're reading from the file, but you should have it just to be safe

	}

}
