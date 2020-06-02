package corejava.arraydemo;

import java.util.Scanner;

public class Find3rdLargestElementInArray {

	public static Scanner scanner = null;
	
	public static int noArray[] = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arraySize;
		scanner = new Scanner(System.in);
		System.out.println("Enter the no of Elements you want to read for Array:");
		arraySize = scanner.nextInt();
		if(arraySize == 0) {
			System.out.println("You can't read Array Element as you entered Array size as 0");
		}else if (arraySize <= 2) {
			System.out.println("You can't find 3rd Largest element as Array Size is 2.");
		}
		else {
			noArray = new int[arraySize];
			getArrayElements();
			displayArrayElements();
			sortArrayElementsAsc();
			System.out.println("After sorting, array elements are as below.");
			displayArrayElements();
			System.out.println("3rd Largest element of Array is "+ noArray[noArray.length-3]);
		}
		scanner.close();
	}
	
	public static void getArrayElements() {
		for(int cnt=0;cnt<noArray.length;cnt++) {
			System.out.println("Enter the value of Element"+(cnt+1)+":");
			noArray[cnt]=scanner.nextInt();
		}
	}
	
	public static void displayArrayElements() {
		for(int cnt=0;cnt<noArray.length;cnt++) {
			System.out.println(noArray[cnt]);
		}
	}
	
	
	public static void sortArrayElementsAsc() {
		for(int cnt=0;cnt<noArray.length;cnt++) {
			for(int acnt=0;acnt<noArray.length;acnt++) {
				if (noArray[cnt] < noArray[acnt]) {
					noArray[cnt] = noArray[cnt] + noArray[acnt];
					noArray[acnt] = noArray[cnt] - noArray[acnt];
					noArray[cnt] = noArray[cnt] - noArray[acnt];
				}
			}
		}
	}

}
