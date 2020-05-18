//Write a program to find minimum no from two numbers which are entered by user.
package corejava.selectionstatement;

import java.util.Scanner;

public class FindMinNoFromTwoNumbers {

	public static Scanner s1 = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s1 = new Scanner(System.in);
		System.out.println("Enter the number1 :");
		int no1 = s1.nextInt();
		System.out.println("Enter the number2 :");
		int no2 = s1.nextInt();
		
		if( no1 < no2) {
			System.out.println(no1 + " is less than " + no2);
		}else
		{
			System.out.println(no2 + " is less than " + no1);
		}
		s1.close();

	}

}
