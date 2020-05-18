// Write a program which accepts two strings from user. 
// Also write a function which accepts two  strings as arguments and return concated string 

package corejava.functions;

import java.util.Scanner;

public class ConcateTwoStringsUsingFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Text1,Text2,concatedString;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the value of String 1:");
		Text1 = scanner.nextLine();
		System.out.println("Enter the value of String 2:");
		Text2 = scanner.nextLine();
		concatedString = concate(Text1,Text2);
		System.out.println("Concated Text is "+ concatedString);
		scanner.close();
	}
	
	public static String concate(String a, String b) {
		return a + b;
	}
	

}
