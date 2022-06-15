import java.util.*;
import java.io.*;


public class Test2 {

	public static void main(String[] args) throws Exception {

		String fileName;
		String friendName;
		
		int numFriends;
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("How many firends do you have?  ");
		numFriends = keyboard.nextInt();
		
		keyboard.nextLine(); // when you enter in the integer, the enter is then regarded a "nextLine()". Adding this line of code helps to separate the two
		
		System.out.print("Enter the file name  ");
		fileName = keyboard.nextLine();
		
		try(
		PrintWriter outputFile = new PrintWriter("c:\\Users\\aletia\\Desktop\\"+fileName);
		){
		for(int i = 0; i <numFriends; i++) {
			System.out.println("Enter you friend number "+(i+1)+"'s name =");
			friendName = keyboard.nextLine();
			
			outputFile.println(friendName);
		}
		
		outputFile.close();
		}
	}

}
