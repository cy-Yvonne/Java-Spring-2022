import java.util.*;
import java.io.*;


public class Text3 {

	public static void main(String[] args) throws Exception {
		
		String[] names = new String[3];
		java.io.File file = new java.io.File("c:\\Users\\Students\\Desktop\\friends.txt");
		Scanner out = new Scanner(file);
		
		for(int i = 0; i < 3; i++) {
			if(out.hasNext()) {
				names[i] = out.next();
				
			}
		}
		
		for(int i = 0; i < 3; i++) {
			
			System.out.print(names[i] + " ");	
			
	}

}
}