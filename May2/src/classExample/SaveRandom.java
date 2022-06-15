package classExample;
import java.io.*;
import java.util.*;

public class SaveRandom {

	public static void main(String[] args) throws Exception {
		java.io.File file = new java.io.File("c:\\Users\\aletia\\Desktop\\randomNumbers.txt");
		
		try (  //create a file
				java.io.PrintWriter output = new java.io.PrintWriter(file);
				){
					//write formatted output to the file
			
					for(int i = 0; i<10; i++) {
						int rand = (int) (Math.random()*11);
						output.println(rand);
					}
		}
		

	}

}
