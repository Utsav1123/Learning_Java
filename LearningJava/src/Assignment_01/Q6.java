package Assignment_01;
import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		SampleClass2 obj = new SampleClass2();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextLine();
		int b=sc.nextInt();
		sc.close();
		int result=(a>b)?obj.sum(a,b):obj.sub(a,b);
		System.out.println(result);
	}
}

class SampleClass2 {
	
	int sum(int a,int b) {
		return a+b;
	}
	
	int sub(int a,int b) {
		return ((a-b)>0)?(a-b):0;
	}
}