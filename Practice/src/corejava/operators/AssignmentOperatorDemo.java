//Write a program to demonstrate usage of Assignment operator of core java
package corejava.operators;

public class AssignmentOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1 = 49;
		int no2 = 32;
		
		System.out.println("Value of No1 is : " + no1);
		System.out.println("Value of No2 is : " + no2);
		System.out.println("=============================");
		int result = no1 + no2;
		System.out.println("Result of No1 + no2 is :" + result);
		
		int temp = 0;
		 temp += 10;
		 System.out.println("After adding 10  to Temp ,Result is :" + temp);
		 
		 temp -= 5;
		 System.out.println("After subtracting 5 from temp, Result is :" + temp);
		 
		 temp *=5;
		 System.out.println("After multiplying 5 with temp, Result is :" + temp);
		 
		 temp /=3;
		 System.out.println("After dividing temp with 3, Result is :" + temp);
		 
		 temp%=5;
		 System.out.println("taking Moduling  of temp by dividing it using 5, Result is :" + temp);
		

	}

}
