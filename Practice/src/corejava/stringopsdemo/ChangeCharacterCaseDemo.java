// Write a program to read the string from the user and change it to lower case first and then in upper case
package corejava.stringopsdemo;

import java.util.Scanner;

public class ChangeCharacterCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		System.out.println("Entered string is:"+text);
		System.out.println("Changing LowerCase to Upper Case... ");
		System.out.println("New String with lower case is "+ text.toLowerCase());
		System.out.println("New String with lower case is "+ text.toUpperCase());
		scanner.close();
	}

}
