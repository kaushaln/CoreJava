// Write a program to print first five odd numbers from 1 to 100.
//To demonstrate usage of break as transfer statement
package corejava.transferstatement;

public class BreakAsTransferStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt;
		int oddcnt=0;
		System.out.println("First five odd numbers are as below :");
		for (cnt =1 ;cnt<=100;cnt++) {
			if ( cnt %2 !=0) {
				oddcnt = oddcnt + 1;
				if (oddcnt >5) {
					break;
				}else {
					System.out.println(cnt);
				}
			}
			
		}

	}

}
