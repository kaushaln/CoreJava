// Write a program to find total no of vowels and consonants in string

package corejava.stringopsdemo;

import java.util.Scanner;

public class FindVowelAndConsonantCountInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vcount=0,ccount=0;
		char ch;
		String string=null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string:");
		string = scanner.nextLine();
		for(int cnt=0;cnt<string.length();cnt++) {
			ch = string.charAt(cnt);
			if(ch == 'a' || ch == 'e' || ch=='i' || ch == 'o'||ch == 'u' || ch == 'A' || ch == 'E'|| ch == 'I' || ch =='O' || ch == 'U') {
				vcount++;
			}else {
				ccount++;
			}
		}
		System.out.println("Total no of Vowels found in "+string + " is :"+vcount);
		System.out.println("Total no of Vowels found in "+string + " is :"+ccount);
		scanner.close();

	}

}
