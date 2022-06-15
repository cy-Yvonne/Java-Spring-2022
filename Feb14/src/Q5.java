
public class Q5 {
	public static void main(String[] args) {
		int  currentBalance, months;
		final int payOff = 65;
		final int balanceDue =1000;
		
		currentBalance = balanceDue ;
		months = balanceDue / payOff;
		currentBalance = balanceDue % payOff;
		System.out.println("It would take " + months + " months to pay off the debt and the last month you would pay $" + currentBalance + ".");
	}
}
