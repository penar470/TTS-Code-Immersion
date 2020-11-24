package datastructures2;

public class Sumofvalues {
 
	public static void main(String[] args) {
		
		  int[ ] sampleArray = { 2,4,5,3,1}; //sum = 15
		  
		  int sum = 0; 
		  
		  for ( int i = 0; i< sampleArray.length; i++) {
			  
			  sum = sum + sampleArray[i];
		  }
		  
		  System.out.println(sum);
	}
}
