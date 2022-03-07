package labs;

import java.util.Scanner;

public class PerformanceTask {

	public static void main(String[] args) {
		
		Scanner inKey = new Scanner(System.in); 

		//gets the velocity and angle
		System.out.print("Enter launch velocity (m/s): ");
		double vel = inKey.nextDouble();
		System.out.print("Enter launch angle (degrees): ");
		double ang = inKey.nextDouble();
		
		//creates variables and prints zero
		int time = 0;
		double xval = 0;
		double yval = 0;
		
		
		//calculates zero
		System.out.printf("Time: %ds\nx-pos: %fm\ny-pos: %fm\n",time,xval,yval);
		yval=0;
	
		//does math stuff
		while (yval > 0) {
		yval = Math.sin(Math.toRadians(ang))*time*vel-0.5*9.8*Math.pow(time, 2);
		xval = Math.cos(Math.toRadians(ang))*time*vel;
		if (yval<0) {
			yval=0;
		}
		System.out.printf("Time: %ds\nx-pos: %fm\ny-pos: %fm\n",time,xval,yval);
		time++;
		}
		
		
		
		
		
		
		
		
	}
	
	
}
