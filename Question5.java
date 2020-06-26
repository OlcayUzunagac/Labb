package Lab_2;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// olcay // Jun 25, 2020
		
/*Write a program that computes the tax and tip on a restaurant bill. 
 * The program should ask the user to enter the charge for the meal. 
 * The tax should be 6.75 percent of the meal charge. 
 * The tip should be 20 percent of the total after adding tax. 
 * Display the meal charge, tax amount, tip amount, and total bill on the screen.		
 */
	
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the charge: ");
		double charge= scan.nextDouble();
		
		double tax = (charge*6.75)/100;
		double tip = (charge+tax)*0.2;
		double total = charge+tax+tip;
		
		System.out.println("\nMeal charge: $" + charge + "\nTax amount : $ " + tax + "\nTip amount : $ " + tip
				+"\nTotal bill : $ " + total);
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
