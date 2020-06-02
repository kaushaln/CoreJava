// Write a program to read elements for 3x3 array and find even no frequency and odd number frequency in it
package corejava.arraydemo;

import java.util.Scanner;

public class FindEvenOddNoFrequencyInMatrix {
	
	public static Scanner scanner = null;
	public static int noArray[][] = null;
	public static int oddCnt = 0;
	public static int evenCnt = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aRow,aCol;
		scanner = new Scanner(System.in);
		System.out.println("Enter the Row count for Array:");
		aRow = scanner.nextInt();
		System.out.println("Enter the Column count for Array:");
		aCol = scanner.nextInt();
		if(aRow == 0 || aCol == 0) {
			System.out.println("You can't enter elements in array as Either Rowcount or Column count is 0.");
		}else {
			noArray = new int [aRow][aCol];
			getArrayElements(aRow,aCol);
			System.out.println("Displaying Array Elements.");
			displayArrayElements(aRow,aCol);
			System.out.println("Odd Value Count in Array is "+oddCnt);
			System.out.println("Even Value Count in Array is "+evenCnt);
		}
		scanner.close();
	}
	
	public static void getArrayElements(int rc,int cc) {
		for(int rcnt =0;rcnt<rc;rcnt++) {
			for(int ccnt=0;ccnt<cc;ccnt++) {
				System.out.println("Enter the value for Element["+rcnt+"]["+ccnt+"]:");
				noArray[rcnt][ccnt] = scanner.nextInt();
			}
		}
	}
	
	public static void displayArrayElements(int rc,int cc) {
		for(int rcnt =0;rcnt<rc;rcnt++) {
			for(int ccnt=0;ccnt<cc;ccnt++) {
				if(noArray[rcnt][ccnt]%2==0) {
					evenCnt++;
				}else {
					oddCnt++;
				}
				System.out.print(noArray[rcnt][ccnt]+" ");
			}
			System.out.println();
		}
	}
}
