/*
4) Suppose a text file contains an unspecified ­number of scores 
separated by spaces. Write a program that prompts the user 
to enter the file, reads the scores from the file, and displays 
their total and average.

*/
import java.util.*;
import java.io.*;

public class Q4 {

	public static void main(String[] args) throws Exception {
		// i'll make the text file myself. or maybe i could generate it here.
		//		make a loop with a randomized length and generate numbers from 0-100
	
		java.io.File file = new java.io.File("c:\\Users\\aletia\\Desktop\\lab20q4scores.txt");
		
		try( java.io.PrintWriter out = new java.io.PrintWriter("c:\\Users\\aletia\\Desktop\\lab20q4scores.txt");){
			
			for(int i = 0; i<=(int)(Math.random()*50) ; i++) {
				int num = (int) (Math.random() *101);
				out.print(num + " ");
			
			}
		}
		
		// ask user to open file   (create a scanner)
		// save the location into a variable so that i could open it in a file
		
			String location = new String("c:\\Users\\aletia\\Desktop\\");
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the name of a text file on your desktop. (Don't include the file type):\t");
		location += in.nextLine() +".txt";
	             //System.out.print(location);
		// make a new scanner? can I repurpose the same scanner? that might get confusing on more complicated programs
		
		file = new File(location);
		
		Scanner read = new Scanner(file);
		
		int total=0, average, totalNum = 0; 
		
		
		// use the scanner to read through the file. i would need a loop to read through each line and to add them
		while(read.hasNext()) {
			
			total += read.nextInt();
			totalNum++;
			
		}
		
		average = total / totalNum;

		read.close();
		
		System.out.print("total:\t"+total+"\naverage:"+average);
	
	}

}
