// Write a Java Program to print the elements of an array present on even position
package corejava.arraydemo;

import java.util.Scanner;

public class DisplayElementAtEvenPostion {

	public static Scanner scanner = null;
	public static int noArray[] = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arraySize;
		scanner = new Scanner(System.in);
		System.out.println("Enter the no of Elements you want to Read for Array:");
		arraySize = scanner.nextInt();
		noArray = new int[arraySize];
		if (arraySize == 0) {
			System.out.println("You entered ArraySize as 0. So You can't get any element for it.");
		}else {
			getArrayElements();
			displayArrayElements();
		}
		
		scanner.close();
		
	}
	
	public static void getArrayElements() {
		for(int cnt=0;cnt<noArray.length;cnt++) {
			System.out.println("Enter the value for Element"+(cnt)+":");
			noArray[cnt]=scanner.nextInt();
		}
	}
	
	public static void displayArrayElements() {
		
			for(int cnt=0;cnt<noArray.length;cnt++) {
				if(cnt%2==0) {
					System.out.println("Element at position "+ cnt +" is : " +noArray[cnt]);
				}
			}
		
	}
}
