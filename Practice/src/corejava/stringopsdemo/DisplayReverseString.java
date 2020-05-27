// Write a program to read the string from the user and display the reverse string to user on console.
package corejava.stringopsdemo;

import java.util.Scanner;

public class DisplayReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Text:");
		String Text = scanner.nextLine();
		String reverseText = ReverseText(Text);
		System.out.println("Original Text:" + Text);
		System.out.println("Reverse Text:" + reverseText);
		scanner.close();
	}
	
	public static String ReverseText(String string) {
		int stringLength = string.length();
		String temp="";
		for(int cnt=stringLength-1;cnt>=0;cnt--) {
			temp=temp + string.charAt(cnt);
		}
		return temp;
	}

}
