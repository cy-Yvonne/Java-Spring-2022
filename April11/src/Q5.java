
public class Q5 {

	public static int numberOfDaysInAYear(int year) {

		if((year%4==0 && (year%100 != 0 || year%400 != 0)) || (year%100==0 && year%400==0)) {
			return 366;

		}else
			return 365;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(numberOfDaysInAYear(2001));
		int year = 2000;
		int total= 0;
		
		while (year<=2020) {
			total += numberOfDaysInAYear(year);
			year++;
		}
		System.out.print(total);
	}

}
