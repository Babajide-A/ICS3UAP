package com.bayviewglen.dayseven;

import java.util.Scanner;

public class bayviewGlenPools {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Please enter the length of the pool: ");
		double length = keyboard.nextDouble();

		System.out.print("Please enter the width of the pool: ");
		double width = keyboard.nextDouble();

		System.out.print("Please enter the depth of the shallow end: ");
		double shallowDepth = keyboard.nextDouble();

		System.out.print("Please enter the depth of the deep end: ");
		double deepDepth = keyboard.nextDouble();

		System.out.print("Please enter the length of the transition between the shallow and deep end: ");
		double transitionHypotenuse = keyboard.nextDouble();

		System.out.print("Please enter the length of the shallow end: ");
		double shallowEndLength = keyboard.nextDouble();

		final double PRICE_OF_LINER_ONE = 0.50;
		final double PRICE_OF_LINER_TWO = 0.75;
		final double PRICE_OF_LINER_THREE = 1;

		double volumeShallow = shallowEndLength * shallowDepth * width;
		double transitionHeight = deepDepth - shallowDepth;
		double lengthTransitionTriangle = Math.sqrt(Math.pow(transitionHypotenuse, 2) - Math.pow(transitionHeight, 2));
		double volumeTransitionSquare = lengthTransitionTriangle * width * shallowDepth;
		double volumeTransitionTriangle = 0.5 * (lengthTransitionTriangle * transitionHeight);
		double volumeTransition = volumeTransitionSquare + volumeTransitionTriangle;
		double deepLength = length - lengthTransitionTriangle - shallowEndLength;
		double deepVolume = deepLength * width * deepDepth;
		double volume = volumeShallow + volumeTransition + deepVolume;

		System.out.println("The volume of the pool is " + volume);
		
		System.out.println("You need " + 0.9 * volume + "mL of water to fill the pool");
		
		double shallowArea = shallowEndLength * width;
		double deepArea = deepLength * width;
		double transitionArea = 0.5 * (deepDepth + shallowDepth) * lengthTransitionTriangle;
		double area = shallowArea + deepArea + transitionArea;
		// Stuckkkkkkkkkkkkk ^^^^^^^^^^^^^^^^^^^^
		System.out.println("You need " + area + " square feet worth of lining");
		
		
		

		
	}

}
