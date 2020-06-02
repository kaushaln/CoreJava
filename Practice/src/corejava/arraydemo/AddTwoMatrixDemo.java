//Write a Program to read size of two matrix and add two matrix. Display the result.

package corejava.arraydemo;

import java.util.Scanner;

public class AddTwoMatrixDemo {

	public static Scanner scanner = null;
	
	public static int noArrayA[][] = null;
	
	public static int noArrayB[][] = null;
	
	public static int sumArray[][] = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aRow,bRow,aCol,bCol;
		scanner = new Scanner(System.in);
		System.out.println("Enter the Row value for Array A:");
		aRow = scanner.nextInt();
		System.out.println("Enter the Column value for Array A:");
		aCol = scanner.nextInt();
		System.out.println("Enter the Row value for Array B:");
		bRow = scanner.nextInt();
		System.out.println("Enter the Column value for Array B:");
		bCol = scanner.nextInt();
		if ( aRow == 0 || aCol == 0) {
			System.out.println("You can't read elements for the Array A");
		}else {
			noArrayA = new int [aRow][aCol];
			getArrayElement('a',aRow,aCol);
		}
		if ( bRow == 0 || bCol == 0) {
			System.out.println("You can't read elements for the Array B");
		}else {
			noArrayB = new int [bRow][bCol];
			getArrayElement('b',bRow,bCol);
		}
		System.out.println("Array A Elements:");
		displayArrayElement('a',aRow,aCol);
		System.out.println("Array B Elements:");
		displayArrayElement('b',bRow,bCol);
		int returnValue = SumationOfMatrix(aRow,aCol,bRow,bCol);
		if (returnValue == 1) {
			System.out.println("Sum Array  Elements:");
			displayArrayElement('s',bRow,bCol);
		}
		scanner.close();
	}
	
	public static void getArrayElement(char ch,int row,int col) {
			for(int rcnt=0;rcnt<row;rcnt++) {
				for(int ccnt=0;ccnt<col;ccnt++) {
					System.out.println("Enter the Element for Array "+ ch +" at Position["+rcnt+"]["+ccnt+"]");
					if (ch == 'a') {
						noArrayA[rcnt][ccnt]=scanner.nextInt();
					}
					else {
						noArrayB[rcnt][ccnt]=scanner.nextInt();
					}
				}
			}
	}
	public static void displayArrayElement(char ch,int row,int col) {
		for(int rcnt=0;rcnt<row;rcnt++) {
			for(int ccnt=0;ccnt<col;ccnt++) {
				if (ch == 'a') {
					System.out.print(noArrayA[rcnt][ccnt]+" ");
				}
				else if (ch == 'b') {
					System.out.print(noArrayB[rcnt][ccnt]+" ");
				}else {
					System.out.print(sumArray[rcnt][ccnt]+" ");
				}
			}
			System.out.println();
		}
	}
	
	public static int SumationOfMatrix(int arow,int acol,int brow,int bcol) {
		
		if(arow ==brow && acol==bcol) {
			sumArray = new int[arow][acol];
			for (int rcnt=0;rcnt<arow ;rcnt++) {
				for(int ccnt=0;ccnt<acol;ccnt++) {
					sumArray[rcnt][ccnt] = noArrayA[rcnt][ccnt] + noArrayB[rcnt][ccnt];
				}
			}
			
		}else
		{
			System.out.println("Summation of Two matrix is not calculated as row and column count are different for both matrix");
			return -1;
			
		}
		return 1;
	}


}
