import java.util.*;

public class Q6 {

	public static void main(String[] args) {
		// months 9 6 4 11 have 30 days
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a month using numbers:  ");
		int month = in.nextInt();
		
		System.out.print("Enter a year:  ");
		int year = in.nextInt();
		
		// find out if thirty days
		boolean isThirty = ( month == 9 || month == 6 || month == 4 || month == 11);
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400== 0;
		boolean isFeb = (month == 2);
		
		int days;
		if (isFeb) {
			if(isLeapYear) {
				days = 29;
			}
			else
				days = 28;
		} else if (isThirty) 
			days = 30;
		else days = 31;
		
		System.out.println(month + "/" + year + " has " + days + " days.");
	}

}
