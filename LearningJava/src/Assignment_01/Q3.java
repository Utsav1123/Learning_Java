
package Assignment_01;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		TestClass obj = new TestClass();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number::");
		int n=sc.nextInt();
		sc.close();
		obj.display(n);
		

	}

}

class TestClass implements A {
	public void display(int p) {
		int count=0;
		for(int i=2;i<p;i++) {
			if(p%i==0)
			{count++;
			break;
			}
		}
		if(count==0) System.out.println("Number is prime");
		else System.out.println("Number is not prime");
	}
}

interface A {
	void display(int p);
}