
public class Q6 {
	public static int [] copyArray(int [] numbers) {
		int[] copy = new int[3];
		for (int i = 0; i < 3; i++)
			copy[i] = numbers[(numbers.length-1)-i];
		return copy;
	}
	public static void main(String[] args) {
		int[] test = {1,2,3,4,5};
		int[] test2 = copyArray(test);
		
		for (int i = 0; i < 3; i++)
			System.out.print(test2[i] + " ");
	}


}
