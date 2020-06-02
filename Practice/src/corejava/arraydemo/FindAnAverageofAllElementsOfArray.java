// Write a Java Program to print the average of all elements in an array
package corejava.arraydemo;

import java.util.Scanner;

public class FindAnAverageofAllElementsOfArray {
	
	public static Scanner scanner = null;
	
	public static int noArray[] = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arraySize;
		scanner = new Scanner(System.in);
		System.out.println("Enter the element count that you want to read for array:");
		arraySize = scanner.nextInt();
		noArray = new int[arraySize];
		if (arraySize < 1) {
			System.out.println("You Can't Read the Array elements.");
		}else {
			getArrayElements();
			findAnAverageOfElements();
		}
		scanner.close();

	}

	public static void getArrayElements() {
		for(int cnt=0;cnt<noArray.length;cnt++) {
			System.out.println("Enter the value for Element " + cnt +":");
			noArray[cnt]=scanner.nextInt();
		}
	}
	
	public static void findAnAverageOfElements() {
		if (noArray.length == 1) {
			System.out.println("Average of All ArrayElement is "+ noArray[0]);
		}else {
			double sum =0;
			for(int cnt=0;cnt<noArray.length;cnt++) {
				sum = sum + noArray[cnt];
			}
			System.out.println("Average of All arrayElement is "+ (sum/noArray.length));
		}
		
	}
}
