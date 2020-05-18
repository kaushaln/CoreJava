//Write a program to read username from user and display welcome message 

package corejava.simple;

import java.util.Scanner;

public class DisplayUserNameAlongwithHelloMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the User name :");
		String username = s1.nextLine();
		
		System.out.println( "Welcome to Java Programming World, " + username);
		s1.close();
		

	}

}
