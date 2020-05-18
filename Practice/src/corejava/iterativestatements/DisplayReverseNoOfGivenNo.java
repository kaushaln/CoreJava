// Write a program to display reverse number in console.
package corejava.iterativestatements;

import java.util.Scanner;

public class DisplayReverseNoOfGivenNo {
	
	public static Scanner s1 = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s1 = new Scanner(System.in);
		int no,revno=0;
		System.out.println("Enter the number :");
		no = s1.nextInt();
		while(no!=0) {
			revno = revno* 10;
			revno = revno + no%10;
			no = no /10;
		}
		System.out.println("reverse no is :" + revno);
		s1.close();
	}

}
