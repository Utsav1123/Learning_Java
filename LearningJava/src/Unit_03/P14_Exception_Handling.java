
   
package Unit_03;


import java.util.Scanner;

public class P14_Exception_Handling {

	public static void main(String[] args) {
		ExceptionHandling obj = new ExceptionHandling();
		//obj.BasicException();
		//obj.HandleException();
		//obj.MultipleCatch();
		//obj.inputMismatch();
		//obj.StackOverFlowError(10);
		//obj.IndexOutofBound();
		//obj.nullpoitnerexception();
		//obj.useofthrow();
		//obj.useOfThrowsAndFinally();
		obj.checkedAndUncheckedException();
	
	}
}

class ExceptionHandling {

	void BasicException() {
		try {
			int a = 5, b = 0;
			int c = a/b; 
			System.out.println("After the exception "+c);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception handled");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		//even if the exception is not caught finally will still run
		//finally always runs irrespective of whether exception handled or not
		finally {
		System.out.println("Done");
		}
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
			System.out.println("Exception encountered and Arithmetic Exception");
		}
		catch(Exception e) {
			System.out.println("Exception handled by exception class");
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
			System.out.println("Input Mismatch Exception");
		}
		System.out.println("Outside the try and catch block");
	}
	
	void StackOverFlowError(int i) { 
		
		try {
			while(i > 0) { 
				StackOverFlowError(++i);
			}
		} catch(Exception e) {
			System.out.println("Exception Handled");
		}
		System.out.println("Outside the try and catch block");
	}
	
	void IndexOutofBound() {
		try {
			int a[] = {1, 2, 3};
			System.out.println(a[10]); 
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index Out of Bound Exception");
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
		finally {
			System.out.println("hello");
		}
	}
	void checkedAndUncheckedException() {
		
		int x = 0;
		int y = 10;
		if(x<2)
		{
			throw new ArithmeticException();
		}
		int z = y / x;

		System.out.println(z);

	}}

	