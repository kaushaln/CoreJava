/* Write a program to read total count of array elements from user.
 * Read Array elements from user and also read no to be searched into Array
 * If user find searched no into array then print it's position(s).
*/

package corejava.arraydemo;

import java.util.Scanner;

public class FindEnteredNoIntoArrayElements {
	
	public static Scanner scanner = null;
	public static int noArray[] = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arraySize,no;
		scanner = new Scanner(System.in);
		System.out.println("Enter the array size:");
		arraySize = scanner.nextInt();
		noArray = new int[arraySize];
		getArrayElements();
		displayArrayElements();
		System.out.println("Entered Element values of Array is as below: ");
		no = scanner.nextInt();
		FindElementsPos(no);
		scanner.close();
	}
	
	public static void FindElementsPos(int a) {
		
		String result = "";
		int match = 0;
		for (int cnt =0;cnt<noArray.length;cnt++) {
			if(noArray[cnt] == a) {
				if(match ==0)
				{	
					result = result + ((cnt+1));
					match++;
				}else{
					result = result +","+((cnt+1));
					match++;
				}
			}
		}
		result = result +".";
		System.out.println("the position of " +a+ " is as below in array " + result);
		
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
}
