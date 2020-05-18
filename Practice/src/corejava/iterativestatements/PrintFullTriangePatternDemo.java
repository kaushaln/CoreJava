// Write a program to display pattern like below in console. Read no of lines to be printed from user.
/* 
         *
        * *
      *  *  *
     *  * *  *
    * *  *  *  * 
 
 */
package corejava.iterativestatements;

import java.util.Scanner;

public class PrintFullTriangePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of rows you want to print:");
		int rowcount = scanner.nextInt();
		
		for(int counter = 1;counter <= rowcount ; counter++) {
			
			for(int spacecounter=15-counter;spacecounter > 0;spacecounter--) {
				
				System.out.print(" ");
			}
			for (int acounter = 1 ; acounter <= counter ; acounter++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		scanner.close();
	}
}
