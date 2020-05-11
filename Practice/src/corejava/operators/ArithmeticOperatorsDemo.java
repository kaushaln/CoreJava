//Write a program to demonstrate usage of different Arithmetic Operators of core java 
package corejava.operators;

public class ArithmeticOperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no1 = 100;
		int no2 = 50;
		int sum = no1 + no2;
		int sub = no1 - no2;
		int mul = no1 * no2;
		int div = no1 / no2;
		int mod = no1 % no2;
		int temp = ++no1;
		
		System.out.println(" Sum of two number No1 and No2 is : " + sum);
		System.out.println(" Subtraction of two number No1 and No2 is : " + sub);
		System.out.println(" Multiplication of two number No1 and No2 is : " + mul);
		System.out.println(" Division of two number No1 and No2 is : " + div);
		System.out.println(" Modulus of two number No1 and No2 is : " + mod);
		System.out.println(" Autoincrement of No1 is " + temp);
		 temp = --no1;
		System.out.println(" Autoincrement of No1 is " + temp);
		
	}

}
