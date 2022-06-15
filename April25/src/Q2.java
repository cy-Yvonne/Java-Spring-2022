
public class Q2 {
	
	public static void reverseArray(int [] numbers) {

		for(int i = 0; i<( numbers.length/2); i++) {
			int index = (numbers.length-1)-i;
	
			int temp = numbers[i];
			//System.out.print(numbers[i] + " " + numbers[index]+"///");
			
			//System.out.print(index + " " + temp+ " " + numbers[i]+"///");
			
			numbers[i] = numbers[index];
			numbers[index] = temp;
			
			//System.out.println(numbers[i] + " " + numbers[index]);
		}
		for(int i = 0; i< numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] test = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		reverseArray(test);

	}

}
