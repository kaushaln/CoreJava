// Write a program that display number of days in month 
package corejava.selectionstatement;

import java.util.Scanner;

public class DisplayNoOfDaysInMonth {

	public static Scanner s1 = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s1 = new Scanner(System.in);
		int month, year;
		boolean flag=false;
		System.out.println("Enter the value for Month(Please enter no between 1 to 12):");
		month = s1.nextInt();
		System.out.println("Enter the value of year:");
		year = s1.nextInt();
			switch(month) {
			
			case 1:
			case 3: 
			case 5: 
			case 7: 
			case 8:
			case 10:
			case 12:
				System.out.println("Total no of days in month : 31 ");
			break;	
			
			case 2: 
				if (year%4 == 0) {
					if (year%100 == 0) 
					{
						if (year%400 == 0) 
						{
							flag = true;
						}
						else
						{
							flag = false;
						}
					}
					else 
					{
						flag = true;
					}
					
				}
				else
				{
					flag = false;
				}
				if(flag) {
					System.out.println(" Total no of days in month : 29");
				}
				else
				{
					System.out.println(" Total no of days in month : 28"
							+ "");
				}
			break;
			
			case 4: 
			case 6:
			case 9: 
			case 11:
				System.out.println("Total no of days in month : 30");
				break;
			default :
				System.out.println("Re-Run the program and Please enter month value between 1 to 12.");
			}
		}
		

	

}
