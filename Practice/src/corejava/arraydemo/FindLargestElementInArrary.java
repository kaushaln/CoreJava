// Write a Java Program to print the largest element in an array

package corejava.arraydemo;

import java.util.Scanner;

public class FindLargestElementInArrary {

	public static Scanner scanner = null;
	
	public static int noArray[] = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arraySize;
		scanner = new Scanner(System.in);
		System.out.println("Enter the no of elements that you want to read for Array");
		arraySize = scanner.nextInt();
		noArray = new int [arraySize];
		if(arraySize == 0) {
			System.out.println("You can't read elements of array as you have entered 0 as no of elements of array ");
		}else {
			getArrayElements();
			findMaxNumberFromArray();
		}
		scanner.close();
	}
	
	public static void getArrayElements() {
		
		for (int cnt=0;cnt<noArray.length;cnt++) {
			System.out.println("Enter the value for Element "+cnt+":");
			noArray[cnt] = scanner.nextInt();
		}
		
	}
	
	public static void findMaxNumberFromArray() {
		int max=0;
		if (noArray.length == 1) {
			System.out.println(" Max value in Array is "+ noArray[0]);
		}else {
			for(int cnt=0;cnt<noArray.length;cnt++) {
				if ( noArray[cnt] > max) {
					max = noArray[cnt];
				}
			}
			System.out.println("Largest Element of Array is "+ max);
		}
	}

}
