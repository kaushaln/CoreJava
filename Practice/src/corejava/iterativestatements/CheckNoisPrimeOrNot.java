// Write a program to check that whether number is prime number or not.
package corejava.iterativestatements;

import java.util.Scanner;

public class CheckNoisPrimeOrNot {
	
	public static Scanner s1 = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s1 = new Scanner(System.in);
		int no,factors=0;
		System.out.println("Enter the number :");
		no = s1.nextInt();
		if(no > 0 && no !=0) {
			for (int cnt =1;cnt<=no;cnt++) {
				if(no % cnt == 0) {
					factors = factors+ 1;
				}
			}
			if (factors <= 2) {
				System.out.println(no + " is a prime number");
			}else {
				System.out.println(no +"  is not a prime number");
			}
			
		}else {
			System.out.println("Please enter value greater than zero.");
		}
	}

}
