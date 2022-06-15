import java.util.Arrays;

// I made these methods easy to modify in order to reuse them in the future

public class Q2 {
	
	public static void main(String[] args) {
		int[] x = randomList();
		
		final int key = x[x.length-1];
		
		x = Arrays.copyOf(x, x.length -1 );

		linearSearch(x,key);
		binarySearch(x, key);
	}
	
	
// METHODS GO HERE
	
  // searching methods
	
	public static void linearSearch(int[] list, int key) {
		int index = 0;
		//timer start
		long startTime = System.nanoTime();
		// method start
		
		while((key != list[index]) && (index != -1)) {
			index++;
			if(index == list.length) {
				index = -1;
				break;
			}
		}
		
		// method end
		
		
		// timer end
		
		long endTime = System.nanoTime();
		long executionTime = endTime - startTime;
		
		// results
		System.out.print("Linear Search Method");
		System.out.println("\n\tkey:\t" + key + "\n\tindex:\t" + index + "\n\ttime elasped:\t"+ executionTime);
		
	}
	
	public static void binarySearch(int[] list , int key) {
		list = sort(list);
		int low = 0;
		int high = list.length -1;
		int index = -1;
		
		//timer start
		long startTime = System.nanoTime();
		
		// method start
		
		
		while(high >= low ) {
			int mid = (high+low)/2;	
			if (key==list[mid]) {
				index = mid;
				break;
			}else if (key<list[mid]) {
				high = mid-1;
				
				}else {
					low = mid +1;
				}
		}
		
		
		// method end
		
		
		// timer end
		long endTime = System.nanoTime();
		long executionTime = endTime - startTime;
		
		// results
		System.out.print("Binary Search Method");
		System.out.println("\n\tkey:\t" + key + "\n\tindex:\t" + index + "\n\ttime elasped:\t"+ executionTime);
				
		
		
	}
	
  //misc
	
	public static int[] sort(int[] list) {
		
		for(int i = 0; i < (list.length); i ++) {
			int min = list[i];
			int index = i;
			for(int j = i+1; j < (list.length); j ++) {
				if(min>list[j]) {
					min = list[j];
					index = j;
				}
			}
			if(i != index) {
				list[index] = list[i];
				list[i] = min;
			}
		}
		
		return list;
	}
	
	public static int[] randomList() {
		// enter the desired length of list
		int length = 100000  /*generate key*/ + 1;
		
		int[] ran = new int[length];
		
		// enter range
		int lowestPossibleValue = 0;
		int highestPossibleValue = 100000;
		
		// ignore this value 
		int scope = (highestPossibleValue - lowestPossibleValue) + 1;
		
		//generate random values and assign them to each element
		
		for(int i = 0; i < ran.length; i++) {
			
			ran[i] = (int) ( ( Math.random() * scope ) + lowestPossibleValue);
			
		}
			
		return ran;
		
	}

	
}
