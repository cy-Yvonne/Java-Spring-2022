
public class classwork {
	
	public static void main(String[] arg) {
		int[] src = {1,2,3,4,5};
		
		int[] target = new int[src.length];
		
		System.arraycopy(src, 0, target, 0, src.length);
	}
	
	/*
	public static void main(String[] arg) {
		int [] x = {1,2,3};
		int[] y = {4,5};
		x = y;
		
		x[0] =10;
		
		for(int i = 0; i<x.length; i++) {
			System.out.print(x[i]+ " ");
		}
		for(int i = 0; i<y.length; i++) {
			System.out.print(y[i]+ " ");
		}
	}
	
	
	/*
	public static void main(String[] arg) {
		  int[] deck = new int[52];
		    String[] suites = {"Spades", "Hearts", "Diamonds", "Clubs"};
		    String[] ranks = {"Ace", "1", "2", "3", "4", "5", "6","7", "8", "9", "10", "Jack", "Queen", "King"};
		    
		    //create the deck
		    for(int i = 0; i< deck.length ; i++) {
		      deck[i] = i;
		     // System.out.print(deck[i] + " ");
		    }
		    //shuffle the deck
		    for(int i = 0; i< deck.length; i++) {
		    	int index = (int) (Math.random()*deck.length);
		    	int temp = deck[i];
		    	deck[i] = deck[index];
		    	deck[index] = temp;
		    }
		    for(int i = 0; i< deck.length; i++) {
		    	String card =  ranks[deck[i]%13] + " of " + suites[deck[i]/13] + ", " ;
		    	System.out.print(card);
		    }
		    	
		  
		    
		    
		    //for(int i = 0; i< deck.length; i++)
		    	//System.out.print(deck[i] + " ");
		   
	}
	*/
}
