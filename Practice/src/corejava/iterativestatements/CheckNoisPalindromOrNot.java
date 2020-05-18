package corejava.iterativestatements;

import java.util.Scanner;

public class CheckNoisPalindromOrNot {

	public static Scanner s1 = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no,revno=0;
		s1 = new Scanner(System.in);
		System.out.println("Enter the number");
		no = s1.nextInt();
		while(no!=0) {
			revno = revno * 10;
			revno = revno + no%10;
			no = no/10;
		}
		if ( no == revno) {
			System.out.println( no + " is a Palindrome no.");
		}else {
			System.out.println( no + "  is not a palindrome no.");
		}
	}

}
