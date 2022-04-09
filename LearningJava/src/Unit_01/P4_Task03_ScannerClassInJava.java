package Unit_01;

import java.util.Scanner;
/*When user takes input from the console!
   nextLine()      : Read user input [to read string]
   next()          : Read next token from the input entered by the user
   
   nextBoolean()   : Reads a boolean value from the user
   nextByte()      : Reads a byte value from the user
   nextDouble      : Reads a double value from the user
   nextFloat       : Reads a float value from the user
   nextInt()       : Reads a int value from the user
   nextLine()      : Reads a string value from the user
   nextLong()      : Reads a long value from the user
   nextShort()     : Reads a short value from the user
   
 */

public class P4_Task03_ScannerClassInJava {
	
	public static void main(String[] args) {
		
		Scanner ob1 = new Scanner(System.in);
		Scanner ob2 = new Scanner(System.in);
		
		//Read the First-Token: (_space bar)
		String firstName = ob1.next();
		System.out.println("Name is:" + firstName + "\n");
		
		String name = ob2.nextLine(); // (\n)
		String name2 = ob2.nextLine();
		
		System.out.println("Name is: " + name + "\n");
		System.out.println("Name is: " + name + "\n");
		
		boolean b = ob2.nextBoolean();
		System.out.println(b + "\n");
		
		ob1.close();
		ob2.close();
	}

}