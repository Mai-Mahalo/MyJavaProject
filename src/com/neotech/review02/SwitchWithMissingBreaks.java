package com.neotech.review02;

public class SwitchWithMissingBreaks {

	public static void main(String[] args) {
		
		int number = 5;
		
		switch (number) {
		case 3:
			System.out.println("3");
		case 4:
			System.out.println("4");
			break; // will skip
		case 5:
			System.out.println("5");
		case 6:
			System.out.println("6");
			break;
		case 7:
			System.out.println("7");
		default:
			System.out.println("The number was not 3,4,5,6,7");
		}
		
		// Limitations of switch-case
		
		// 1. You cannot have duplicate cases
		// 2. You should be careful with breaks
		// 3. You cannot use logical operators like an in if-else
		if (number == 3 || number == 5 || number == 7) {
			
		}
		// 4. You cannot use greater than
		if (number > 5) {
			
		}
		
		// 5. You cannot use double
		double d = 6.1;
		
		

	}

}
