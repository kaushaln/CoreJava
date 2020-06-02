// Write a Java Program to print the elements of an array present on odd position.
package corejava.arraydemo;

import java.util.Scanner;

public class DisplayElementAtOddPosition {

	public static Scanner scanner = null;
	public static int noArray[] = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arraySize;
		scanner = new Scanner(System.in);
		
		System.out.println("Enter no of Elements that you want to read for Array: ");
		arraySize = scanner.nextInt();
		if(arraySize == 0) {
			System.out.println("You can't read 0 Elements for Array.");
		}else {
		
			noArray = new int[arraySize];
			getArrayElements();
			displayArrayElements();
		}
		
		scanner.close();
	}
	
	public static void getArrayElements() {
		for(int cnt=0;cnt<noArray.length;cnt++) {
			System.out.println("Enter the value of Element "+ cnt +":");
			noArray[cnt]=scanner.nextInt();
		}
	}
	
	public static void displayArrayElements() {
		if (noArray.length==1) {
			
			System.out.println("Element value can't be retrieved as array contains only 1 element at 0 position");
		}else {
			for(int cnt=0;cnt<noArray.length;cnt++) {
				if(cnt%2==1) {
					System.out.println("Element at position "+ cnt +" is : " + noArray[cnt] );
					
				}
				
			}
		}
		
	}

}
