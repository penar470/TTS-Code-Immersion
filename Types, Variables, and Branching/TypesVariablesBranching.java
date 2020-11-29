package homework;

public class TypesVariablesBranching {
	
	
	//Try leaving the fields uninitialized and print out their values
	// int a and int b were left uninitialized they gave the default value for int which is 0.
	
	
	static int a ;
	static int b ;
			
			
	public static void main(String[] args) {
		
	// Create a small program that defines some fields.
	// These is a small program that creates fields for certain values.
		
		
	int speed = 45;
	int distance = 100;
	int time = 60;
	int wait = 30;
	
	
	//Try creating some illegal field names.
	//See what kind of error the compiler produces.
	//In this case, the integer classification produced an error because of the decimal number.
	// #the and the speed are considered invalid or illegal field names.
	
	
	int speed2 = 5.2;
	int #the = 4;
	int the speed = 40;
	
		
	//Try the same with a local variable
	//See what kind of compiler errors you can produce.
	// With these local variables the error is " variable may not have been initialized".
	
	
	int speed1 ;
	int distance1 ;
	int time1 ;
	int wait1 ;
	
	
	System.out.println("speed =" + speed);
	System.out.println("distance =" + distance);
	System.out.println("time =" + time);
	System.out.println("wait =" + wait);
	System.out.println("speed2 =" + speed2);
	System.out.println("#the =" + #the);
	System.out.println("the speed =" + the speed);
	System.out.println(a);
	System.out.println(b);
	System.out.println(speed1);
	System.out.println(distance1);
	System.out.println(time1);
	System.out.println(wait1);
	
	}
	
}
