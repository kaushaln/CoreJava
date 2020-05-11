// Write a program to demonstrate usage of Logical operator of core java

package corejava.operators;

public class LogicalOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean temp = true && false;
		System.out.println("Value of Temp variable is "+ temp);
		temp = temp || true;
		System.out.println("Value of Temp variable is "+ temp);
		temp = !temp;
		System.out.println("Value of Temp variable is "+ temp);
	}

}
