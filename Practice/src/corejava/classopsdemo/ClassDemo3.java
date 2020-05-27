// Class Demo with instance variable, static method and non static method.

package corejava.classopsdemo;

public class ClassDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		greetings();
	}
	
	public static void greetings() {
		Demo3 d3 = new Demo3();
		d3.Greeting(d3.name);
	}
	
}

class Demo3{
	
	public String name="Kaushal Nayak";
	
	public void Greeting(String name) {
		System.out.println("Hello World! from " + name);
		leaveoutMessage(name);
	}
	
	public static void leaveoutMessage(String name) {
		System.out.println("Bye World! from " + name);
	}
}