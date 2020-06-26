package Lab_2;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// olcay // Jun 25, 2020
		
		/*Write a program that asks user for the number of males and 
		the number of females registered in a class. 
		The program should display the percentage of males and females in the class.*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of males and females: ");
		int numOfMales = scan.nextInt();
		int numOfFemales = scan.nextInt();
		
		double sumOfClass=numOfMales+numOfFemales;
		
		double percentageOfmales = (numOfMales/sumOfClass)*100;
		double percentageOffemales = (numOfFemales/sumOfClass)*100;
		
		System.out.println(percentageOfmales);
		System.out.println(percentageOffemales);
		
	}

}
