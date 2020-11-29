package oOP;

public class MagicCalculator extends Calculator{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		System.out.println(sqroot(100));
		System.out.println(sin(0));
		System.out.println(cosin(0));
		System.out.println(tangent(0));
		System.out.println(factorial(5));

	}
	
	public static double sqroot(int num1) {
		
			return Math.sqrt(num1);
				
			}
	
	public static double sin(double num1) {
		
			double rads = Math.toRadians(num1);
			
			return Math.sin(rads);
			
			}
	
	public static double cosin(double num1) {
		
			double rads = Math.toRadians(num1);
			
			return Math.cos(rads);
			
			}
	
	public static double tangent(double num1) {
		
			double rads = Math.toRadians(num1);
			
			return Math.tan(rads);
			
			}
	
	public static int factorial(int n){  
		
			  if (n == 0)    
				  return 1;  
			  else    
				  
			return(n * factorial(n-1));
			  
		}
	}
