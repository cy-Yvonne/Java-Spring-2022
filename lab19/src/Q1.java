import java.util.*;

public class Q1 {

	public static int[] eliminateDuplicates(int[] list) {
		
		//create a new list with the only element being the first integer of the imported list 
		
		int[] distinct = new int[1];
		distinct[0] = list[0];
		
		/*
		 
		//testing the Arrays.copyOf method
		 
		distinct = Arrays.copyOf(distinct, distinct.length + 1);
		
		for(int i = 0; i<distinct.length; i++)
		System.out.print( distinct[i] + " ");
		
		*/
		
		for(int i = 0; i<list.length; i++) {
			//int current = list[i];
			boolean in = true;
			
			// filter out duplicates
			for(int j = 0; j<distinct.length; j++) {
				if(distinct[j] == list[i])
					in = false;
			}
			
			//System.out.println(in); //checks if the logic is correct
			
			// append distinct integers
			if(in) {
				distinct = Arrays.copyOf(distinct, distinct.length + 1);
				distinct[distinct.length - 1]= list[i];
			}
			
		}
		
	
		return distinct;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] input = new int[10];
		
		System.out.print("Enter 10 numbers:\t");  // test numbers:  1 2 3 2 1 6 3 4 5 2
		for(int i = 0; i<10; i++)
			input[i] = in.nextInt();
		
		input = eliminateDuplicates(input);
		
		// print results
		for(int i = 0; i<input.length; i++)
			System.out.print( input[i] + " ");
		
		
	}

}
