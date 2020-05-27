// Write a program to read string and substring from the user. Check sub string is part of string or not and display appropriate message to user

package corejava.stringopsdemo;

import java.util.Scanner;

public class FindsubStringInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String string = scanner.nextLine();
		System.out.println("Enter the substring:");
		String substring = scanner.nextLine();
		int index = string.indexOf(substring);
		if(index!=-1) {
			System.out.println(substring + " is found at starting index "+index+" of main string");
		}else {
			System.out.println(substring + " is not available in main string");
		}
		
		
		scanner.close();
	}

}
