// Write a program to check whether number is Armstrong or not
package corejava.iterativestatements;

import java.util.Scanner;

public class CheckNoForArmStrongOrNot {

	public static Scanner s1 = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s1 = new Scanner(System.in);
		int no,vno,sum=0,mod,cube;
		System.out.println("Enter the number :");
		no = s1.nextInt();
		vno = no;
		while (vno!=0) {
			mod = vno%10;
			cube = (int) Math.pow(mod, 3);
			sum = sum+cube;
			vno = vno/10;
		}
		if(no == sum) {
			System.out.println(no + " is an Armstrong number");
		}else {
			System.out.println(no + " is not an ArmStrong number.");
		}
		s1.close();
	}

}
