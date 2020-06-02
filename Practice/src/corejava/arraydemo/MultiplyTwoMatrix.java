// Write a java program to multiply two matrix
package corejava.arraydemo;

import java.util.Scanner;

public class MultiplyTwoMatrix {
	
	public static Scanner scanner = null;
	public static int noArrayA[][] = null;
	public static int noArrayB[][] = null;
	public static int mulArray[][] = null;
	public static int aCol,aRow,bCol,bRow;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		System.out.println("Enter the Row Count for array A:");
		aRow = scanner.nextInt();
		System.out.println("Enter the Column count for Array A:");
		aCol = scanner.nextInt();
		if(aRow == 0 || aCol == 0) {
			System.out.println("You Can't enter the value in Array A");
		}else {
			noArrayA = new int[aRow][aCol];
			getArrayElements('a',aRow,aCol);
			displayArrayElements('a',aRow,aCol);
		}
		System.out.println("Enter the Row Count for Array B:");
		bRow = scanner.nextInt();
		System.out.println("Enter the Column count for Array B:");
		bCol = scanner.nextInt();
		if (bRow == 0 || bCol == 0 ) {
			System.out.println("You can't enter the value in Array B");
		}else {
			noArrayB = new int[bRow][bCol];
			getArrayElements('b',bRow,bCol);
			displayArrayElements('b',aRow,aCol);
		}
		if (aRow == bRow && aCol == bCol && aRow!=0 && aCol!=0) {
			System.out.println("Multiplying Array Elements of two Arrays");
			mulArray = new int [aRow][aCol];
			calMulOfTwoArray(aRow,aCol);
			displayArrayElements('d',aRow,aCol);
		}else {
			if (aRow == 0 || aCol == 0 || bRow == 0 || bCol ==0) {
				System.out.println("You can Perform Multiplication Operation of Array as One of the Array(s) or Both Arrays doesn't have any Elements");
			}else {
				System.out.println("You can't Perform multiplication Operation between Two Array as they are having different sizes.");
			}
			
		}
		scanner.close();

	}
	
	public static void getArrayElements(char ch,int Row,int Col) {
		System.out.println("inside Get Array Element Function");
		for(int rcnt =0;rcnt<Row;rcnt++) {
			for(int ccnt=0;ccnt<Col;ccnt++) {
				if (ch == 'a') {
					System.out.println("Array A: Enter the value for Element["+rcnt+"]["+ccnt+"]:");
					noArrayA[rcnt][ccnt]= scanner.nextInt();
				}
				else
				{
					System.out.println("Array B: Enter the value for Element["+rcnt+"]["+ccnt+"]:");
					noArrayB[rcnt][ccnt]= scanner.nextInt();
				}
			}
		}
		
	}
	
	public static void displayArrayElements(char ch,int Row,int Col) {
		for(int rcnt =0;rcnt<Row;rcnt++) {
			for(int ccnt=0;ccnt<Col;ccnt++) {
				if (ch == 'a') {
					System.out.print(noArrayA[rcnt][ccnt]+" ");
				}
				else if ( ch == 'b')
				{
					System.out.print(noArrayB[rcnt][ccnt]+" ");
				}else {
					System.out.print(mulArray[rcnt][ccnt]+" ");
				}
			}
			System.out.println();
		}
	}
	

	public static void calMulOfTwoArray(int Row,int Col) {
		for(int rcnt =0;rcnt<Row;rcnt++) {
			for(int ccnt=0;ccnt<Col;ccnt++) {
				mulArray[rcnt][ccnt] = noArrayA[rcnt][ccnt] * noArrayB[rcnt][ccnt];
			}
		}
	}

}
