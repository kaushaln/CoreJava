// Write a program to insert element at specific index.

package corejava.arraydemo;

import java.util.Scanner;

public class InsertElementAtSpecificIndex {
	
	public static Scanner scanner = null;
	
	public static int noArray[] = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arraySize,index,no;
		scanner = new Scanner(System.in);
		System.out.println("Enter the no of Elements you want to read for arrays:");
		arraySize = scanner.nextInt();
		
		if (arraySize == 0) {
			System.out.println("You can't Enter any Element in Array");
		}else {
			noArray = new int[arraySize];
			getArrayElements();
			System.out.println("Enter index at which you want to insert value:");
			index = scanner.nextInt();
			if (index <0 || (index > noArray.length-1)) {
				System.out.println("You entered wrong index number");
			}else {
				System.out.println("Enter the value:");
				no = scanner.nextInt();
				noArray[index] = no;
			}
			System.out.println("Array Elements are as below:");
			displayArrayElements();
		}
		scanner.close();

	}
	
	public static void getArrayElements() {
		for(int cnt=0;cnt<noArray.length;cnt++) {
			System.out.println("Enter the value of Element" +(cnt+1)+":");
			noArray[cnt]=scanner.nextInt();
		}
	}

	public static void displayArrayElements() {
		for(int cnt=0;cnt<noArray.length;cnt++) {
			System.out.println(noArray[cnt]);
		}
	}
}
