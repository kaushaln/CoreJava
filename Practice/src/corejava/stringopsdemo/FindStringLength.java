// Write a program to find a string length 
package corejava.stringopsdemo;

import java.util.Scanner;

public class FindStringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string:");
		String string = scanner.nextLine();
		string = string + '\0';
		int cnt=0;
		while(string.charAt(cnt)!='\0') {
			cnt++;
		}
		System.out.println("Length of string is :" + cnt);
		scanner.close();

	}

}
