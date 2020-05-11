// Write a program to demonstrate usage of relational operator of core java
package corejava.operators;

public class RelationalOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1 = 20;
		int no2 = 15;
		
		System.out.println("Value of No1 is " + no1);
		System.out.println("Value of No2 is " + no2);
		System.out.println("==========================");
		boolean result = (no1==no2);
		System.out.println("No1 and No2 both are equal : " + result);
		result = (no1!=no2);
		System.out.println("No1 and No2 both are not equal : "+ result);
		result = (no1>no2);
		System.out.println("No1 is greater than no2 : " + result);
		result = (no1<no2);
		System.out.println("No1 is less than no2 : " + result);
		no2 = 20;
		System.out.println("==========================");
		System.out.println("Value of No1 is " + no1);
		System.out.println("Value of No2 is " + no2);
		System.out.println("==========================");
		result = (no1>=no2);
		System.out.println("No1 is greater than or equal to no2 :" + result);
		no2 = 5;
		System.out.println("==========================");
		System.out.println("Value of No1 is " + no1);
		System.out.println("Value of No2 is " + no2);
		System.out.println("==========================");
		result = (no1<=no2);
		System.out.println("No1 is greater than or equal to no2 :" + result);
	}

}
