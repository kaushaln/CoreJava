// Write a program to print elements of array
package corejava.arraydemo;

public class SimpleArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no[] = {10,20,30,40};
		for(int cnt=0;cnt<no.length;cnt++) {
			System.out.println(no[cnt]);
		}
		
		//Printing using for each loop
		System.out.println("Printing Array Elements usig For each loop");
		for(int a: no) {
			System.out.println(a);
		}
	}

}
