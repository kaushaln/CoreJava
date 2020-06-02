// Write a java program to transpose a elements of Array.
package corejava.arraydemo;

import java.util.Scanner;

public class TransposeMatrix {
	
	public static Scanner scanner = null;
	public static int noArray[][] = null;
	public static int transposeMatrix[][] = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int rowCount=0;
		int colCount=0;
		System.out.println("Enter the value for Row of Two dimentional Array: ");
		rowCount = scanner.nextInt();
		System.out.println("Enter the value for Column of Two dimentional Array:");
		colCount = scanner.nextInt();
		noArray = new int [rowCount][colCount];
		if (rowCount==0 || colCount==0) {
			System.out.println("You can't enter the data for the array as Either rowSize or Col Size is zero.");
		}else if (rowCount==1 && colCount ==1) {
			getArrayData(rowCount,colCount);
			DisplayArrayData('o',rowCount,colCount);
			System.out.println("Transpose Matrix is as below :");
			DisplayArrayData('o',rowCount,colCount);
		}
		else {
			getArrayData(rowCount,colCount);
			DisplayArrayData('o',rowCount,colCount);
			transposeMatrix = new int [colCount][rowCount];
			transposeMatrix(rowCount,colCount,colCount,rowCount);
			System.out.println("Transpose Matrix is as below:");
			DisplayArrayData('t',colCount , rowCount);
		}
		scanner.close();
	}

	public static void getArrayData(int rno, int cno) {
		for(int cnt=0;cnt<rno;cnt++) {
			for(int ccnt=0;ccnt<cno;ccnt++) {
				System.out.println("Enter the value for Element["+cnt+"]["+ccnt+"]:");
				noArray[cnt][ccnt] = scanner.nextInt();
			}
		}
	}
	
	public static void DisplayArrayData(char ch,int rno, int cno) {
		for(int cnt=0;cnt<rno;cnt++) {
			for(int ccnt=0;ccnt<cno;ccnt++) {
				if (ch == 'o') {
					System.out.print(noArray[cnt][ccnt]+" ");
				}else {
					System.out.print(transposeMatrix[cnt][ccnt]+" ");
				}
				 
			}
			System.out.println();
		}
	}
	
	public static void transposeMatrix(int rno,int cno,int trno,int tcno) {
		for(int cnt=0;cnt<rno;cnt++) {
			for (int ccnt=0;ccnt<cno;ccnt++) {
				transposeMatrix[ccnt][cnt]=noArray[cnt][ccnt];
			}
		}
	}
}
