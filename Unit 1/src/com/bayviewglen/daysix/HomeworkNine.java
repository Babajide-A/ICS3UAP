package com.bayviewglen.daysix;

import java.util.Scanner;

public class HomeworkNine {

	public static void main(String[] args) {
		 Scanner keyboard = new Scanner (System.in);
		 
		 double pay = 0.27;
		 
		 System.out.print("Please enter the number of sales: ");
		 int sales = keyboard.nextInt();
		 
		 System.out.println(" the sales people get " + sales*pay + "$");
	
		 

	}

}
