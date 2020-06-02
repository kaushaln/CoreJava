// Write a program to read array size and array elements from user. Copy Array elements from one array to another using inbuilt function

package corejava.arraydemo;

import java.util.Scanner;

public class CopyArrayUsingFunction {

	public static Scanner scanner = null;
	public static int noArray[] = null;
	public static int copiedArray[] = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int arraySize;
		System.out.println("How many number of elements you want to read for Array?");
		arraySize = scanner.nextInt();
		noArray = new int[arraySize];
		copiedArray = new int[arraySize];
		getArrayElements();
		System.out.println("Base Array elements are as below");
		dispayArrayElements(noArray);
		System.arraycopy(noArray, 0, copiedArray, 0, arraySize);
		System.out.println("Content of Copied Array");
		dispayArrayElements(copiedArray);
		scanner.close();
	}
	
	public static void getArrayElements() {
		
		for (int cnt=0;cnt<noArray.length;cnt++) {
			System.out.println("Enter the array element" +(cnt+1)+ ":");
			noArray[cnt]=scanner.nextInt();
		}
		
	}
	
	public static void dispayArrayElements(int array[]) {
		for(int cnt=0;cnt<array.length;cnt++) {
			System.out.println(array[cnt]);
		}
	}

}
