// Write a program to find Duplicate Element and Remove it from Array
// Here Removing means Replace element value with 0.
package corejava.arraydemo;

import java.util.Scanner;

public class RemoveDuplicateElementFromArray {

	public static Scanner scanner = null;
	public static int noArray[] = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arraySize;
		scanner = new Scanner(System.in);
		System.out.println("Enter the no of elements you want to read for Array:");
		arraySize = scanner.nextInt();
		if(arraySize == 0) {
			System.out.println("You can't Read elements as Array Size is 0");
		}else {
			noArray = new int[arraySize];
			getArrayElements();
			RemoveDuplicate();
			displayArrayElements();
		}
		scanner.close();
	}

	
	public static void getArrayElements() {
		for (int cnt=0;cnt<noArray.length;cnt++) {
			System.out.println("Enter the value of Element" +(cnt+1)+":");
			noArray[cnt] = scanner.nextInt();
		}
	}
	
	public static void displayArrayElements() {
		for (int cnt=0;cnt<noArray.length;cnt++) {
			System.out.println(noArray[cnt]);
		}
	}
	
	public static void RemoveDuplicate() {
		int temp;
		for(int cnt=0;cnt<noArray.length;cnt++) {
			temp =0;
			for(int acnt=0;acnt<noArray.length;acnt++) {
				
				if (noArray[cnt] == noArray[acnt]) {
					
					if(temp == 0) {
						temp ++;
					}else {
						noArray[acnt] = 0;
					}
				}
			}
		}
	}
}
