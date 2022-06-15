import java.util.*;
import java.io.*;

public class lab21 {

	public static void main(String[] args) throws IOException {
		File file = new File("c:\\Users\\aletia\\Desktop\\gradeRoster.txt");
		System.out.print("done");
		int size = findSize(file);
		System.out.print(size);
	//	String[] fname = new String[size];
	//	String[] lname = new String[size];
	//	double[] grades = new double[size];
		
		//readIntoArray(fname, lname, grades,file);
	//	System.out.print(fname[0]);
		//printGrades(fname,lname, grades);
		
		
		
		
	}

	public static int findSize(java.io.File file) throws java.io.IOException {
		System.out.print("find size");
		Scanner read = new Scanner(file);
		int size = 0; 
		//System.out.print(read.hasNext());
		while(read.hasNext()) {
		size ++;
		
		}System.out.print(size);
		read.close();
		return size;
	}

	public static void readIntoArray(String [] fname, String[] lname, double [] grades, java.io.File file) throws java.io.IOException {
		Scanner read = new Scanner(file);
		int i = 0;
		while(read.hasNext()) {
			fname[i] = "aa"; // read.next();
			lname[i] = read.next();
			grades[i] = read.nextDouble();
			i++;
		}
	}
	
	public static void printGrades(String [] fname, String[] lname, double [] grades) {
		for(int i = 0; i < fname.length; i++) {
			System.out.println("First name= "+fname[i]+" Last name= "+lname[i]+ " Grade= "+grades[i]);
		}
	}
}
