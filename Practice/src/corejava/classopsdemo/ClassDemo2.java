// Class Demo with static method called from other class.

package corejava.classopsdemo;

import java.util.Scanner;

public class ClassDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1,no2,sum =0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number1:");
		no1 = scanner.nextInt();
		System.out.println("Enter the number2:");
		no2 = scanner.nextInt();
		sum = Demo2.sum(no1, no2);
		System.out.println("Sum="+ sum);
		scanner.close();
		
		

	}

}

class Demo2{
	
	public static int sum(int no1,int no2) {
		return no1 + no2;
	}
}
