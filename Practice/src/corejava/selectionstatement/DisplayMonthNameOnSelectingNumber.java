// Write a program that reads number from 1 to 12 and display respective name of month on console.
package corejava.selectionstatement;

import java.util.Scanner;

public class DisplayMonthNameOnSelectingNumber {

	
	public static Scanner s1 = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s1 = new Scanner(System.in);
		int no ; 
		System.out.println("Enter the number");
		no = s1.nextInt();
		
		switch(no) {
			
		case 1: 
			System.out.println("January");
			break;
			
		case 2: 
			System.out.println("February");
			break;
			
		case 3: 
			System.out.println("March");
			break;
			
		case 4: 
			System.out.println("April");
			break;
			
		case 5: 
			System.out.println("May");
			break;
			
		case 6: 
			System.out.println("June");
			break;
			
		case 7: 
			System.out.println("July");
			break;	
			
		case 8: 
			System.out.println("August");
			break;	
			
		case 9: 
			System.out.println("September");
			break;	
			
		case 10: 
			System.out.println("October");
			break;	
		
		case 11: 
			System.out.println("November");
			break;
			
		case 12: 
			System.out.println("December");
			break;	
			
		default:
			System.out.println("Wrong Choice. Please re-run program and enter any number between 1 to 12.");
		}
		
		s1.close();
	}

}
