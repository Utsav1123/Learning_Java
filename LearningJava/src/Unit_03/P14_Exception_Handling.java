
   
package Unit_03;

import java.util.Scanner;

public class P14_Exception_Handling {

	public static void main(String[] args) {
		ExceptionHandling obj = new ExceptionHandling();
		obj.BasicException();
		obj.HandleException();
		obj.MultipleCatch();
		obj.inputMismatch();
		obj.StackOverFlowError(10);
		obj.IndexOutofBound();
		obj.nullpoitnerexception();
		obj.useofthrow();
		obj.useOfThrowsAndFinally();
		obj.checkedAndUncheckedException();
		obj.manualException();
	}
}

class ExceptionHandling {

	void BasicException() {
		try {
			int a = 5, b = 0;
			int c = a/b; 
			System.out.println("After the exception"+c);
		} catch(ArithmeticException e) {
			System.out.println("Exception handled");
		}
		System.out.println("Done");
	}
	
	
	void HandleException() {
		try {
			int a = 5, b = 0;
			int c = a/b;
			System.out.println("Inside try block"+c);
		}catch(ArithmeticException e) {
			System.out.println("Exception encountered and handled ");
		}
		System.out.println("Outside try and catch block");
	}
	
	
	void MultipleCatch() {
		
		try {
			int a = 5, b = 0;
			int c = a/b;
			System.out.println("Inside try block"+c);
		} catch(ArithmeticException e) {
			System.out.println("Exception encountered and handled by sub class of Exception ");
		}
		catch(Exception e) {
			System.out.println("Exception handled by Super exception class");
		}
		System.out.println("Outside try and catch block");
	}
	
	void inputMismatch() {
		try {
			int i=0 ;
			Scanner sc = new Scanner(System.in); 
			i = sc.nextInt(); 
			System.out.println(i);
			sc.close();
		} catch(Exception e) {
			System.out.println("Input Mismatch Exception handled !");
		}
		System.out.println("Outside the try and catch block");
	}
	
	void StackOverFlowError(int i) { // its not an exception, its an error
		
		try {
			while(i > 0) { 
				StackOverFlowError(++i);
			}
		} catch(Exception e) {
			System.out.println("Exception Handled !");
		}
		System.out.println("Outside the try and catch block");
	}
	
	void IndexOutofBound() {
		try {
			int a[] = {1, 2, 3};
			System.out.println(a[10]); //accessing the memory which is not there in array..
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index Out of Bound Exception handled !");
		}
		System.out.println("Outside try and catch block");
	}
	
	void nullpoitnerexception() {
		try {
			String s = null;
			int len = s.length();
			System.out.println("length is "+ len);
		} catch(Exception e) {
			System.out.println("Exception handled "+ e.getMessage());
		}
		System.out.println("Outside try-catch");
	}
	
	
	
	void useofthrow() {	
		int age  = 6;
		try {
			if(age  == 6) {
				throw new Exception("Exception is thrown"); 
			}
			else {
				System.out.println("Age is "+age);
			}
		}
		catch(Exception e) {
			System.out.println("Exception handled "+ e.getMessage());
		}
	}
	
	void throwsCheck() throws Exception {
		String a ;
		Scanner sc = new Scanner(System.in);
		a = sc.next();
		sc.close();
		
			if(a.length() > 6) {
				throw new Exception("String length exceeded");
			}
			else {
				System.out.println("No Exception was generated ");
			}
	}
	
	void useOfThrowsAndFinally(){
		try {
			throwsCheck();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	void checkedAndUncheckedException() {
		
		int x = 0;
		int y = 10;
		int z = y / x;

		System.out.println(z);

		
		try {
			useofthrow();
		} catch (Exception e) {
			System.out.println("hello");	
		}
	}

	void manualException() {
		Scanner sc = new Scanner(System.in);
		int l, b;
		l = sc.nextInt();
		
		sc.close();
		try {
			if(l < 0) {
				throw new Exception("The number cannot be negative");
			}
		
			
		}
		catch(Exception e) {
			System.out.println( e.getMessage());
		}
		finally {
			System.out.println("hello");
		}
	}
}