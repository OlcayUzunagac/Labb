package Lab_2;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// olcay // Jun 26, 2020
		
		/* Write a program that will ask the user to enter the amount of a purchase. 
		 * The program should then compute the state and county tax sales tax.
		 *  Assume the state sales tax is 4 percent and the county sales tax is 2 percent. 
		 *  The program should display the amount of the purchase , the state sales tax, 
		 *  the county sales tax, the total sales tax, and the total of the sale 
		 *  (which is the sum of the amount of purchase plus the total sales tax)*/
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount: ");
		double amount = scan.nextDouble();
		
		double stateSalesTax=amount*0.04;
		double countySalesTax=amount*0.02;
		double totalSalesTax = stateSalesTax+countySalesTax;
		double totalSale=amount+totalSalesTax;
		
		System.out.println("Amount of the purchase: $" + amount + 
						   "\nState Sales Tax       : $  " + stateSalesTax +
						   "\nCounty Sales Tax      : $  " + countySalesTax + 
						   "\nTotal Sales Tax       : $  " + totalSalesTax + 
						   "\n\nTotal Sale            : $" + totalSale);
		
		
		
		
		
		
		
		
		
	}

}
