// Write a java program to retrieve value of Element at specific position
package corejava.arraydemo;

import java.util.Scanner;

public class RetrieveElementValueAtSpecificArrayIndex {

	public static Scanner scanner = null;
	public static int noArray[] = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arraySize,index,returnValue;
		scanner = new Scanner(System.in);
		System.out.println("Enter the no of Elements that you want to read from users");
		arraySize = scanner.nextInt();
		
		if (arraySize ==0) {
			System.out.println("You can't enter value of Elements as you have selected 0 as Array size");
		}else {
			noArray = new int[arraySize];
			getArrayElements();
			System.out.println("Enter the Index no from Which you want to Retrieve Element:");
			index = scanner.nextInt();
			if (index < 0  || (index > noArray.length-1) ) {
				System.out.println("User has entered wrong Index value.");
			}else {
				returnValue = getElement(index);
				System.out.println("Requested Element is "+ returnValue);
			}
		}
		scanner.close();
	}

	public static int getElement(int no) {
			return noArray[no];
		
	}
	
	public static void getArrayElements() {
		for(int cnt=0;cnt<noArray.length;cnt++) {
			System.out.println("Enter the value of Element " +(cnt+1)+":");
			noArray[cnt] = scanner.nextInt();
		}
	}
}
