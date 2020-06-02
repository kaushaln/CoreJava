//Write a program to read the array elements and print them in reverse order.

package corejava.arraydemo;

import java.util.Scanner;

public class PrintArrayElementsInReverseOrder {
	
	public static Scanner scanner = null;
	public static int noArray[] = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arraySize;
		scanner = new Scanner(System.in);
		System.out.println("How many elements do you want to enter in Array?");
		arraySize = scanner.nextInt();
		noArray = new int[arraySize];
		getArrayElement();
		System.out.println("Array Elements are as follow:");
		System.out.println("=============================");
		displayArrayElements();
		System.out.println("Array Elements in Reverse order are as follow:");
		System.out.println("==============================================");
		displayArrayElementsInReverse();
		scanner.close();

	}
	
	public static void getArrayElement() {
		
		for(int cnt=0;cnt<noArray.length;cnt++) {
			System.out.println("Enter the value for Element " + (cnt+1) +":");
			noArray[cnt]=scanner.nextInt();
		}
	}
	
	public static void displayArrayElements() {
		
		for(int cnt=0;cnt<noArray.length;cnt++) {
			System.out.println(noArray[cnt]);
		}
	}
	
public static void displayArrayElementsInReverse() {
		
		for(int cnt=(noArray.length-1);cnt>=0;cnt--) {
			System.out.println(noArray[cnt]);
		}
	}

}
