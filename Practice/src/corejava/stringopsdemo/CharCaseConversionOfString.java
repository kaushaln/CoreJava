// Write a program to read the text from the user and change the case of written text's character.
// If entered text contains upper case then after execution of the program it should be shown as Lower case and If text contains lower case then 
// after execution of program it will show as Upper case.

package corejava.stringopsdemo;

import java.util.Scanner;

public class CharCaseConversionOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string :");
		String text = scanner.nextLine();
		System.out.println("Entered text is :" + text);
		String modifiedCaseString = ChangetheCaseofCharactersOfString(text);
		System.out.println("Modified Case String is " + modifiedCaseString);
		scanner.close();
	}
	
	public static String ChangetheCaseofCharactersOfString(String s) {
		
		String tempString = "";
		for (int cnt=0;cnt<s.length();cnt++) {
			int no = (int)s.charAt(cnt);
			if( no >=65 && no <=90) {
				no = no + 32;
				tempString = tempString + (char)no;
			}
			else if (no >=97 && no <= 122) {
				no = no - 32;
				tempString = tempString + (char)no;
			}
			else {
				tempString = tempString + (char)no;
			}
		}
		return tempString;
	}

}
