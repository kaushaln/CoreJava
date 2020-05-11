//Write a program to demonstrate usage of different variable types of core java 
package corejava.datatypes;

public class VariableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 150;
		Variables v = new Variables();
		
		System.out.println("Value of Instance variable no is : " + v.no);
		System.out.println("Value of local variable no is : " + no);

	}

}

class Variables{
	
	public int no = 100;
}
