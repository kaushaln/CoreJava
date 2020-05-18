// Write a program which demonstrate method calls another method.
package corejava.functions;

public class MethodCallingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		methodA();

	}
	
	public static void methodA() {
		System.out.println("Method A called");
		methodB();
	}
	
	public static void methodB() {
		System.out.println("Method B Called.");
	}

}
