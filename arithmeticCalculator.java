package blocks;
import java.util.*;
public class arithmeticCalculator {
	public static float addition(float a, float b) {
		float retVal;
		retVal = a + b;
		return retVal;
	}
	public static float subtraction(float a, float b) {
		float retVal = 0;
		retVal = a - b;
		return retVal;
	}
	public static float division(float a, float b) {
		float retVal;
		retVal = a / b;
		return retVal;
	}
	public static float multiplication(float a, float b) {
		float retVal;		
		retVal = a * b;
		return retVal;
	}
	public static void main(String[] args) {
		boolean success1, success2;
		while (true) {
			success1 = false;
			success2 = false;
			Scanner s = new Scanner(System.in);
			System.out.println("Welcome to arithmeticCalculator");
			System.out.println("Enter 1st number");
			
			float num1 = 0, num2 = 0, res = 0;
			while (success1 == false) {
				
				try { 
					num1 = s.nextFloat();
					success1 = true;
				} catch(Exception ex) {
					System.out.println("Please enter valid number");
					System.out.println("error: " + ex.getMessage());
					System.out.println("waiting for input again");
					
				}
				s.nextLine();
			}
			
			System.out.println("Enter 2nd number");
			while (success2 == false) {
				try { 
					num2 = s.nextFloat();
					success2 = true;
				} catch(Exception ex) {
					System.out.println("Please enter valid number");
					System.out.println("error: " + ex.getMessage());
					System.out.println("waiting for input again");
				}
				s.nextLine();
			}
		
			
			System.out.println("please specify operation to perform");
			System.out.println("Enter '1 for addition' or '2 for subtraction' or '3 for division' or '4 for multiplication'");
			System.out.println("To stop the program enter '5 for exit'");
			
			char op = s.nextLine().charAt(0);
			
			switch (op) {
				case '1': res = addition(num1,num2);
					break;
				case '2' : res = subtraction(num1,num2);
					break;
				case '3' : res = division(num1, num2);
					break;
				case '4': res = multiplication(num1,num2);
					break;
				case '5': System.out.println("exiting program"); System.exit(0);
					break;
				default: System.out.println("invalid input");
					break;
			}
			System.out.println("displaying result : " + res);
		
		}
		
	
		
	
	}
}
