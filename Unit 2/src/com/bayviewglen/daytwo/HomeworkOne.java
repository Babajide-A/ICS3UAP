package com.bayviewglen.daytwo;

import java.util.Scanner;

public class HomeworkOne {

	public static void main(String[] args) {
		/*
		 * 1.	Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!". Read in the name from the keyboard.
		 */

				Scanner keyboard = new Scanner (System.in);
				
				System.out.print("Please enter a name: ");
				String name = keyboard.nextLine();
				
				System.out.println("Hello " + name + "!");

			}

	}
