// Write a program to demonstrate usage of try catch finally as transfer flow statement
package corejava.transferstatement;

public class TryCatchFinallyAsTransferstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=0;
		System.out.println("value of no is " + no);
		try {
			 no = 10/0;
		}catch(ArithmeticException Ae) {
			System.out.println("Arithmetic Exception Raised");
		}finally{
			System.out.println("Normally Clean up code is written here");
		}

	}

}
