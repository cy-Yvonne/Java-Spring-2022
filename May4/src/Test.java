import java.util.*;
import java.io.*;


public class Test {

	public static void main(String[] args) throws java.io.IOException {
		java.io.File file = new File("c:\\Users\\aletia\\Desktop\\grade.txt");
		Scanner in = new Scanner(file);
		System.out.print(in.hasNext());
		
		try(
		PrintWriter outputFile = new PrintWriter("c:\\Users\\aletia\\Desktop\\grade1.txt");
				){
		double average;
		char grade;
		String name;
		
		
		System.out.print(in.hasNext());
		while(in.hasNext()) {
			
			name = in.next();
			average = in.nextDouble();
			if(average >= 90)
				grade = 'A';
			else if(average >= 70) 
				grade = 'B';
			else 
				grade = 'F';
			
			
			outputFile.println(name+ " " + grade+ " " + average + " ");
			
		} 
		
		outputFile.close();
		}
		System.out.println("Data is written into a new file.");
		
	}

}
/*
uih 99.0
jjj 85.0
hhv 65.0
*/
