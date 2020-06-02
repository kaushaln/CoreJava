// Write a Program to sort an Array Elements.

package corejava.arraydemo;

import java.util.Scanner;

public class SortArrayElement {

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
		}else {
			noArray = new int[arraySize];
			getArrayElements();
			System.out.println("Sorting Again in Descending order");
			sortArrayElementsDesc();
			displayArrayElements();
			System.out.println("Sorting Again in Ascending order");
			sortArrayElementsAsc();
			displayArrayElements();
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
	
	public static void sortArrayElementsDesc() {
		for(int cnt=0;cnt<noArray.length;cnt++) {
			for(int acnt=0;acnt<noArray.length;acnt++) {
				if (noArray[cnt]>noArray[acnt]) {
					noArray[cnt] = noArray[cnt] + noArray[acnt];
					noArray[acnt] = noArray[cnt] - noArray[acnt];
					noArray[cnt] = noArray[cnt] - noArray[acnt];
				}
			}
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
