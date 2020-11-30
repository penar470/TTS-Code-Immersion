package datasctructures;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;


 
//Asks the user for 5 numbers
//Stores them in an array list
//Finds the sum, product, largest, and smallest of those numbers

public class ArrayNumbers {

	public static void main(String[] s) {
	
		Scanner myScan = new Scanner(System.in);
		System.out.print("Give me 5 numbers: ");
		
		
		ArrayList<Integer>myArr = new ArrayList();
		
		int userNum;
		for (int i = 1; i < 6; i++) {
			
			userNum = Integer.parseInt(myScan.nextLine());
			
			myArr.add(userNum);
		}
		
		
		int max = Integer.MIN_VALUE; 
		
		for (int i = 0; i < myArr.size(); i++) { 
			
			if (myArr.get(i) > max) {
				
				max = myArr.get(i);
			}
		}
		
		int min = Integer.MAX_VALUE; 
		
		for (int i = 0; i < myArr.size(); i++) { 
			if (myArr.get(i) < min) {
				
				min = myArr.get(i);
			}
		}
		
		int sum = 0; 
		
		for (int i = 0; i < myArr.size(); i++) { 
		
			sum += myArr.get(i);
		}
		
		int product = 1; 
		
		for (int i = 0; i < myArr.size(); i++) { 
			
			product *= myArr.get(i);
		}
		
			
		System.out.println(myArr);
		System.out.print("What is the max? ");
		System.out.println(max);
		System.out.print("What is the min? ");
		System.out.println(min);
		System.out.print("What is the sum? ");
		System.out.println(sum);
		System.out.print("What is the product? ");
		System.out.println(product);
		
	}

}
