// Write a java program to check whether matrix is sparse matrix or not.
package corejava.arraydemo;

import java.util.Scanner;

public class CheckWetherMatrixIsSparseOrNot {

	public static Scanner scanner = null;
	public static int noArray[][] = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int Rowcnt,Colcnt;
		System.out.println("Enter the row no for Array :");
		Rowcnt = scanner.nextInt();
		System.out.println("Enter the column no for Array:");
		Colcnt = scanner.nextInt();
		scanner.nextLine();
		if (Rowcnt==0 || Colcnt==0) {
			System.out.println("You can't enter the value of Element as Either Row Count or Column Count is zero.");
		}else {
			noArray = new int [Rowcnt][Colcnt];
			getArrayElements(Rowcnt,Colcnt);
			displayArrayElements(Rowcnt,Colcnt);
			CheckforSparseMatrix(Rowcnt,Colcnt);
		} 
		scanner.close();
	}
	
	public static void getArrayElements(int rno,int cno) {
		for(int cnt=0;cnt<rno;cnt++) {
			for(int ccnt=0;ccnt<cno;ccnt++) {
				System.out.println("Enter the value for Element["+cnt+"]["+ccnt+"]:");
				noArray[cnt][ccnt]=scanner.nextInt();
			}
		}
	}
	
	public static void displayArrayElements(int rno,int cno) {
		for(int cnt=0;cnt<rno;cnt++) {
			for(int ccnt=0;ccnt<cno;ccnt++) {
				System.out.print(noArray[cnt][ccnt]+" ");
			}
			System.out.println();
		}
	}

	public static void CheckforSparseMatrix(int rno,int cno) {
		int totalElement = 0;
		int zeroCount =0;
		for (int cnt=0;cnt<rno;cnt++) {
			for(int ccnt=0;ccnt<cno;ccnt++) {
				if (noArray[cnt][ccnt]==0) {
					zeroCount++;
				}
				totalElement++;
			}
		}
		if ((zeroCount/(double)totalElement)  > 0.5) {
			
			System.out.println("Matrix is Sparse Matrix");
		}else {
			System.out.println("Matrix is not Sparse Matrix");
		}
	}

}
