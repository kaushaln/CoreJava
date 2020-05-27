// Write a program to to count total punctuations in the string.

package corejava.stringopsdemo;

import java.util.Scanner;

public class FindTotalCountOfPunctuationInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string;
		int index,pcount=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		string = scanner.nextLine();
		for(int cnt=0;cnt<string.length();cnt++) {
			
			index = checkforpunctuation(string.charAt(cnt));
			if (index != -1) {
				pcount++;
			}
		}
		
		System.out.println("Total Punctuation Count in string is : "+ pcount);
		scanner.close();

	}
	
	public static int checkforpunctuation(char ch) {
		String str = "?.,:;(){}[]-!--";
		return str.indexOf(ch);
	}

}
