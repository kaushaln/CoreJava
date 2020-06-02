//Write a Java Program to print odd and Even number from Array.
package corejava.arraydemo;

import java.util.Scanner;

public class PrintOddEvenNoFromArray {
	
	public static Scanner scanner = null;
	
	public static int noArray[] = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arraySize;
		scanner = new Scanner(System.in);
		System.out.println("How many Elements you want to enter in Array:");
		arraySize = scanner.nextInt();
		if (arraySize == 0) {
			System.out.println("You can't enter any value into Array as you have selected 0 no to enter into Array");
		}else {
			noArray = new int[arraySize];
			getArrayElements();
			SeparateEvenOddNo();
		}
		scanner.close();
		//System.out.println ("Hello World");
	}
	
	public static void getArrayElements() {
		for(int cnt=0;cnt<noArray.length;cnt++) {
			System.out.println("Enter the value for Element"+(cnt)+":");
			noArray[cnt] = scanner.nextInt();
		}
	}
	
	public static void displayArrayElements() {
		for(int cnt=0;cnt<noArray.length;cnt++) {
			System.out.println(noArray[cnt]);
		}
	}

	public static void SeparateEvenOddNo() {
		String oddNo="",evenNo="";
		int ocnt=0,ecnt=0;
		for(int cnt=0;cnt<noArray.length;cnt++) {
			if(noArray[cnt]%2==0) 
			{
				ecnt++;
				if (evenNo.equals("") || cnt==0 ) 
				{
					evenNo = evenNo + noArray[cnt];
				}else 
				{
					evenNo =  evenNo+ "," + noArray[cnt];
				}
			}else {
				ocnt++;
				if (oddNo.equals("") || cnt==0 ) 
				{
					oddNo = oddNo + noArray[cnt];
				}else 
				{
					oddNo =  oddNo +"," + noArray[cnt];
				}
				
			}
		}
		
		oddNo = oddNo +".";
		evenNo = evenNo + ".";
		if (ocnt == 0) {
			System.out.println ("Even Numbers of Array are " + evenNo);
			System.out.println ("Odd Numbers are not available in Array.");
		}else if (ecnt == 0) {
			System.out.println ("Odd Numbers of Array are " + oddNo);
			System.out.println ("Even Numbers are not available in Array.");
		}else {
			System.out.println ("Even Numbers of Array are " + evenNo);
			System.out.println ("Odd Numbers of Array are " + oddNo);
		}
		
	}
}
