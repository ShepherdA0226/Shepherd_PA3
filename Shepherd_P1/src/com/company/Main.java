package com.company;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {

	public static void generateQuestion(int num1, int num2) {

		System.out.println("How much is " + num1 + " times " + num2 + "?");
	}

	public static void generateAnswer(int num1, int num2, int genResponseNum, int tally, double numCorrect, int numIncorrect) {

		Scanner scnr = new Scanner(System.in);
		double userInput = scnr.nextInt(); //student response stored in a double precision floating-point variable
		SecureRandom randNums = new SecureRandom();
		final double THRESHOLD = 0.0001;
		double correctAnswer = num1 * num2;

		if (Math.abs(correctAnswer - userInput) > THRESHOLD) {
			switch (genResponseNum) {
				case 1:
					System.out.println("No. Please try again.\n");
					tally++;
					numIncorrect++;
					break;
				case 2:
					System.out.println("Wrong. Try once more.\n");
					tally++;
					numIncorrect++;
					break;
				case 3:
					System.out.println("Don't give up!\n");
					tally++;
					numIncorrect++;
					break;
				case 4:
					System.out.println("No. Keep trying.\n");
					tally++;
					numIncorrect++;
					break;
			}

			genResponseNum = 0;
			genResponseNum = randNums.nextInt(4) + 1;
		}

		else if (Math.abs(correctAnswer - userInput) < THRESHOLD) {
			switch (genResponseNum) {
				case 1:
					System.out.println("Very good!\n");
					tally++;
					numCorrect++;
					break;
				case 2:
					System.out.println("Excellent!\n");
					tally++;
					numCorrect++;
					break;
				case 3:
					System.out.println("Nice work!\n");
					tally++;
					numCorrect++;
					break;
				case 4:
					System.out.println("Keep up the good work!\n");
					tally++;
					numCorrect++;
					break;
			}
			genResponseNum = 0;
			genResponseNum = randNums.nextInt(4) + 1;

		}

		if (tally < 10) {
			num1 = 0;
			num2 = 0;
			num1 = randNums.nextInt(10);
			num2 = randNums.nextInt(10);
			generateQuestion(num1, num2);
			generateAnswer(num1, num2, genResponseNum, tally, numCorrect, numIncorrect);
		}

		else if (tally == 10) {
			if (numCorrect / 10 > 0.75) {
				System.out.printf("%.0f", numCorrect);
				System.out.println(" correct answers and " + numIncorrect + " incorrect answers.\n");
				System.out.println("Congratulations, you are ready to go to the next level!\n");
				System.out.print("Would you like to begin another session? Please enter \"Yes\" or \"No\": ");
				scnr.nextLine();
				String resetResponse = scnr.nextLine();
				if (resetResponse.equals("yes") || resetResponse.equals("Yes")) {
					num1 = randNums.nextInt(10);
					num2 = randNums.nextInt(10);
					genResponseNum = randNums.nextInt(4) + 1;
					tally = 0;
					numCorrect = 0;
					numIncorrect = 0;
					generateQuestion(num1, num2);
					generateAnswer(num1, num2, genResponseNum, tally, numCorrect, numIncorrect);
				}
				else if (resetResponse.equals("no") || resetResponse.equals("No")) System.out.println("\nThank you. Have a good day!");
			}

			else if (numCorrect / 10 < 0.75) {
				System.out.printf("%.0f", numCorrect);
				System.out.println(" correct answers and " + numIncorrect + " incorrect answers.\n");
				System.out.println("Please ask your teacher for extra help.\n");

				System.out.print("Would you like to begin another session? Please enter \"Yes\" or \"No\": ");
				scnr.nextLine();
				String resetResponse = scnr.nextLine();
				if (resetResponse.equals("yes") || resetResponse.equals("Yes")) {
					num1 = randNums.nextInt(10);
					num2 = randNums.nextInt(10);
					genResponseNum = randNums.nextInt(4) + 1;
					tally = 0;
					numCorrect = 0;
					numIncorrect = 0;
					generateQuestion(num1, num2);
					generateAnswer(num1, num2, genResponseNum, tally, numCorrect, numIncorrect);
				}
				else if (resetResponse.equals("no") || resetResponse.equals("No")) System.out.println("\nThank you. Have a good day!");

			}
		}
	}

	public static void main(String[] args)
	{
		SecureRandom randNums = new SecureRandom();
		int num1 = randNums.nextInt(10);
		int num2 = randNums.nextInt(10);
		int genResponseNum = randNums.nextInt(4) + 1;
		int tally = 0;
		double numCorrect = 0;
		int numIncorrect = 0;

		generateQuestion(num1, num2);
		generateAnswer(num1, num2, genResponseNum, tally, numCorrect, numIncorrect);

	}
}
