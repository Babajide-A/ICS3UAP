package com.bayviewglen.daysix;

import java.util.Scanner;

public class HomeworkTen {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter the length of the rectangle: ");
		double length = keyboard.nextDouble();
		
		System.out.print("Please enter the width of the rectangle: ");
		double width = keyboard.nextDouble();
		
		double area = length*width;
		double perimeter = (length+width)*2;
		
		System.out.println("The perimeter of the rectangle is " + perimeter + "and the width is " + area);
		
		

	}

}
