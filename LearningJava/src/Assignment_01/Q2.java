/*Q2 WAP to count the total number of calls for a member function from
	 more than one objects. [Let�s say, from 3 such Objects] 
*/
package Assignment_01;

public class Q2 {

	public static void main(String[] args) {
		sampleClass obj1 = new sampleClass();
		sampleClass obj2 = new sampleClass();
		sampleClass obj3 = new sampleClass();
		obj1.display();
			}
}

class sampleClass {
	static int count=0;
	sampleClass(){
		count++;
	}
	void display()
	{
		System.out.println(count);
	}
}