// Write a program that skips printing number which is divided by 5 from 1 to 25 
//To demonstrate usage of continue as transfer statement
package corejava.transferstatement;

public class ContinueAsTransferStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=1;
		while(no < 25) {
			if(no %5 == 0) {
				no++;
				continue;
			}else {
				System.out.println(no);
			}
			no++;
		}

	}

}
