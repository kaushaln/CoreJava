// Write a program to read two string from user. Concate two strings and display them in console.
package corejava.stringopsdemo;

import java.util.Scanner;

public class ConcateTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string1:");
		String firstText = scanner.nextLine();
		System.out.println("Enter the string2:");
		String secondText = scanner.nextLine();
		System.out.println("Concated String is : " + firstText + " " + secondText);
		scanner.close();

	}

}
