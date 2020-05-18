// Write a program to find factorial of given number
package corejava.iterativestatements;

import java.util.Scanner;

public class FindFactorialOfNo {

	public static Scanner s1 = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s1 = new Scanner(System.in);
		int fact=1;
		int no;
		System.out.println("Enter no : ");
		 no = s1.nextInt();
		
		for(int i=1;i<=no;i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of entered number " + no + " is :"+ fact);
		s1.close();
	}
	

}
