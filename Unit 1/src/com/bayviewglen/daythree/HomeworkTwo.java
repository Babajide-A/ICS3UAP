package com.bayviewglen.daythree;

public class HomeworkTwo {

	public static void main(String[] args) {
		
		double volume, radius;

		radius = 7;

		volume = 4.0 / 3.0 * Math.PI * radius * radius * radius; 
		
		// we need double division since 4/3 is 1 and not 1.333...

		System.out.println("The volume of the sphere with radius " + radius + " is " + volume + ".");

	}

}
