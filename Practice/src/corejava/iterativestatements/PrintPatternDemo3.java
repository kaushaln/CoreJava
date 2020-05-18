// Write a program to read no of lines that user wants to print in triangle made of "*" character 
/*for example if user enters 5 value then 5 lines of * character printed as below pattern.

*
* * 
* * * 
* * * * 
* * * * *

*/

package corejava.iterativestatements;

import java.util.Scanner;

public class PrintPatternDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of lines to get printed in triangle:");
		int rowcount = scanner.nextInt();
		for (int counter = 0 ; counter < rowcount ; counter++) {
			
			for (int acounter = 0; acounter<counter ; acounter++) {
				
				System.out.print(" * ");
			}
			System.out.println("");
		}
		scanner.close();

	}

}
