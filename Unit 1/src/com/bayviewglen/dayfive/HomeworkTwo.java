package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkTwo {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		double studentMark, overallScore, percentage;
		
		System.out.print("What was your test score : ");
		studentMark = keyboard.nextDouble();
				
		System.out.print("What was your test out of: ");
		overallScore = keyboard.nextDouble();
		
		percentage = (studentMark * 100) / overallScore;
		
		System.out.print("You got a percentage of: " + percentage + "% on this test");
		
		
	
	}

}
