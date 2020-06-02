// Write a program to read elements of Array and Copy element by element of one Array to Another array
package corejava.arraydemo;

import java.util.Scanner;

public class CopyArrayElementsFromOnetoAnotherArray {

	public static Scanner scanner = null;
	public static int noArray[] = null;
	public static int copiedNoArray[] = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int arraySize;
		System.out.println("How many elements you want to Enter into Array:");
		arraySize = scanner.nextInt();
		noArray = new int[arraySize];
		copiedNoArray = new int[arraySize];
		getArrayElements();
		copyArrayElements();
		System.out.println("Array Elements of No Array is as below");
		displayArrayElements(noArray);
		System.out.println("Array Elements of Copied Array is as below");
		displayArrayElements(copiedNoArray);
		scanner.close();

	}
	
	public static void getArrayElements() {
	
		for(int cnt=0;cnt<noArray.length;cnt++) {
			System.out.println("Enter the Array Element on noArray[" + (cnt+1) + "]");
			noArray[cnt]=scanner.nextInt();
		}
	}
	
	public static void copyArrayElements() {
		
		for(int cnt=0;cnt<noArray.length;cnt++) {
			copiedNoArray[cnt]=	noArray[cnt];
		}
	}
	
	public static void displayArrayElements(int a[]) {
		
		for(int cnt=0;cnt<a.length;cnt++) {
			System.out.println(a[cnt]);
		}
	}
	
}
