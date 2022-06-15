import java.util.*;
import java.io.*;

public class Test4 {

	public static void main(String[] args) throws java.io.IOException {
		int[] numbers = {10,20,30,40};
		
		File  file = new File("c:\\Users\\aletia\\Desktop/num.txt");
		
		try(
		PrintWriter outFile = new PrintWriter("c:\\Users\\aletia\\Desktop/num.txt");
		) {
		for(int i = 0; i < numbers.length; i++) {
			outFile.println(numbers[i]);
		}
		
		outFile.close();
	}}

}
