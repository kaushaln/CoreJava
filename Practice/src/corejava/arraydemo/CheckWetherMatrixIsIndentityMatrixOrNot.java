// Write a program to read the X x X matrix and check whether it is identity matrix or not.
package corejava.arraydemo;

import java.util.Scanner;

public class CheckWetherMatrixIsIndentityMatrixOrNot {
	
	public static Scanner scanner = null;
	public static int noArray[][] = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aRow,aCol;
		scanner = new Scanner(System.in);
		System.out.println("Enter the row count for Array:");
		aRow = scanner.nextInt();
		System.out.println("Enter the column count for Array:");
		aCol = scanner.nextInt();
		scanner.nextLine();
		if (aCol == 0 || aRow == 0) {
			System.out.println("You can't read element for matrix as either row count or column count.");
		}else if ( aCol != aRow) {
			System.out.println(" You can get data for Matrix but you can't check whether it is identity matrix or not as Row count and column count is not same");
		}else {
			noArray = new int [aRow][aCol];
			getArrayElements(aRow,aCol);
			displayArrayElements(aRow,aCol);
			checkForIdentityMatrix(aRow,aCol);
		}
		scanner.close();
	}
	
	public static void checkForIdentityMatrix(int rno,int cno) {
		boolean flag = false;
		int occurance=0;
		for(int cnt=0;cnt<rno;cnt++) {
			for(int ccnt=0;ccnt<cno;ccnt++) {
				if (cnt == ccnt) {
					if (noArray[cnt][ccnt]==1) {
						flag = true;
						occurance++;
					}else {
						flag = false;
					}
				
				}else {
					continue;
				}
			}
		}
		if(flag == true && occurance == rno) {
			System.out.println("Matrix is identity Matrix");
		}else {
			System.out.println("Matrix is not identity Matrix");
		}
	}
	public static void getArrayElements(int rno,int colno) {
		for(int cnt=0;cnt<rno;cnt++) {
			for(int ccnt=0;ccnt<colno;ccnt++) {
				System.out.println("Enter the value for Element["+cnt+"]["+ccnt+"]:");
				noArray[cnt][ccnt] = scanner.nextInt();
			}
		}
	}
	
	public static void displayArrayElements(int rno,int colno) {
		for(int cnt=0;cnt<rno;cnt++) {
			for(int ccnt=0;ccnt<colno;ccnt++) {
				System.out.print(noArray[cnt][ccnt]+" ");
			}
			System.out.println();
		}
	}
}
