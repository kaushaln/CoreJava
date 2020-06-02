// Write a program to read string from user and find out it's length using Array.

package corejava.stringopsdemo;

import java.util.Scanner;

public class FindStringLengthUsingArray {

	public static Scanner scanner = null;
	public static char textToChArray[] = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Text;
		scanner = new Scanner(System.in);
		System.out.println("Enter the text");
		Text = scanner.nextLine();
		System.out.println("Entered Text is "+ Text);
			textToChArray = Text.toCharArray();
			System.out.println("The length Of the String is "+ (textToChArray.length));
		scanner.close();
	}

}
