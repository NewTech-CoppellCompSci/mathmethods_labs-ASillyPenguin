package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		
		Scanner inKey = new Scanner(System.in); 

		//Gets a two ints from user
		System.out.print("Enter a positive integer: "); 
		int num1 = inKey.nextInt();
		System.out.print("Enter another positive integer: "); 
		int num2 = inKey.nextInt();
		
		//calculates a scope and minimum value
		int max = Math.max(num1, num2);
		int min = Math.min(num1, num2);
		int scope = max-min + 1;
		
		//prints the numbers
		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * scope + min);
			System.out.print(num + " ");
		}
		
		
	}
	
	
	
	
	public static void problem02() {
		
		Scanner inKey = new Scanner(System.in); 

		System.out.print("Enter the same cylinder's radius: ");
		int num2 = inKey.nextInt();
		// gets a radius and height
		System.out.print("Enter a cylinder's height: ");
		int num1 = inKey.nextInt();

		// prints the volume
		System.out.println("The volume is " + (Math.PI * Math.pow(num2, 2)) * num1);

	}

	
	

	public static void problem03() {

		Scanner inKey = new Scanner(System.in); 

		//gets the position for two points
		System.out.print("Enter x1: "); 
		double x1 = inKey.nextDouble();
		System.out.print("Enter y1: "); 
		double y1 = inKey.nextDouble();
		System.out.print("Enter x2: "); 
		double x2 = inKey.nextDouble();
		System.out.print("Enter y2: "); 
		double y2 = inKey.nextDouble();

		//prints distance
		System.out.println("The distance between them is "+Math.sqrt( (Math.pow((x1-x2), 2) + (Math.pow((y1-y2), 2)) ) ));
	}
	public static void problem04() {
		
		Scanner inKey = new Scanner(System.in); 

		//gets the position for two points
		System.out.print("Enter a-value: "); 
		double a = inKey.nextDouble();
		System.out.print("Enter b-value: "); 
		double b = inKey.nextDouble();
		System.out.print("Enter c-value: "); 
		double c = inKey.nextDouble();
		
		//solves the quadradic formula
		System.out.print("x1= "+(-b+Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a) );
		System.out.print("x2= "+(-b-Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a) );
		
	}
	
	

	
}
