// Write a program to print multiplication of first 10 numbers
package corejava.iterativestatements;

public class PrintMulofFirst10Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mul=1;
		
		for(int i =1;i<=10;i++) {
			mul= mul * i;
		}
		System.out.println("Result of Multiplication is " + mul);
	}

}
