// Write a program to print multiplication table of entered number
package corejava.iterativestatements;

import java.util.Scanner;

public class PrintMultiplicationTableForGivenNo {

	public static Scanner s1 = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no,cnt,mul=1;
		s1 = new Scanner(System.in);
		System.out.println("Enter number:");
		no=s1.nextInt();
		
		System.out.println(" Multiplication table of no:"+ no + "  is as below.");
		for (cnt=1;cnt<=10;cnt++) {
			mul = cnt * no;
			System.out.println(no +" * "+cnt + " = " + mul );
		}

	}

}
