package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkOne {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		double x;
		System.out.print("Please, enter your favourite number: ");
		
		x = keyboard.nextInt();
		
		System.out.println("The square root of " + x + " is " + x * x);
		
		
	}

}
