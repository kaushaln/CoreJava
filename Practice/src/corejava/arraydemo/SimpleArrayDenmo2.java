// Write a program to read size of array and elements of array from user.Also Print the elements of array
package corejava.arraydemo;

import java.util.Scanner;

public class SimpleArrayDenmo2 {

	public static Scanner scanner = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		int no[];
		scanner = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		size = scanner.nextInt();
		no = new int[size];
		no=getArrayElements(no);
		System.out.println("Array With Elements is as below:");
		System.out.println("==============================");
		displayArrayElements(no);
		scanner.close();
	}
	
	public static int[] getArrayElements (int[] a) {
		
		for (int cnt=0;cnt<a.length;cnt++) {
			System.out.println("Enter the element"+(cnt+1)+":");
			a[cnt]=scanner.nextInt();
		}
		
		return a;
	}
	
	public static void displayArrayElements(int[] noArray) {
		for(int cnt=0;cnt<noArray.length;cnt++) {
			System.out.println(noArray[cnt]);
		}
	}

}
