import java.util.*;

  public class scrapwork {
	  
	  public static boolean isPrime(int num){

		    int k = 2;

		    while(k < num){
		    	if(num%k==0) {
		    		return false;
		    	}
		     k++;
		    }
		    return true;
		    
	  }

	  public static void printPrime(int num){
		    int k = 2;
		    
		    while(k<=num) {
		    	if(isPrime(k))
		    		System.out.println(k);
		    	k++;
		    }
	    }
	  
		public static double m(int i){
			int k = 1;
			double sum = 0;

			while(k<=i){
				sum += (k/(k+1.0));
				k++;
		}
			
		return sum;
		}

	  
    public static void main(String[] args){
    	
    	System.out.println(m(2));
    	
    	/*
    	System.out.println(isPrime(4));
    	printPrime(12); */
    	
    	/*
    	Scanner input = new Scanner(System.in);
        int number, max;
        number = input.nextInt(); 
        max = number;

        do {
          number = input.nextInt();
          if (number > max)
            max = number;
        } while (number != 0);

        System.out.println("max is " + max);
        System.out.println("number " + number);
        */

   /*
    Scanner in = new Scanner(System.in);
    int num1, num2, sum, ans = -1, tries;
    boolean play = true;

    while (play){
      num1 = (int) (Math.random() *11);
      num2 = (int) (Math.random() *11);

      sum = num1 + num2;
      tries = 0;

      while((tries < 5) && (ans != sum)){
        System.out.print("What is the sum of " + num1 + " and " + num2 + "?    Answer: ");
        ans = in.nextInt();
        tries++;
      }
      
      if (ans == sum)
        System.out.println("Correct");
      else 
        System.out.println("Incorrect");

      System.out.println("\nDo you want to continue? (1 = yes, 0 = no)");
      ans = in.nextInt();

      if(ans == 0){
        play = false;
        System.out.println("Thanks for playing!");
      }
      
    }
    */
    
    }
  }