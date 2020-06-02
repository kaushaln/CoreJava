// Write a program to check whether two arrays are equal or not.
package corejava.arraydemo;

import java.util.Scanner;

public class CheckTwoMatrixEquality {

	public static Scanner scanner = null;
	
	public static int noArrayA[][] = null;
	
	public static int noArrayB[][] = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aRow,aCol,bRow,bCol;
		scanner = new Scanner(System.in);
		System.out.println(" Enter the row size for Array A:");
		aRow = scanner.nextInt();
		System.out.println(" Enter the col size for Array A:");
		aCol = scanner.nextInt();
		noArrayA= new int[aRow][aCol];
		System.out.println(" Enter the row size for Array B:");
		bRow = scanner.nextInt();
		System.out.println(" Enter the col size for Array B:");
		bCol = scanner.nextInt();
		noArrayB= new int[bRow][bCol];
		getArrayElement('a',aRow,aCol);
		displayArrayElements('a',aRow,aCol);
		getArrayElement('b',bRow,bCol);
		displayArrayElements('b',bRow,bCol);
		checkForEquality(aRow,aCol,bRow,bCol);
		scanner.close();
	}
	
	public static void checkForEquality(int rano,int cano,int rbno,int cbno) {
		boolean flag = false;
		if (rano == rbno && cano == cbno) {
			System.out.println("Array Size of Both Array is same.Checking Further for Element equality");
			for(int cnt=0;cnt<rano;cnt++) {
				for(int ccnt=0;ccnt<cano;ccnt++) {
					if (noArrayA[cnt][ccnt]==noArrayB[cnt][ccnt]) {
						flag = true;
					}else {
						flag = false;
						break;
					}
				}
			}
			if (flag == true) {
				System.out.println("Both Arrays Are same.");
			}else {
				System.out.println("Sorry. Both arrays are not same.");
			}
		}else {
			System.out.println("Array Size of Both Array is not same. So both arrays are not equal.");
		}
	}
	
	public static void getArrayElement(char ch, int rno, int cno) {
		
		if (rno==0 || cno==0) {
			System.out.println(" You can't read Elements for Array "+ ch+". as Either Row count or Col count is zero");
		}
		else {
			for(int cnt=0;cnt<rno;cnt++) {
				for(int ccnt=0;ccnt<cno;ccnt++) {
					System.out.println("Enter the value for Element["+cnt+"]["+ccnt+"]:");
					if(ch == 'a') {
						noArrayA[cnt][ccnt]=scanner.nextInt();
					}else {
						noArrayB[cnt][ccnt]=scanner.nextInt();
					}
				}
			}
		}
	}
	
	public static void displayArrayElements(char ch, int rno, int cno) 
	{
			for(int cnt=0;cnt<rno;cnt++) 
			{
				for(int ccnt=0;ccnt<cno;ccnt++) {
					
					if(ch == 'a') {
						System.out.print(noArrayA[cnt][ccnt]+" ");
					}else {
						System.out.print(noArrayB[cnt][ccnt]+" ");
					}
				}
				System.out.println();
			}
		
	}

}
