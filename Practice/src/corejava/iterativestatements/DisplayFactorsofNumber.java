// Write a program to display factor of a given number.
package corejava.iterativestatements;

import java.util.Scanner;

public class DisplayFactorsofNumber {

	static Scanner s1 = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s1 = new Scanner(System.in);
		int no;
		String factors = "";
		System.out.println("Enter the number:");
		no = s1.nextInt();
		if (no !=0) {
			for(int cnt=1;cnt<=no;cnt++) {
				
				if (no % cnt == 0) {
					factors = factors + cnt ;
					if ( cnt == no ) {
						factors = factors +".";
					}
					else {
						factors = factors +", ";
					}
				}
			}
			System.out.println(" Factors of "+ no + " are : " + factors);
		}
		else {
			System.out.println(" Zero is nutral no.");
		}
	}

}
