// Class Demo with class method and instance variable.
package corejava.classopsdemo;

import java.util.Scanner;

public class ClassDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number1");
		Demo.no1= scanner.nextInt();
		System.out.println("Enter the number2");
		Demo.no2= scanner.nextInt();
		sum = Demo.sum();
		System.out.println("Value of Sum is : " + sum);
		scanner.close();
	}

}

class Demo{
	
	static int no1;
	static int no2;
	
	public static int sum() {
		return no1+no2;
	}
	
}