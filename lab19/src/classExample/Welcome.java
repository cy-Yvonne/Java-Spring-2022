package classExample;
import java.io.*;
import java.util.*;

public class Welcome {
	public static void main(String[] args) throws java.io.IOException {
		java.io.File file = new java.io.File("c:\\Users\\aletia\\Desktop\\scores.txt");
		if(file.exists()) {
			System.out.println("File already exists.");
			System.exit(0);
		}
		
		try ( // this would automatically close the file.
		//create file
		java.io.PrintWriter output = new java.io.PrintWriter(file);
	){
		//write on the file
		
		output.print("John T Smith");
		output.println(90);
		output.print("Eric K Jones");
		output.print(85);
		
		//close the file
		output.close();
		}
		
	}
	}

