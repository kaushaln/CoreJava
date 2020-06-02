/* Write a program to read the total number of values to be entered into array.
 * Read the values of Array Element from user and Also Enter value of number to check its frequency in Array
*/ 
package corejava.arraydemo;

import java.util.Scanner;

public class FindFrequencyOfUserRequestedElementInArray {

	public static Scanner scanner = null;
	public static int noArray[] = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arraySize,no;
		scanner = new Scanner(System.in);
		System.out.println("How many no you want to read for Array?");
		arraySize = scanner.nextInt();
		noArray = new int[arraySize];
		getArrayElements();
		displayArrayElements();
		System.out.println("Enter the number to find Frequency of it in Array:");
		no = scanner.nextInt();
		int cnt = findFrequency(no);
		if (cnt != 0) {
			System.out.println("The Frequency of Given no " + no +" is " + cnt);
		}else {
			System.out.println("The Entered no "+no+" is not available in Array");
		}
		scanner.close();

	}
	
	public static void getArrayElements() {
		for (int cnt =0;cnt<noArray.length;cnt++) {
			System.out.println("Enter the value of Element"+(cnt+1)+":");
			noArray[cnt]=scanner.nextInt();
		}
	}
	
	public static void displayArrayElements() {
		for (int cnt =0;cnt<noArray.length;cnt++) {
			System.out.println(noArray[cnt]);
		}
	}
	public static int findFrequency(int a) {
		int freqcnt=0;
		for(int cnt =0;cnt<noArray.length;cnt++) {
			if(noArray[cnt]==a) {
				freqcnt++;
			}
		}
		return freqcnt;
	}

}
