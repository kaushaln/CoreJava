// Write a program to remove white space from entered string

package corejava.stringopsdemo;

import java.util.Scanner;

public class RemoveWhiteSpacefromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string=null,newstring="";
		char ch;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string:");
		string = scanner.nextLine();
		for(int cnt = 0; cnt < string.length();cnt++) {
			 ch = string.charAt(cnt);
			if (ch== '\n' || ch == '\t'||ch=='\r' || ch==' ') {
				continue;
			}else
			{
				newstring= newstring +ch;
			}
		}
		
		System.out.println("Text after removing whitespaces is (Using user defined Function) :"+ newstring);
		
		scanner.close();
	}

}
