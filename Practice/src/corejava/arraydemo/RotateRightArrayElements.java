package corejava.arraydemo;

import java.util.Scanner;

public class RotateRightArrayElements {
	public static Scanner scanner = null;
	public static int noArray[] = null;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arraySize;
		scanner = new Scanner(System.in);
		System.out.println("Enter the no to Elements you want to read:");
		arraySize = scanner.nextInt();
		noArray = new int[arraySize];
		getArrayElements();
		
		if(arraySize < 2) {
			System.out.println("Rotation of Array Element is not possible As array has only 1 element");
		} else if (arraySize ==2) {
			System.out.println("Array Elements are as below:");
			displayArrayElements();
			System.out.println("Rotation Started.");
			noArray[0]= noArray[0]+noArray[1];
			noArray[1]= noArray[0]-noArray[1];
			noArray[0]= noArray[0]-noArray[1];
			System.out.println("Array Elements After Rotating right are as below:");
			displayArrayElements();
			
		} else {
			System.out.println("Array Elements are as below:");
			displayArrayElements();
			System.out.println("Rotation Started.");
			RotateRightArrayElement();
			System.out.println("Array Elements After Rotating right are as below:");
			displayArrayElements();
		}
		scanner.close();
	}
	
	public static void RotateRightArrayElement() {
		int temp=0,temp1=0;
		for(int cnt=0;cnt<noArray.length;cnt++) {
			if(cnt==0) {
				temp = noArray[cnt];
				noArray[cnt]=noArray[noArray.length-1];
				temp1=noArray[cnt+1];
			} else if (cnt == (noArray.length-1)){
				noArray[cnt]=temp;
			}
			else {
				noArray[cnt]=temp;
				temp = temp1;
				temp1=noArray[cnt+1];
			}
		}
	}
	public static void getArrayElements() {
		for(int cnt =0;cnt<noArray.length;cnt++) {
			System.out.println("Enter the value for Element"+(cnt+1)+":");
			noArray[cnt]=scanner.nextInt();
		}
	}
	public static void displayArrayElements() {
		for(int cnt =0;cnt<noArray.length;cnt++) {
			System.out.println(noArray[cnt]);
		}
	}


}
