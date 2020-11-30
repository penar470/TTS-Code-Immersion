package datasctructures;

import java.util.HashMap;
import java.util.Scanner;

public class CarDealer {

	public static void main(String[] args) {
		
		HashMap<String, String> cars = new HashMap<String, String>();
		
		cars.put("Chevrolet", "Malibu");
		cars.put("Ford", "Focus");
		cars.put("Tesla", "Model Y");
		cars.put("Subaru", "WRX");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What kind of make do you want?");
		String desiredCar = input.nextLine();
		
		
		if(cars.containsKey(desiredCar)) {
			System.out.println("We have a " + desiredCar + " " + cars.get(desiredCar));
		} else {
			System.out.println(" We don't have that car ...");
		}
	}

}
