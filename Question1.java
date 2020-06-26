package Lab_2;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// olcay // Jun 25, 2020
		
		int largest,smallest;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your first number : ");
		largest=smallest = scan.nextInt();
		
		int yesOrNo=1;
		
		while(yesOrNo==1) {
			
			System.out.print("Enter your next number: ");
			int num=scan.nextInt();
			
				if(num<smallest) {
					smallest=num;
				}
				if(num>largest) {
					largest=num;
				}
			
			System.out.println("Do you want to enter another number: 0-No, 1-Yes");
			yesOrNo=scan.nextInt();
			
		}

		System.out.println("Smallest number is: " + smallest);
		System.out.println("Largest number is: " + largest);
	
	}
	
}
