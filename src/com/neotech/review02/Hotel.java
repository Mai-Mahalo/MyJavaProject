package com.neotech.review02;

public class Hotel {
	
	// In my room I have 4 floors
	// In each floor I have 6 rooms
	// Room numbers in floor 1 are 1.2 1.2 1.3 1.4 1.5 1.6
	// Room numbers in floor 2 are 2.1 2.2 2.3 2.4 2.5 2.6
	// I want to print all the room numbers

	public static void main(String[] args) {
		
		for (int floor = 1; floor <= 4; floor++) {
			System.out.println("Floor -> " + floor);	
			
			for (int room = 1; room <=6; room++) {
				System.out.print(floor + "." + room + " ");
				
			}
			System.out.println();
			// Bring me to the next line
			// then it shows like otherwise "Floor -> 2" will be next to "1.6"
			
			// Floor -> 1
			// 1.1 1.2 1.3 1.4 1.5 1.6 
			// Floor -> 2
			// 2.1 2.2 2.3 2.4 2.5 2.6 
		}
		
		
		
		

	}

}
