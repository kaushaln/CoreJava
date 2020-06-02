// Write a program to find Common elements from two integer one dimensional arrays
package corejava.arraydemo;

import java.util.Scanner;

public class FindCommonElementsOfIntArray {
	
	public static Scanner scanner = null;
	
	public static int arrayA[] = null;
	public static int arrayB[] = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
			int aRow,bRow;
			System.out.println("Enter the row count for Array A:");
			aRow = scanner.nextInt();
			System.out.println("Enter the row count for Array B:");
			bRow = scanner.nextInt();
			if(aRow == 0 || bRow ==0) {
				System.out.println("You Can't read any element for Either Array A or Array B as row count is zero.");
				System.out.println("So you can't find common elements from two arrays");
			}else {
				arrayA = new int [aRow];
				arrayB = new int [bRow];
				getArrayElements('a',aRow);
				System.out.println("Elements of Array A are as below : ");
				displayArrayElements('a',aRow);
				getArrayElements('b',bRow);
				System.out.println("Elements of Array B are as below : ");
				displayArrayElements('b',bRow);
				FindCommonElementsOfIntArrays(aRow,bRow);
			}
		scanner.close();
	}
	
	public static void FindCommonElementsOfIntArrays(int arno,int brno) {
		int searchno=0;
		String commonElements = "";
		if (arno > brno) {
			for (int bcnt=0;bcnt<brno;bcnt++) {
				searchno=arrayB[bcnt];
				for(int acnt=0;acnt<arno;acnt++) {
					if (arrayA[acnt]==searchno) {
						if (commonElements.equalsIgnoreCase("")) {
							commonElements = commonElements +searchno;
						}else
						{
							commonElements = commonElements +"," +searchno; 
						}
					}
				}
			}
		}else 
		{
			for (int acnt=0;acnt<arno;acnt++) {
				searchno=arrayA[acnt];
				for(int bcnt=0;bcnt<brno;bcnt++) {
					if (arrayB[bcnt]==searchno) {
						if (commonElements.equalsIgnoreCase("")) {
							commonElements = commonElements +searchno;
						}else
						{
							commonElements = commonElements +"," +searchno; 
						}
					}
				}
			}
		}
		System.out.println("Common Elements from Two arrays are " + commonElements+".");
	}
	
	public static void getArrayElements(char ch, int rno) {
		for (int cnt=0;cnt<rno;cnt++) {
			System.out.println("Enter the value for Array "+ch+"["+cnt+"]:");
			if(ch == 'a') 
			{
				arrayA[cnt]=scanner.nextInt();
			}else {
				arrayB[cnt]=scanner.nextInt();
			}
		}
	}

	public static void displayArrayElements(char ch, int rno) {
		for (int cnt=0;cnt<rno;cnt++) {
			if(ch == 'a') 
			{
				System.out.println(arrayA[cnt]);
			}else {
				System.out.println(arrayB[cnt]);
			}
		}
	}

}
