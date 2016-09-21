package com.bayviewglen.daysix;

import java.util.Scanner;

public class HomeworkEleven {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.print("Please enter the mass: ");
		double m = keyboard.nextDouble();
		
		System.out.print("Please enter the velocity: ");
		double v = keyboard.nextDouble();
		
		double ke = 0.5 * m * (v*v);
		
		System.out.println("The kinetic energy of the moving object is " + ke);
		
		

	}

}
