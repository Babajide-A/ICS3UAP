package com.bayviewglen.crosscountry;

import java.util.Scanner;

public class CrossCountry {

	public static void main(String[] args) {
		
		// Runner One:
		String name, runnerOneFirstName, runnerOneLastName, runnerOneMileOne, runnerOneMileTwo, runnerOneFinishTime;
		
		System.out.print("Please enter your name (first last): ");
		Scanner keyboard = new Scanner(System.in);
		name = keyboard.nextLine();
		runnerOneFirstName = name.split(" ")[0];
		runnerOneLastName = name.split(" ")[1];
		
		System.out.print(runnerOneFirstName + ", please enter the time of the first mile (mm:ss.sss): ");
		runnerOneMileOne = keyboard.nextLine();
		int runnerOneMileOneMin = Integer.parseInt(runnerOneMileOne.split(":")[0]);
		double runnerOneMileOneSec = Double.parseDouble(runnerOneMileOne.split(":")[1]);
		double runnerOneMileOneTotalSec = (runnerOneMileOneMin * 60) + runnerOneMileOneSec;
		
		System.out.print(runnerOneFirstName + ", please enter the time of the second mile (mm:ss.sss): ");
		runnerOneMileTwo = keyboard.nextLine();
		int runnerOneMileTwoMin = Integer.parseInt(runnerOneMileTwo.split(":")[0]);
		double runnerOneMileTwoSec = Double.parseDouble(runnerOneMileTwo.split(":")[1]);
		double runnerOneMileTwoTotalSec = (runnerOneMileTwoMin * 60) + runnerOneMileTwoSec;
		
		System.out.print(runnerOneFirstName + ", please enter the finish time (mm:ss.sss): ");
		runnerOneFinishTime = keyboard.nextLine();
		int runnerOneFinishMin = Integer.parseInt(runnerOneFinishTime.split(":")[0]);
		double runnerOneFinishSec = Double.parseDouble(runnerOneFinishTime.split(":")[1]);
		double runnerOneFinishTotalSeconds = (runnerOneFinishMin * 60) + runnerOneFinishSec;
		
		// Runner One Split Information:	
		// Split Two:
		double runnerOneSplitTwoTotalSec = runnerOneMileTwoTotalSec - runnerOneMileOneTotalSec;
		int runnerOneSplitTwoMin = (int)(runnerOneSplitTwoTotalSec/60);
		double runnerOneSplitTwoSec = (double)(runnerOneSplitTwoTotalSec - (runnerOneSplitTwoMin * 60));
		// Split three:
		double runnerOneSplitThreeTotalSec = runnerOneFinishTotalSeconds - runnerOneMileTwoTotalSec;
		int runnerOneSplitThreeMin = (int)(runnerOneSplitThreeTotalSec/60);
		double runnerOneSplitThreeSec = (double)(runnerOneSplitThreeTotalSec - (runnerOneSplitThreeMin * 60));
		
		System.out.println("\nRunner One Summary");
		System.out.println("******************");
		System.out.println("\n" + runnerOneLastName + ", " + runnerOneFirstName);
		System.out.println("\nSplit One: " + runnerOneMileOne);
		System.out.printf("Split Two: " + runnerOneSplitTwoMin + ":%6.3f", runnerOneSplitTwoSec);
		System.out.printf("\nSplit Three: " + runnerOneSplitThreeMin + ":%6.3f", runnerOneSplitThreeSec);
		System.out.printf("\nFinish Time: " + runnerOneFinishMin + ":%6.3f", runnerOneFinishSec);
		System.out.println("\n");
		
		
		
		
		// Runner Two:
		String nameTwo, runnerTwoFirstName, runnerTwoLastName, runnerTwoMileOne, runnerTwoMileTwo, runnerTwoFinishTime;
		
		System.out.print("Please enter your name (first last): ");
		Scanner keyboardTwo = new Scanner(System.in);
		nameTwo = keyboardTwo.nextLine();
		runnerTwoFirstName = nameTwo.split(" ")[0];
		runnerTwoLastName = nameTwo.split(" ")[1];
		
		System.out.print(runnerTwoFirstName + ", please enter the time of the first mile (mm:ss.sss): ");
		runnerTwoMileOne = keyboardTwo.nextLine();
		int runnerTwoMileOneMin = Integer.parseInt(runnerTwoMileOne.split(":")[0]);
		double runnerTwoMileOneSec = Double.parseDouble(runnerTwoMileOne.split(":")[1]);
		double runnerTwoMileOneTotalSec = (runnerTwoMileOneMin * 60) + runnerTwoMileOneSec;
		
		System.out.print(runnerTwoFirstName + ",please enter the time of the second mile (mm:ss.sss): ");
		runnerTwoMileTwo = keyboardTwo.nextLine();
		int runnerTwoMileTwoMin = Integer.parseInt(runnerTwoMileTwo.split(":")[0]);
		double runnerTwoMileTwoSec = Double.parseDouble(runnerTwoMileTwo.split(":")[1]);
		double runnerTwoMileTwoTotalSec = (runnerTwoMileTwoMin * 60) + runnerTwoMileTwoSec;
		
		System.out.print(runnerTwoFirstName + ", please enter the finish time (mm:ss.sss): ");
		runnerTwoFinishTime = keyboardTwo.nextLine();
		int runnerTwoFinishMin = Integer.parseInt(runnerTwoFinishTime.split(":")[0]);
		double runnerTwoFinishSec = Double.parseDouble(runnerTwoFinishTime.split(":")[1]);
		double runnerTwoFinishTotalSeconds = (runnerTwoFinishMin * 60) + runnerTwoFinishSec;
		
		// Runner Two Split Information:	
		// Split Two:
		double runnerTwoSplitTwoTotalSec = runnerTwoMileTwoTotalSec - runnerTwoMileOneTotalSec;
		int runnerTwoSplitTwoMin = (int)(runnerTwoSplitTwoTotalSec/60);
		double runnerTwoSplitTwoSec = (double)(runnerTwoSplitTwoTotalSec - (runnerTwoSplitTwoMin * 60));
		// Split three:
		double runnerTwoSplitThreeTotalSec = runnerTwoFinishTotalSeconds - runnerTwoMileTwoTotalSec;
		int runnerTwoSplitThreeMin = (int)(runnerTwoSplitThreeTotalSec/60);
		double runnerTwoSplitThreeSec = (double)(runnerTwoSplitThreeTotalSec - (runnerTwoSplitThreeMin * 60));
		
		System.out.println("\nRunner Two Summary");
		System.out.println("******************");
		System.out.println("\n" + runnerTwoLastName + ", " + runnerTwoFirstName);
		System.out.println("\nSplit One: " + runnerTwoMileOne);
		System.out.printf("Split Two: " + runnerTwoSplitTwoMin + ":%6.3f", runnerTwoSplitTwoSec);
		System.out.printf("\nSplit Three: " + runnerTwoSplitThreeMin + ":%6.3f", runnerTwoSplitThreeSec);
		System.out.printf("\nFinish Time: " + runnerTwoFinishMin + ":%6.3f", runnerTwoFinishSec);
		System.out.println("\n");
		
		
		
		
		// Runner Three:
		String nameThree, runnerThreeFirstName, runnerThreeLastName, runnerThreeMileOne, runnerThreeMileTwo, runnerThreeFinishTime;
		
		System.out.print("Please enter your name (first last): ");
		Scanner keyboardThree = new Scanner(System.in);
		nameThree = keyboardThree.nextLine();
		runnerThreeFirstName = nameThree.split(" ")[0];
		runnerThreeLastName = nameThree.split(" ")[1];
		
		System.out.print(runnerThreeFirstName + ", please enter the time of the first mile (mm:ss.sss): ");
		runnerThreeMileOne = keyboardThree.nextLine();
		int runnerThreeMileOneMin = Integer.parseInt(runnerThreeMileOne.split(":")[0]);
		double runnerThreeMileOneSec = Double.parseDouble(runnerThreeMileOne.split(":")[1]);
		double runnerThreeMileOneTotalSec = (runnerThreeMileOneMin * 60) + runnerThreeMileOneSec;
		
		System.out.print(runnerThreeFirstName + ",please enter the time of the second mile (mm:ss.sss): ");
		runnerThreeMileTwo = keyboardThree.nextLine();
		int runnerThreeMileTwoMin = Integer.parseInt(runnerThreeMileTwo.split(":")[0]);
		double runnerThreeMileTwoSec = Double.parseDouble(runnerThreeMileTwo.split(":")[1]);
		double runnerThreeMileTwoTotalSec = (runnerThreeMileTwoMin * 60) + runnerThreeMileTwoSec;
		
		System.out.print(runnerThreeFirstName + ", please enter the finish time (mm:ss.sss): ");
		runnerThreeFinishTime = keyboardThree.nextLine();
		int runnerThreeFinishMin = Integer.parseInt(runnerThreeFinishTime.split(":")[0]);
		double runnerThreeFinishSec = Double.parseDouble(runnerThreeFinishTime.split(":")[1]);
		double runnerThreeFinishTotalSeconds = (runnerThreeFinishMin * 60) + runnerThreeFinishSec;
		
		// Runner Three Split Information:	
		// Split Two:
		double runnerThreeSplitTwoTotalSec = runnerThreeMileTwoTotalSec - runnerThreeMileOneTotalSec;
		int runnerThreeSplitTwoMin = (int)(runnerThreeSplitTwoTotalSec/60);
		double runnerThreeSplitTwoSec = (double)(runnerThreeSplitTwoTotalSec - (runnerThreeSplitTwoMin * 60));
		// Split three:
		double runnerThreeSplitThreeTotalSec = runnerThreeFinishTotalSeconds - runnerThreeMileTwoTotalSec;
		int runnerThreeSplitThreeMin = (int)(runnerThreeSplitThreeTotalSec/60);
		double runnerThreeSplitThreeSec = (double)(runnerThreeSplitThreeTotalSec - (runnerThreeSplitThreeMin * 60));
		
		System.out.println("\nRunner Three Summary");
		System.out.println("******************");
		System.out.println("\n" + runnerThreeLastName + ", " + runnerThreeFirstName);
		System.out.println("\nSplit One: " + runnerThreeMileOne);
		System.out.printf("Split Two: " + runnerThreeSplitTwoMin + ":%6.3f", runnerThreeSplitTwoSec);
		System.out.printf("\nSplit Three: " + runnerThreeSplitThreeMin + ":%6.3f", runnerThreeSplitThreeSec);
		System.out.printf("\nFinish Time: " + runnerThreeFinishMin + ":%6.3f", runnerThreeFinishSec);
		System.out.println("\n");
		
		
		
		
		
		// Runner Four:
		String nameFour, runnerFourFirstName, runnerFourLastName, runnerFourMileOne, runnerFourMileTwo, runnerFourFinishTime;
		
		System.out.print("Please enter your name (first last): ");
		Scanner keyboardFour = new Scanner(System.in);
		nameFour = keyboardFour.nextLine();
		runnerFourFirstName = nameFour.split(" ")[0];
		runnerFourLastName = nameFour.split(" ")[1];
		
		System.out.print(runnerFourFirstName + ", please enter the time of the first mile (mm:ss.sss): ");
		runnerFourMileOne = keyboardFour.nextLine();
		int runnerFourMileOneMin = Integer.parseInt(runnerFourMileOne.split(":")[0]);
		double runnerFourMileOneSec = Double.parseDouble(runnerFourMileOne.split(":")[1]);
		double runnerFourMileOneTotalSec = (runnerFourMileOneMin * 60) + runnerFourMileOneSec;
		
		System.out.print(runnerFourFirstName + ",please enter the time of the second mile (mm:ss.sss): ");
		runnerFourMileTwo = keyboardFour.nextLine();
		int runnerFourMileTwoMin = Integer.parseInt(runnerFourMileTwo.split(":")[0]);
		double runnerFourMileTwoSec = Double.parseDouble(runnerFourMileTwo.split(":")[1]);
		double runnerFourMileTwoTotalSec = (runnerFourMileTwoMin * 60) + runnerFourMileTwoSec;
		
		System.out.print(runnerFourFirstName + ", please enter the finish time (mm:ss.sss): ");
		runnerFourFinishTime = keyboardFour.nextLine();
		int runnerFourFinishMin = Integer.parseInt(runnerFourFinishTime.split(":")[0]);
		double runnerFourFinishSec = Double.parseDouble(runnerFourFinishTime.split(":")[1]);
		double runnerFourFinishTotalSeconds = (runnerFourFinishMin * 60) + runnerFourFinishSec;
		
		// Runner Four Split Information:	
		// Split Two:
		double runnerFourSplitTwoTotalSec = runnerFourMileTwoTotalSec - runnerFourMileOneTotalSec;
		int runnerFourSplitTwoMin = (int)(runnerFourSplitTwoTotalSec/60);
		double runnerFourSplitTwoSec = (double)(runnerFourSplitTwoTotalSec - (runnerFourSplitTwoMin * 60));
		// Split three:
		double runnerFourSplitThreeTotalSec = runnerFourFinishTotalSeconds - runnerFourMileTwoTotalSec;
		int runnerFourSplitThreeMin = (int)(runnerFourSplitThreeTotalSec/60);
		double runnerFourSplitThreeSec = (double)(runnerFourSplitThreeTotalSec - (runnerFourSplitThreeMin * 60));
		
		System.out.println("\nRunner Four Summary");
		System.out.println("******************");
		System.out.println("\n" + runnerFourLastName + ", " + runnerFourFirstName);
		System.out.println("\nSplit One: " + runnerFourMileOne);
		System.out.printf("Split Two: " + runnerFourSplitTwoMin + ":%6.3f", runnerFourSplitTwoSec);
		System.out.printf("\nSplit Three: " + runnerFourSplitThreeMin + ":%6.3f", runnerFourSplitThreeSec);
		System.out.printf("\nFinish Time: " + runnerFourFinishMin + ":%6.3f", runnerFourFinishSec);
		System.out.println("\n");
		
		
		
		
		
		// Runner Five:
		String nameFive, runnerFiveFirstName, runnerFiveLastName, runnerFiveMileOne, runnerFiveMileTwo, runnerFiveFinishTime;
		
		System.out.print("Please enter your name (first last): ");
		Scanner keyboardFive = new Scanner(System.in);
		nameFive = keyboardFive.nextLine();
		runnerFiveFirstName = nameFive.split(" ")[0];
		runnerFiveLastName = nameFive.split(" ")[1];
		
		System.out.print(runnerFiveFirstName + ", please enter the time of the first mile (mm:ss.sss): ");
		runnerFiveMileOne = keyboardFive.nextLine();
		int runnerFiveMileOneMin = Integer.parseInt(runnerFiveMileOne.split(":")[0]);
		double runnerFiveMileOneSec = Double.parseDouble(runnerFiveMileOne.split(":")[1]);
		double runnerFiveMileOneTotalSec = (runnerFiveMileOneMin * 60) + runnerFiveMileOneSec;
		
		System.out.print(runnerFiveFirstName + ",please enter the time of the second mile (mm:ss.sss): ");
		runnerFiveMileTwo = keyboardFive.nextLine();
		int runnerFiveMileTwoMin = Integer.parseInt(runnerFiveMileTwo.split(":")[0]);
		double runnerFiveMileTwoSec = Double.parseDouble(runnerFiveMileTwo.split(":")[1]);
		double runnerFiveMileTwoTotalSec = (runnerFiveMileTwoMin * 60) + runnerFiveMileTwoSec;
		
		System.out.print(runnerFiveFirstName + ", please enter the finish time (mm:ss.sss): ");
		runnerFiveFinishTime = keyboardFive.nextLine();
		int runnerFiveFinishMin = Integer.parseInt(runnerFiveFinishTime.split(":")[0]);
		double runnerFiveFinishSec = Double.parseDouble(runnerFiveFinishTime.split(":")[1]);
		double runnerFiveFinishTotalSeconds = (runnerFiveFinishMin * 60) + runnerFiveFinishSec;
		
		// Runner Five Split Information:	
		// Split Two:
		double runnerFiveSplitTwoTotalSec = runnerFiveMileTwoTotalSec - runnerFiveMileOneTotalSec;
		int runnerFiveSplitTwoMin = (int)(runnerFiveSplitTwoTotalSec/60);
		double runnerFiveSplitTwoSec = (double)(runnerFiveSplitTwoTotalSec - (runnerFiveSplitTwoMin * 60));
		// Split three:
		double runnerFiveSplitThreeTotalSec = runnerFiveFinishTotalSeconds - runnerFiveMileTwoTotalSec;
		int runnerFiveSplitThreeMin = (int)(runnerFiveSplitThreeTotalSec/60);
		double runnerFiveSplitThreeSec = (double)(runnerFiveSplitThreeTotalSec - (runnerFiveSplitThreeMin * 60));
		
		System.out.println("\nRunner Five Summary");
		System.out.println("******************");
		System.out.println("\n" + runnerFiveLastName + ", " + runnerFiveFirstName);
		System.out.println("\nSplit One: " + runnerFiveMileOne);
		System.out.printf("Split Two: " + runnerFiveSplitTwoMin + ":%6.3f", runnerFiveSplitTwoSec);
		System.out.printf("\nSplit Three: " + runnerFiveSplitThreeMin + ":%6.3f", runnerFiveSplitThreeSec);
		System.out.printf("\nFinish Time: " + runnerFiveFinishMin + ":%6.3f", runnerFiveFinishSec);
		System.out.println("\n");
		
		
		
		
		
		//Chart
		String column1 = ("Runner");
		String column2 = ("Split 1 Time");
		String column3 = ("Split 2 Time");
		String column4 = ("Split 3 Time");
		String column5 = ("Finish Time");
		System.out.printf("\n" + "%-20s %-21s %-21s %-21s %-30s", column1, column2, column3, column4, column5);
		System.out.println("\n------------------------------------------------------------------------------");
		System.out.printf("\n" + "%-20s %-21 %-21s %-21s %-30s", runnerOneFirstName, runnerOneMileOneMin + ":" + runnerOneMileOneSec, runnerOneSplitTwoMin + ":" + runnerOneSplitTwoSec, runnerOneSplitThreeMin + ":" + runnerOneSplitThreeSec, runnerOneFinishMin + ":" + runnerOneFinishSec);
		System.out.printf("\n" + "%-20s %-21 %-21s %-21s %-30s", runnerTwoFirstName, runnerTwoMileOneMin + ":" + runnerTwoMileOneSec, runnerTwoSplitTwoMin + ":" + runnerTwoSplitTwoSec, runnerTwoSplitThreeMin + ":" + runnerTwoSplitThreeSec, runnerTwoFinishMin + ":" + runnerTwoFinishSec);
		System.out.printf("\n" + "%-20s %-21 %-21s %-21s %-30s", runnerThreeFirstName, runnerThreeMileOneMin + ":" + runnerThreeMileOneSec, runnerThreeSplitTwoMin + ":" + runnerThreeSplitTwoSec, runnerThreeSplitThreeMin + ":" + runnerThreeSplitThreeSec, runnerThreeFinishMin + ":" + runnerThreeFinishSec);
		System.out.printf("\n" + "%-20s %-21 %-21s %-21s %-30s", runnerFourFirstName, runnerFourMileOneMin + ":" + runnerFourMileOneSec, runnerFourSplitTwoMin + ":" + runnerFourSplitTwoSec, runnerFourSplitThreeMin + ":" + runnerFourSplitThreeSec, runnerFourFinishMin + ":" + runnerFourFinishSec);
		System.out.printf("\n" + "%-20s %-21 %-21s %-21s %-30s", runnerFiveFirstName, runnerFiveMileOneMin + ":" + runnerFiveMileOneSec, runnerFiveSplitTwoMin + ":" + runnerFiveSplitTwoSec, runnerFiveSplitThreeMin + ":" + runnerFiveSplitThreeSec, runnerFiveFinishMin + ":" + runnerFiveFinishSec);
		
		

	}

}
