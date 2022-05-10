package Unit_01;

/* 
 * The wrapper class in Java provides the mechanism to convert primitive into object and obj.
 * Why ? 
 * Because we want to use predefined methods of those objects 
 * - boolean data types -> Boolean obj; -> obj.toString();
 */

public class P4_Task02_WrapperClassesInJava {
	
	public static void main(String[] args) {
		//Converting int into Integer
		int a = 20;
		
		String str = "" + a + "";
		
		Integer i = Integer.valueOf(a); // Converting it into Integer explicitly
		Integer j = a; // autoboxing, now compiler will wrute Integer.valueOf(a) internally
		
		System.out.println(a + " " + i + " " + j);
		
		System.out.println(i.toString());
		
		// a.toString() can not be done as a is int and not an object
		
		//Autoboxing: Converting primitives into objects
		
		byte b = 10;
		Byte byteobj = b;
		
		System.out.println(byteobj);
		
		//Unboxing: Converting Objects to Primitives
		byte bytevalue = byteobj;
		System.out.println(bytevalue);
		
		
	}

}