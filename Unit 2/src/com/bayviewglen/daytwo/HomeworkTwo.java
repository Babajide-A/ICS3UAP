package com.bayviewglen.daytwo;

import java.util.Scanner;

public class HomeworkTwo {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		
		System.out.print("Please enter one word: ");
		String a = keyboard.nextLine();
		System.out.print("Please enter another word: ");
		String b = keyboard.nextLine();
		
		System.out.print("Your words put together are " + a + b + b + a);
		
		
		

	}

}
