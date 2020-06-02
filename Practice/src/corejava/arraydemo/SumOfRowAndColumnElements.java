// Write a program to read array size from User and Also read array Elements if Entered array size is valid.
// Display Sum of row Numbers and sum of column number row wise and column wise.
package corejava.arraydemo;

import java.util.Scanner;

public class SumOfRowAndColumnElements {
	
	public static Scanner scanner = null;
	
	public static int noArrayA[][] = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int aRow,aCol;
		System.out.println("Enter the Row number:");
		aRow = scanner.nextInt();
		System.out.println("Enter the Column number:");
		aCol = scanner.nextInt();
		if (aCol == 0 || aRow == 0) {
			System.out.println("You can't enter the value in Array as Either row size or column size is zero.");
		}else {
			noArrayA = new int [aRow][aCol];
			getArrayElementsA(aRow,aCol);
			displayArrayElementsA(aRow,aCol);
			System.out.println("Sum of Row elements and Sum of Column elements are as below.");
			calculateSum(aRow,aCol);
		}
		scanner.close();
	}

	public static void getArrayElementsA(int rno, int cno) {
		for (int cnt=0;cnt<rno;cnt++) {
			for(int ccnt=0;ccnt<cno;ccnt++) {
				System.out.println("Enter the value for Element["+cnt+"]["+ccnt+"]:");
				noArrayA[cnt][ccnt] = scanner.nextInt();
			}
		}
	}
	public static void displayArrayElementsA(int rno, int cno) {
		
		for (int cnt=0;cnt<rno;cnt++) {
			for(int ccnt=0;ccnt<cno;ccnt++) {
				System.out.print(noArrayA[cnt][ccnt]+" ");
			}
			System.out.println();
		}
	}
	public static void calculateSum(int rno, int cno) {
		int rowsum = 0,colsum=0;
		for (int rcnt=0;rcnt<rno;rcnt++) {
			for(int ccnt=0;ccnt<cno;ccnt++) {
				rowsum = rowsum + noArrayA[rcnt][ccnt];
			}
			System.out.println("Row No " + rcnt + "'s sum is : "+rowsum);
		}
		for (int ccnt=0;ccnt<cno;ccnt++) {
			for(int rcnt=0;rcnt<rno;rcnt++) {
				colsum = colsum + noArrayA[rcnt][ccnt];
			}
			System.out.println("Column No " + ccnt + "'s sum is : "+colsum);
		}
	}
}
