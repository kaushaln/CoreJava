// Write a program to print sum of first 10 numbers
package corejava.iterativestatements;

public class PrintSumofFirst10Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		
		for(int i =1;i<=10;i++) {
			sum= sum + i;
		}
		System.out.println("Sum is " + sum);
	}

}
