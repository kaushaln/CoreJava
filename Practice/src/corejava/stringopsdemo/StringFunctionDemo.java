// Write a program to demonstrate string function's usage.

package corejava.stringopsdemo;

public class StringFunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "The quick brown fox jumps over the lazy dog";
		System.out.println("Length of String : " + string.length());
		String substring = string.substring(10, 18);
		System.out.println("Substring from String is " + substring);
		String text = "fox";
		int index = string.indexOf(text);
		if (index >0) {
			System.out.println("Index of fox word is " + index );
		}else {
			System.out.println(" Fox word is not available in string");
		}
		String word = string.substring(3,9);
		System.out.println(word);
		System.out.println("Trimmed word is :"+word.trim());
		String text1 = "hello";
		String text2 = "Hello";
		String text3 = text1;
		
		// text1 object is being compared with text2 object
		if (text1.equals(text2)) {
			System.out.println("Both text1 and text2 objects are same" );
		}else {
			System.out.println("Both text1 and text2 objects are not same");
		}
		// text1 object is being compared with text3 object
		if (text1.equals(text3)) {
			System.out.println("Both text1 and text3 objects are same" );
		}else {
			System.out.println("Both text1 and text3 objects are same" );
		}
		
		// text1 object's string value is being compared with "hello" string
		if (text1.equals("hello")) {
			System.out.println(text1 + " and hello text are same" );
		}else {
			System.out.println(text1 + " and hello text are not same" );
		}
		// text1 object's string value is being compared with "Hello" string
		if (text1.equals("Hello")) {
			System.out.println(text1 + " and Hello text are same" );
		}else {
			System.out.println(text1 + " and Hello text are not same" );
		}
	}

}
