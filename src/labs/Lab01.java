package labs;

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	
/*
 * 1. As the user for 2 positive integers. The return the first number to the power 
 * of the second number as formatted below.
 * 
 * Enter a positive integer: 3
 * Enter another positive integer: 5 3^5 = 243.0
 * 
 * 2. Ask the user for a positive number (any number will do). Then print that 
 * number’s square root as formatted below.
 * 
 * Enter a positive integer: 30
 * 
 * The square root of 16 is 5.477225575051661
 * 
 * 3. Ask the user for sides of a right triangle. Then print out the length 
 * of the hypotenuse as formatted below.
 * 
 * Length of side A: 5
 * Length of side B: 7 
 * Hypotenuse = 8.602325267042627
 * 
 * 
 * 4. Repeatedly ask the user for integers. When they finally enter 0, print out
 *  the largest and smallest input
 *  Enter an integer: 4
 *  Enter an integer: 9
 *  Enter an integer: -3
 *  Enter an integer: 0
 *  Max = 9
 *  Min = -3
 */
	
	public static void problem01() {
		Scanner inKey = new Scanner(System.in); 

		
		//Gets two pos ints from user
		System.out.print("Enter a positive interger: "); 
		int magicNum1 = inKey.nextInt();
		System.out.print("\nEnter another positive interger: "); 
		int magicNum2 = inKey.nextInt();
		
		//does math and print
		System.out.println(magicNum1 + "^" + magicNum2 + " = " + Math.pow(magicNum1,magicNum2)); 
	}
	
	
	
	
	public static void problem02() {
		
		Scanner inKey = new Scanner(System.in); 

		
		//Gets a pos ints from user
		System.out.print("\n\nEnter a positive interger: "); 
		double magicNum1 = inKey.nextDouble();
		
		//creates a variable to store the root and gets the root 
		double dob = Math.sqrt(magicNum1);
		
		//prints the root
		System.out.printf("\nThe square root of %f is %.15f", magicNum1, dob);
	}

	
	

	public static void problem03() {
		Scanner inKey = new Scanner(System.in); 
		
		//Gets two pos ints from user
		System.out.print("\n\nLength of side A: "); 
		double s1 = inKey.nextDouble();
		System.out.print("Length of side B: "); 
		double s2 = inKey.nextDouble();
		
		//does special math
		double hyp = Math.sqrt(Math.pow(s1,2)+Math.pow(s2,2));
		
		//prints the good stuff
		System.out.printf("\nHypotenuse = %.15f", hyp);

	}


	
	
	public static void problem04() {
		Scanner inKey = new Scanner(System.in);
		
		//gets a int from user
		System.out.print("\n\nEnter an integer: "); 
		int cur = inKey.nextInt();
		int max = cur;
		int min = cur;
		//while loop for repeating
		while (cur != 0) {
			//Gets ints from user
			System.out.print("Enter an integer: "); 
			cur = inKey.nextInt();
			max = Math.max(max, cur);
			min = Math.min (min, cur);
		}
		
		System.out.printf("\nMax = %d\nMin = %d", max, min);
				
	}
	
	
	
	
	
	
}
