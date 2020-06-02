// Write a java program to read the elements of Three 3 x 3 array and display all elements.
package corejava.arraydemo;

import java.util.Scanner;

public class Array3x3Demo {

	public static Scanner scanner = null;
	public static int noArray[][] = null;
	
	public static final int aRow = 3,aCol=3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		noArray = new int [aRow][aCol];
		getArrayElements();
		displayArrayElements();

	}
	
	public static void getArrayElements() {
		for(int rcnt =0;rcnt<aRow;rcnt++) {
			for(int ccnt=0;ccnt<aCol;ccnt++) {
				System.out.println("Enter the value for Elements["+rcnt+"]["+ccnt+"]:");
				noArray[rcnt][ccnt]=scanner.nextInt();
			}
		}
	}
	
	public static void displayArrayElements() {
		for(int rcnt =0;rcnt<aRow;rcnt++) {
			for(int ccnt=0;ccnt<aCol;ccnt++) {
				System.out.print(noArray[rcnt][ccnt]+" ");
			}
			System.out.println();
		}
	}

}
