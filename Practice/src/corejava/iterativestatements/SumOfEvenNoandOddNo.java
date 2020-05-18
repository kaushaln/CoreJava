// Write a program to read the numbers and calculate sum of even number and sum of odd numbers
package corejava.iterativestatements;

import java.util.Scanner;

public class SumOfEvenNoandOddNo {

	public static Scanner s1 = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s1 = new Scanner(System.in);
		int no,cnt,temp;
		int sumofOdd=0,sumofEven=0;
		System.out.println("How many numbers you want to enter :");
		no = s1.nextInt();
		
		for(cnt=1;cnt<=no;cnt++) {
			System.out.println("Enter number"+cnt+":");
			temp = s1.nextInt();
			if (temp%2==0) {
				sumofEven= sumofEven + temp;
			}else
			{
				sumofOdd = sumofOdd + temp;
			}
		}
		s1.close();
		System.out.println("Sum of Odd numbers : "+ sumofOdd);
		System.out.println("Sum of Even numbers: "+ sumofEven);
		
		
	}

}
