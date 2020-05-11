//Write a program to demonstrator ternary operator usage of core java

package corejava.operators;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1 = 10;
		int no2 = 5;
		
		boolean result = (no1>no2)? true: false;
		System.out.println(" No1 is greater than no2 statement is "+ result);
		no2 = 50;
		System.out.println(" New Value of No2 is" + no2);
		result = (no1>no2)? true: false;
		System.out.println(" No1 is greater than no2 statement is "+ result);
	}

}
