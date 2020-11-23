package blocks;
import java.util.*;
public class arithmeticCalculator {
	public static int addition(int a, int b) {
		int retVal = 0;
		boolean success = false;
		while (success == false) {
			try {
				retVal = a + b;
				success = true;
			} catch(Exception ex) {
				System.out.println("error: " + ex.getMessage());
				System.out.println("returning 0");
				return 0;
			}
		}
		return retVal;
	}
	public static int subtraction(int a, int b) {
		int retVal = 0;
		boolean success = false;
		while (success == false) {
			try {
				retVal = a - b;
				success = true;
			} catch(Exception ex) {
				System.out.println("error: " + ex.getMessage());
				System.out.println("returning 0");
				return 0;
			}
		}
		return retVal;
	}
	public static int division(int a, int b) {
		int retVal = 0;
		boolean success = false;
		while (success == false) {
			try {
				retVal = a / b;
				success = true;
			} catch(Exception ex) {
				System.out.println("error: " + ex.getMessage());
				System.out.println("returning 0");
				return 0;
			}
		}
		return retVal;
	}
	public static int multiplication(int a, int b) {
		int retVal = 0;
		boolean success = false;
		while (success == false) {
			try {
				retVal = a * b;
				success = true;
			} catch(Exception ex) {
				System.out.println("error: " + ex.getMessage());
				System.out.println("returning 0");
				return 0;
			}
		}
		return retVal;
	}
	public static void main(String[] args) {
		boolean success1, success2;
		while (true) {
			success1 = false;
			success2 = false;
			Scanner s = new Scanner(System.in);
			System.out.println("Welcome to arithmeticCalculator");
			System.out.println("Enter 1st integer");
			
			int num1 = 0, num2 = 0, res = 0;
			while (success1 == false) {
				
				try { 
					num1 = s.nextInt();
					success1 = true;
				} catch(Exception ex) {
					System.out.println("Please enter valid integer");
					System.out.println("error: " + ex.getMessage());
				}
				s.nextLine();
			}
			
			System.out.println("Enter 2nd integer");
			while (success2 == false) {
				try { 
					num2 = s.nextInt();
					success2 = true;
				} catch(Exception ex) {
					System.out.println("Please enter valid integer");
					System.out.println("error: " + ex.getMessage());
				}
				s.nextLine();
			}
			
			System.out.println("please specify operation to perform");
			System.out.println("Enter 'addition' or 'subtraction' or 'division' or 'multiplication");
			
			String op = s.nextLine();
			
			switch (op) {
				case "addition": res = addition(num1,num2);
					break;
				case "subtraction" : res = subtraction(num1,num2);
					break;
				case "division" : res = division(num1, num2);
					break;
				case "multiplication": res = multiplication(num1,num2);
					break;
				default: System.out.println("invalid input");
					break;
			}
			System.out.println("displaying result : " + res);
		
		}
		
	
		
	
	}
}
