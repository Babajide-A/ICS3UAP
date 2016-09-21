package com.bayviewglen.dayseven;

public class ExampleTwo {

	public static void main(String[] args) {
		int secondsPerMinute = 60; //declared variables but these values should never change
		int minutesPerHour = 60;
		int hoursPerDay = 60;
		int daysPerYear = 365;
		
		int secondsPerYear = secondsPerMinute * minutesPerHour * hoursPerDay * daysPerYear;
		System.out.println(" The number of seconds in a year is (wait for it...): " + secondsPerYear);
		
		final int SECONDS_PER_MINUTE = 60;
		// SECONDS_PER_MINUTE = 3; this is a compile error
		final int MINUTES_PER_HOUR = 60;
		final int HOURS_PER_DAY = 60;
		final int DAYS_PER_YEAR = 365; 
		
		final int SECONDS_PER_YEAR = SECONDS_PER_MINUTE *  MINUTES_PER_HOUR * HOURS_PER_DAY * DAYS_PER_YEAR;
		System.out.println(" The number of seconds in a year is (wait for it...): " + SECONDS_PER_YEAR);
		
		double radius = 4.2;
		double area = Math.PI * Math.pow(radius, 2);
		
		//////////////////////////////
		
		final int NUM_SIDES = 6;
		//random number from 1 -> 6
		int topOfDie = (int) (Math.random() * NUM_SIDES + 1);
		
		
		// Math.random() gives a random decimal from 0 to 1 not including 1
		// To get more numbers, multiply it. Ex:  Math.random() -> 0...0.99999
		//                                   10 * Math.random() -> 0...9.99999
		//                               1 + 10 * Math.random() -> 1...10.9999
		//                        (int)(1 + 10 * Math.random()) -> 1...10 :)
		
		
		//If i want to go from [-10...10]
		//(int)(21*Math.random() -10)
		
	}

}
