// Write a Java Program to demonstrate Two dimensional Array implementation.
package corejava.arraydemo;

import java.util.Scanner;

public class TwoDimensionalArrayDemo {
	
	public static Scanner scanner = null;
	
	public static int noArray[][] = null;
	public static final int aCol = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aRow;
		scanner = new Scanner(System.in);
		System.out.println("Enter the value for Row Count of Two dimensional Array:");
		aRow = scanner.nextInt();
		if (aRow == 0 ) {
			System.out.println("You can't Read the Elements for Two dimensional Array as Either RowCount is 0.");
		}else {
			noArray = new int [aRow][aCol];
			getArrayElements();
			System.out.println("Elements of Two dimensional Arrays are as below");
			displayArrayElements();
		}
		scanner.close();
	}
	
	public static void getArrayElements() {
		for (int rcnt=0;rcnt<noArray.length;rcnt++) {
			for(int ccnt=0;ccnt<aCol;ccnt++) {
				System.out.println("Enter the value for Element["+rcnt+"]["+ccnt+"]");
				noArray[rcnt][ccnt]=scanner.nextInt();
			}
		}
	}
	
	public static void displayArrayElements() {
		for (int rcnt=0;rcnt<noArray.length;rcnt++) {
			for(int ccnt=0;ccnt<aCol;ccnt++) {
				System.out.print(noArray[rcnt][ccnt] +" ");
			}
			System.out.println();
		}
	}

}
