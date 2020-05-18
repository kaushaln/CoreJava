// Write a program that performs addition operation for two numbers.
// Also make sure function returns sum of two numbers
package corejava.functions;

import java.util.Scanner;

public class SumOfTwoNumbersUsingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1,no2,sum=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value for number1:");
		no1 = scanner.nextInt();
		System.out.println("Enter the value for number2:");
		no2 = scanner.nextInt();
		sum= addition(no1,no2);
		System.out.println("Sum ="+sum);
		scanner.close();
	}

		public static int addition(int n1,int n2) {
			return n1 + n2;
		}
}
