// Write a program to demonstrate return statement as transfer flow statement
package corejava.transferstatement;

import java.util.Scanner;

public class ReturnAsTransferStatement {

	public static Scanner s1 = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1,no2,sum=0;
		s1 = new Scanner(System.in);
		System.out.println("Enter the number1:");
		no1 = s1.nextInt();
		System.out.println("Enter the number1:");
		no2 = s1.nextInt();
		sum = calculate(no1,no2);
		System.out.println(" Sum is : "+ sum);
		
	}
	
	public static int calculate(int no1,int no2) {
		return no1+no2;
	}

}
