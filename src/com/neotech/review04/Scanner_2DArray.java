package com.neotech.review04;

import java.util.Scanner;

// Video 2-2 (attended on live)

public class Scanner_2DArray {

	public static void main(String[] args) {
		// Ask the user: How many rows do you want in the array?
		// Ask the user: How many columns do you want in the array?
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("How many rows do you want in the array?");
		int rows = input.nextInt();
		
		System.out.println("How many columns do you want in the array?");
		int cols = input.nextInt();
		
		// Create the array (String[][] names)
		String[][]names = new String[rows][cols];
		
		// Fill the array
		for (int row = 0; row < rows; row++) {
			
			for (int col = 0; col < cols; col++) {
				System.out.println("Please enter a name: ");
				
				names[row][col] = input.next();
				
		input.close();
			}
		}
		
		// If you enter "4" rows, and "3" columns, you can enter names for 12 times.
		

	}

}
