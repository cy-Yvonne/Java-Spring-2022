package classExample;
import java.io.*;
import java.util.*;

public class ReadFile {

	public static void main(String[] args) throws java.io.IOException {
		java.io.File file2 = new java.io.File("c:\\Users\\aletia\\Desktop\\scores.txt");
		Scanner in = new Scanner(file2);//we created a scanner that can read the file
		/*
		while(in.hasNext()) { // if there are more lines, then it would be printed it out in the terminal
			System.out.println(in.nextLine());
			//note: in.hasNext() starts a line above the beginning of the file
			// if you wanted to ignore the spaces, type in.next()
		}
		*/
		while(in.hasNext()) {
			//next() and nextLine() reads a string. 
			//nextInt() and the other variable shits work too
			String fn = in.next(); 
			String mn = in.next();
			String ln = in.next();
			String grade = in.next();
			System.out.println("First name:\t"+fn+"\tmiddle initial:\t"+mn+"\tlast name:\t"+ln+"\tgrade:\t"+grade);
			//when inputing data using in.nextInt() a buffer stores all of the keystrokes including enter.
			//		if you try to use in.nextLine() after, then it would assume that the enter saved was a line
			//		one solution is to enter both values in the same line before pressing enter
			//		
			//		If you want it to work, you could also use in.next() b/c it's not separated with enter
			//      if you type Scanner in = new Scanner("13 14") then you would created a buffer between inputed values
		}
		
		in.close(); //this is optional but to be on the safe side, you have to close it
	}
	
	

}
