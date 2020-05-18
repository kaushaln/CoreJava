// Write a program to read no of lines of for printing "****************" characters from users 
package corejava.iterativestatements;

import java.util.Scanner;

public class PrintPatternDemo2 {

	public static Scanner scanner = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		System.out.println("Enter the number of lines to print  '****************' characters  in console");
		int no = scanner.nextInt();
		int counter =1;
		while(counter<=no) {
			System.out.println("****************");
			counter++;
		}
		scanner.close();
	}

}
