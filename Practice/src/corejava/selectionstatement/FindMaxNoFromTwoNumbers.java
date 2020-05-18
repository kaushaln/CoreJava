//Write a program to read two numbers from user and find out which number is greater than other one.
package corejava.selectionstatement;

import java.util.Scanner;

public class FindMaxNoFromTwoNumbers {

	public static Scanner s1 = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s1 = new Scanner(System.in);
		System.out.println("Enter value of number1:");
		int no1 = s1.nextInt();
		System.out.println("Enter value of number2:");
		int no2 = s1.nextInt();
		
		if (no1 > no2) {
			System.out.println("No1 " + no1 + " is greater than No2 " + no2);
		}else
		{
			System.out.println("No2 " + no2 + " is greater than No1 " + no1);
		}
		s1.close();
	}

}
