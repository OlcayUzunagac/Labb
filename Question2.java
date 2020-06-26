package Lab_2;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// olcay // Jun 25, 2020
		
		/*A bag of cookies holds 40 cookies. 
		The calorie information on the bag claims that there are 10 serving in the bag 
		and that a serving equals 300 calories. write a program that lets the user enter 
		the number of cookies he or she actually ate and then reports the number of total 
		calories consumed.*/
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of cookies you ate: ");
		int num=scan.nextInt();
		
		double totalCalories = num*75;
		System.out.println(totalCalories);
		
	}

}
