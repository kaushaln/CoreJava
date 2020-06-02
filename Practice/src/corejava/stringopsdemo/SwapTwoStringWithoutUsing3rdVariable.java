/* Write a program to read two strings into different variables and swap the two string without using 3rd variable.
 * 
 * For Example : variable a = abc
 *               variable b = def
 * After swapping : variable a = def
 * 					variable b = abc
*/
package corejava.stringopsdemo;

import java.util.Scanner;

public class SwapTwoStringWithoutUsing3rdVariable {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Text1,Text2;
		Scanner scanner = new Scanner(System.in);
		//reading two texts
		System.out.println("Enter the string for Text1 variable:");
		Text1 = scanner.nextLine();
		System.out.println("Enter the string for Text2 variable:");
		Text2 = scanner.nextLine();
		//showing two text along with variable name.
		System.out.println("Strings are as below:");
		System.out.println("======================");
		System.out.println("Text1 = " + Text1);
		System.out.println("Text2 = " + Text2);
		// swapping text code	
		Text1 = Text1+Text2;
		Text2 = Text1.substring(0, Text1.indexOf(Text2,1));
		Text1 = Text1.substring(Text2.length(),Text1.length());
		System.out.println("======================");
		System.out.println("After Swapping Strings are as below :");
		System.out.println("======================");
		System.out.println("Text1 = " + Text1);
		System.out.println("Text2 = " + Text2);	
		scanner.close();
		

	}

}
