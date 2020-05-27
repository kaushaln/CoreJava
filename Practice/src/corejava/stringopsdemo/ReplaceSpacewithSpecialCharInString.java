// Write a program to replace space with special character entered by user.
package corejava.stringopsdemo;

import java.util.Scanner;

public class ReplaceSpacewithSpecialCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = null,newstring=null;
		char spch;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		string = scanner.nextLine();
		System.out.println("Enter the special character to replace space");
		spch=scanner.nextLine().charAt(0);
		System.out.println("=========================");
		System.out.println("Entered String is:" +string);
		System.out.println("Entered special character to replace space is "+ spch);
		System.out.println("===========================");
		newstring = string.replace(' ', spch);
		System.out.println(" After replacing space string content is " + newstring);
		scanner.close();

	}
	
	

}
