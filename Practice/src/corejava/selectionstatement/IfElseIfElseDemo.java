// Write a program to demonstrate if .. else if ... else statement 
package corejava.selectionstatement;

public class IfElseIfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no1 = 100;
		int no2 = 500;
		int no3 = 3000;
		
		if (no1 > no2 && no1 > no3) {
			System.out.println("No1 is greater than other two numbers");
			
		} else if (no2 > no1 && no2 > no3) {
			System.out.println("No2 is greater than other two numbers");
		}else {
			System.out.println("No3 is greater than other two numbers");
		}

	}

}
