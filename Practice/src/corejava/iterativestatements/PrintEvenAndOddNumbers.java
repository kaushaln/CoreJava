// Write a program to read number from user and print even and odd numbers separately on console. 
package corejava.iterativestatements;

import java.util.Scanner;

public class PrintEvenAndOddNumbers {

	
	public static Scanner s1 = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s1 = new Scanner(System.in);
		int rno,cnt,temp;
		String OddString="",EvenString="";
		System.out.println("Enter the number of how many numbers you want to read from users :");
		rno=s1.nextInt();
		for(cnt=1;cnt<=rno;cnt++)
		{
			System.out.println("Enter number"+cnt);
			temp = s1.nextInt();
			if (temp%2==0) {
				EvenString = EvenString + temp +",";
			}else
			{
				OddString = OddString + temp +","; 
			}
		}
		System.out.println(" Even no list is " + EvenString);
		System.out.println(" Odd no list is " + OddString);
		s1.close();
	}

}
