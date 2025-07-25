package com.neotech.review03;

//Review 03: Part 2-1
public class MoreNumberPatters {
	
	// 1
	// 22
	// 333
	// 4444

	public static void main(String[] args) {
		
		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(row);			
			}
			System.out.println();
		}
		
		System.out.println("------------------");
		// 1111
		// 222
		// 33
		// 4
		
		for (int row = 1; row <= 4; row++) {		
// When row is 1, the column will go from 4 down to 1 (4 iterations)
// When row is 2, the column will go from 4 down to 2 (3 iterations)
			
			for (int col = 4; col >= row; col--) {
				System.out.print(row);
			}
			
			System.out.println();
		}
		
		
		}
	}


