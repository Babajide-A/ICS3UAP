package com.bayviewglen.crosscountry;

import java.util.Scanner;

public class CrossCountryHelp {

	public static void main(String[] args) {
		// Read Times in Cross Country

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a time: ");
		String time1 = scanner.nextLine();
		int minutes = Integer.parseInt(time1.split(":")[0]);
		double seconds = Double.parseDouble(time1.split(":")[1]);
	}

}
