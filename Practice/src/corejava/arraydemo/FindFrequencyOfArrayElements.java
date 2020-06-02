// Write a program to read elements from the user and display frequency of every elements of array
package corejava.arraydemo;

import java.util.Scanner;

public class FindFrequencyOfArrayElements {
	
	public static Scanner scanner = null;
	public static int noArray[] = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arraySize;
		scanner = new Scanner(System.in);
		System.out.println("How many Elements you want to enter in Arrary?");
		arraySize = scanner.nextInt(); 
		noArray = new int[arraySize];
		getArrayElements();
		System.out.println("Array Content After Receiving numbers from User");
		System.out.println("===============================================");
		displayArrayElements();
		FrequencyCount();
		scanner.close();

	}
	
	public static void getArrayElements() {
		
		for(int cnt=0;cnt<noArray.length;cnt++) {
			System.out.println("Enter value for Element " +(cnt+1)+":");
			noArray[cnt]=scanner.nextInt();
		}
	}
	
	public static void displayArrayElements() {
		for(int cnt=0;cnt<noArray.length;cnt++) {
			System.out.println(noArray[cnt]);
		}
	}
	
	public static void FrequencyCount() {
		int Freqcount; 
		for (int cnt=0;cnt<noArray.length;cnt++) {
			Freqcount = 0;
			for(int arrayCnt=0;arrayCnt<noArray.length;arrayCnt++) {
				if (noArray[cnt] == noArray[arrayCnt]) {
					Freqcount++;
				}
			}
			System.out.println("Array Element"+(cnt+1)+ " having value "+noArray[cnt]+"  is available " + Freqcount + " times in array");
		}
	}

}
