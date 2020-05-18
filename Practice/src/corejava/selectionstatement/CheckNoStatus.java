//Write a program to read the number from user and check if whether it is positive , negative or zero.

package corejava.selectionstatement;

import java.util.Scanner;

public class CheckNoStatus {

	public static Scanner s1 = null; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s1 = new Scanner(System.in);
		System.out.println("Enter the number to check its status :");
		int no = s1.nextInt();
		if (no > 0 ) {
			System.out.println(no + " is greater than zero and It is positive.");
		}else if (no < 0) {
			System.out.println( no + " is less than zero and It is negative.");
		}else
		{
			System.out.println(" no is zero.");
		}
		s1.close();
	}

}
