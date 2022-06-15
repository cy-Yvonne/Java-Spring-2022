
public class hw {
	
	  public static boolean isPrime(int number){

		  int k = 2;

		  while(k < number){
		    if(number%k==0) {
		      return false;
		    }
		   k++;
		  }
		  return true;

		  }
	  
	    public static void printPrime(int x){

		    int k = 2;

		    while(k<=x) {
		    	if(isPrime(k))
		    		System.out.println(k);
		    	k++;
		    }

    }
	public static void main(String[] args) {
		System.out.println("Is 11 a prime number? :   "+isPrime(11));
		System.out.println("The prime numbers from 0 to 12 are:   ");
		printPrime(12);

	}

}
