import java.util.Scanner;
public class Q6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sec, min, hour, time;
		
		System.out.print("Enter the time in seconds:   ");
		time = input.nextInt();
		hour = time / 60 / 60;
		min = (time / 60) - (hour * 60);
		sec = time % 60;
		
		System.out.println(hour);
		System.out.println(min);
		System.out.println(sec);
		
	}
}
