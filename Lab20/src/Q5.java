/*
5) Write a program to create a file named FileTest.txt if it does not exist.

Write 10 integers created randomly into the file using text I/O.

Integers are separated by spaces in the file. Read the data back 
from the file and display the data
in increasing order.
*/

import java.util.*;
import java.io.*;


public class Q5 {

	public static void main(String[] args) throws Exception {
		
		java.io.File file = new java.io.File("c:\\Users\\aletia\\Desktop\\FileTest.txt");
		
		// check if file exists
		if(file.exists()) {
			System.out.println("File already exists.");
		}else { //if not, generate data and print it onto the text file
			try( java.io.PrintWriter out = new java.io.PrintWriter("c:\\Users\\aletia\\Desktop\\FileTest.txt"); ){
				for(int i = 0; i < 10 ; i++) {
					int ran = (int) (Math.random() * 11);
					out.print(ran + " ");
				}
			}
			
		
		}
		
		sort(file);
		
		
	}

	// print the original file then print the sorted file
	public static void sort(File file) throws Exception {
		Scanner in = new Scanner(file);
		int [] num = new int[0];
		
		System.out.print("Numbers from file: ");
		while(in.hasNext()) {
			int temp = in.nextInt();
			num = Arrays.copyOf(num, num.length+1);
			num[num.length -1] = temp;
			System.out.print(temp + " ");
		}
		
		//sort
		
		for(int i = 0; i< num.length ; i++) {
			int currentMin = num[i];
			int index = i;
			
				for(int j = i+1; j < num.length; j++) {
					if(num[j] < currentMin) {
						currentMin = num[j];
						index = j;
					}
				}
			if(num[i] != currentMin) {
				num[index]=num[i];
				num[i]=currentMin;
			}
		}
		
		//print sorted file
		System.out.print("\nNumbers sorted:\t");
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
		
		in.close();
	}
	
}

	
