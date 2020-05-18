// Write a program to print fibonacci series till given number 
package corejava.iterativestatements;

import java.util.Scanner;

public class PrintFibonacciSeriesTillGivenNo {

	public static Scanner s1 = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no,sum=0;
		int cno=1,pno=0;
		s1 = new Scanner(System.in);
		System.out.println("Enter the number till which You want to print Fibonacci series :");
		no = s1.nextInt();
		System.out.println("Fibonacci series is as below : ");
		System.out.println(pno);
		System.out.println(cno);
		while(sum < no) {
			sum = pno + cno;
			System.out.println(sum);
			pno = cno;
			cno = sum;
		}
	}

}
