// Write a Java program to get the difference between the largest and smallest values in an array of integers. The length of the array must be 1 and above.

package corejava.arraydemo;

import java.util.Scanner;

public class FindDiffBetweenMaxAndMinElementOfArray {

public static Scanner scanner = null;
	
	public static int noArray[] = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arraySize,max,min;
		scanner = new Scanner(System.in);
		System.out.println("Enter the no of elements that you want to read for Array");
		arraySize = scanner.nextInt();
		noArray = new int [arraySize];
		if(arraySize == 0) {
			System.out.println("You can't read elements of array as you have entered 0 as no of elements of array ");
		}else {
			getArrayElements();
			max = findMaxNumberFromArray();
			min = findMinNumberFromArray();
			System.out.println("Difference Between Maximum and Minimum Element of Array is " + (max-min));
		}
		scanner.close();
	}
	
	public static void getArrayElements() {
		
		for (int cnt=0;cnt<noArray.length;cnt++) {
			System.out.println("Enter the value for Element "+cnt+":");
			noArray[cnt] = scanner.nextInt();
		}
		
	}
	
	public static int findMaxNumberFromArray() {
		int max=0;
		if (noArray.length == 1) {
			System.out.println(" Max value in Array is "+ noArray[0]);
		}else {
			for(int cnt=0;cnt<noArray.length;cnt++) {
				if ( noArray[cnt] > max) {
					max = noArray[cnt];
				}
			}
			
		}
		return  max;
	}
	
	public static int findMinNumberFromArray() {
		int min=0;
		if (noArray.length == 1) {
			System.out.println(" Minimum value in Array is "+ noArray[0]);
		}else {
			min = noArray[0];
			for(int cnt=0;cnt<noArray.length;cnt++) {
				if ( noArray[cnt] < min ) {
					min = noArray[cnt];
				}
			}
		}
		return min;
	}

}
