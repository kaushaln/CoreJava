//Write a program which takes number from user and display sum of all numbers
package corejava.iterativestatements;

import java.util.Scanner;

public class SumOfNumbers {

	
	public static Scanner s1 = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s1 = new Scanner(System.in);
		int no,counter,temp,sum=0;
		System.out.println("How many numbers you want to enter :");
		no = s1.nextInt();
		for(counter =1;counter<=no;counter++) {
			System.out.println("Enter number"+counter+":");
			temp = s1.nextInt();
			sum = sum + temp;
		}
		System.out.println("Sum of Entered number is :" + sum);
		s1.close();
	}

}
