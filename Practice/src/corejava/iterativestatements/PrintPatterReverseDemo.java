// Write a program to read no of lines that user wants to print in triangle made of "*" character 
/*for example if user enters 5 value then 5 lines of * character printed as below pattern.

* * * * * 
* * * *
* * * 
* *  
* 

*/
package corejava.iterativestatements;

import java.util.Scanner;

public class PrintPatterReverseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of lines for printing Triangle:");
		int rowcount = scanner.nextInt();
		for(int counter= rowcount ; counter >0 ; counter--) {
			
			for (int acounter = counter; acounter >0 ; acounter--) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		scanner.close();
	}

}
