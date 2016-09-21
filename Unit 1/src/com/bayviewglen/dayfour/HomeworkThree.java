package com.bayviewglen.dayfour;

public class HomeworkThree {

	public static void main(String[] args) {
		
		int number = 398712;
		
		int digit2 = number/100000%10;
		int digit5 = number/10%10;
		
		int product = digit2 * digit5;
		
		System.out.println("Choose a any 6 digit number. Ex. 398712");
		
		System.out.println("Choose the second and fifth digit. Ex. 9 & 2");
		
		System.out.println("Now find the product of the two numbers.");
		
		System.out.println("For this example you would end up with " + product);

	}

}
