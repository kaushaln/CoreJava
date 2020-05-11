// Write a program to demonstrate if else statement 
package corejava.selectionstatement;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no1 = 100;
		int no2 = 50;
		System.out.println("No1 = "+no1);
		System.out.println("No2 = "+no2);
		System.out.println("=================");
		if(no1 > no2) {
			System.out.println(" No1 is greater than no2");
		}else {
			System.out.println("No1 is not greater than no2");
		}
		System.out.println("=================");
		no2 = 150;
		System.out.println("No1 = "+no1);
		System.out.println("No2 = "+no2);
		System.out.println("=================");
		if(no1 > no2) {
			System.out.println(" No1 is greater than no2");
		}else {
			System.out.println("No1 is not greater than no2");
		}

	}

}
