package Lab_2;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// olcay // Jun 25, 2020
		
/*Write a program that asks the user for a positive nonzero integer value. 
 * The program should use a loop to get the sum of all the integers from 1 up to the number entered.   */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a posotive integer value: ");
		int num = scan.nextInt();
		int sum=0;
		
		if((num!=0) && (num%1)==0) {
			
			for(int i=1; i<=num; i++) {
			
			sum=sum+i;
			
			}
		}else {
			System.out.println("Invalid value");
		}
		System.out.println(sum);
		
	}

}
