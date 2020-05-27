// Write a program to read the string from user and check whether it is palindrom or not
package corejava.stringopsdemo;

import java.util.Scanner;

public class CheckForPalindromString {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the Text:");
			String Text = scanner.nextLine();
			String reverseText = ReverseText(Text);
			if (Text.equals(reverseText)) {
				System.out.println(Text + " is palindrom.");
			}else
			{
				System.out.println(Text + " is not palindrom");
			}
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
