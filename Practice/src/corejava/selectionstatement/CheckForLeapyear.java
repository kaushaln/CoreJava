// Write a program to read the number from user and determine whether it is leap year or not
package corejava.selectionstatement;

import java.util.Scanner;

public class CheckForLeapyear {

	public static Scanner s1 = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s1 = new Scanner(System.in);
		int year;
		boolean leapyear = false;
		System.out.println("Enter the year:");
		year = s1.nextInt();
		
		if(year%4 == 0) {
			
			if (year%100 == 0) {
				
				if (year%400 == 0) {
					leapyear = true;
				}
				else
				{
					leapyear = false;
				}
			}else
			{
				leapyear = true;
			}
			
		}else {
			leapyear = false;
		}
		if (leapyear) {
			System.out.println(year + " is leap year");
		}
		else
		{
			System.out.println(year + " is not leap year");
		}
		s1.close();
	}

}
