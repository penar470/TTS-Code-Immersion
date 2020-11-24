package datastructures2;
 import java.util.*;

 
public class Power {

	public static void main(String[] args) {
		
		int size = 4;
		
		int power = 2;
		
		System.out.println(Arrays.toString(toPower(size,power)));
		
//		for ( int i=0; i < powerArray.length; i++) {
//			
//			System.out.println(powerArray[i]);
//		}
	}
	
	public static int[] toPower(int size, int power) {
		
		int[] powerArray = new int[size];
		
		int mult = 0;
		
		for ( int i = 0; i < size; i++) {
			
			mult = i * i;
			
			powerArray[i] = mult;
			
		}
		
		
		return powerArray;
		
	}
}
