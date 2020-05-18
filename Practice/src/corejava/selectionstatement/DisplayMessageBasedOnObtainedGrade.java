// Write a program to show message appropriate to Grade obtained by student.
package corejava.selectionstatement;

import java.util.Scanner;

public class DisplayMessageBasedOnObtainedGrade {

	public static Scanner s1 = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s1 = new Scanner(System.in);
		char gradech;
		System.out.println("Enter Obtained Grade by Student :");
		gradech = s1.next().charAt(0);
		switch(gradech) {
		
			
		case 'A':
		case 'a':
			System.out.println("Good Hard word you did. So you have achieved A grade");
		break;	
		
		case 'B':
		case 'b':
			System.out.println("You worked hard and achieved B grade. You Need to do slighly more hard work to achieve A grade");
		break;
		
		case 'C':
		case 'c':
			System.out.println("You need to work harder to achieve higher grades");
		break;
		
		case 'D':
		case 'd':
			System.out.println(" You must work hard to achieve higher grades else you will be failed");
		break;	
		
		default:
			System.out.println("Please Re-Run the program and enter any garde from A,B,C,D.");
		break;	
		}
	}

}
