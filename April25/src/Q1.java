import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String[] letter = {"A", "B", "C", "D", "F"};
		
		System.out.print("Enter the number of students:\t");
		int totalStudents = in.nextInt();
		
		int[] grade = new int[totalStudents];
		
		System.out.print("Enter "+ totalStudents +  " scores:\t");
		int max = 0;
		for (int i = 0; i< totalStudents; i++) {
			grade[i] = in.nextInt();
			max = (max>= grade[i])? max : grade[i];
			
		}
		
		for (int i = 0; i<totalStudents; i++) {
			int x = (grade[i]%10 == 0)?(max - (grade[i]+1))/10 :(max - grade[i])/10   ;
			x = (x>4)? 4 : x;
			//System.out.print(x + " " + grade[i]+" ");
			System.out.println("Student "+(i+1)+" score is "+ grade[i] + " and grade is "+ letter[x]);
		}
		
		
	}

}
