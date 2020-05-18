// Write a program to read numbers from user and display average of those numbers
package corejava.iterativestatements;

import java.util.Scanner;

public class FindAverageofGivenNo {
	
	public static Scanner s1 = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s1 = new Scanner(System.in);
		int no,cnt;
		int sum=0,rno,avg;
		System.out.println("How many numbers do you want to enter to find average? : ");
		no = s1.nextInt();
		for (cnt=1;cnt<=no;cnt++) {
			System.out.println("Enter number"+cnt);
			rno= s1.nextInt();
			sum = sum + rno;
		}
		avg = sum /no;
		System.out.println("Average of received number is :"+ avg);
		s1.close();
	}

}
