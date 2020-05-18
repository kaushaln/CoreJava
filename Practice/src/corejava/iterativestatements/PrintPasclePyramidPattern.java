// Write a program to print Pascal pyramid pattern using numbers. Read the number of rows to be printed from user. 
// User enters 5 then 
/*
 *                     1
 *                   1 2 1
 *                 1 2 3 2 1
 * 				 1 2 3 4 3 2 1
 *             1 2 3 4 5 4 3 2 1
 */
package corejava.iterativestatements;

import java.util.Scanner;

public class PrintPasclePyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows for Pascal pyramid");
		int rowno =scanner.nextInt(); 
		int acount;
		for (int counter = 1 ; counter <= rowno ; counter ++ ) {
			
			for(int spacecount = 15 - counter; spacecount > 0; spacecount --) {
				System.out.print(" ");
			}
			
			for (acount = 1; acount <=counter; acount++ ) {
				System.out.print(acount);
			}
			for (int revacount = counter-1;revacount > 0; revacount -- ) {
				System.out.print(revacount);
			}
			System.out.println();
		}
		scanner.close();
	}

}
