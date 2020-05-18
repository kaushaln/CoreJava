// Write a program that  takes number from user through console and check whether it is even or odd
package corejava.selectionstatement;

import java.util.Scanner;

public class CheckNoIsEvenOrOdd {

	public static Scanner s1 = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s1 = new Scanner(System.in);
		System.out.println("Enter the Number1: ");
		int no = s1.nextInt();
		if (no % 2 ==0) {
			System.out.println(no +" is even.");
		}else
		{
			System.out.println(no + " is odd.");
		}
		s1.close();
	}

}
