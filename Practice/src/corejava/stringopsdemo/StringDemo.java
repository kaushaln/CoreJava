// Write a program to read string from user and print it on console.
package corejava.stringopsdemo;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String string = scanner.nextLine();
		System.out.println("Entered String is :" + string);
		scanner.close();

	}

}
