

package Assignment_01;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		String name;
		int age;
		char section;
		float percentage;
		Scanner sc = new Scanner(System.in);
		Student obj = new Student();
		Student[] arr = new Student[6];
		for(int i = 0;i < 6;i++) {
			System.out.println("Enter name::");
			name=sc.next();
			System.out.println("Enter age::");
			age=sc.nextInt();
			System.out.println("Enter section::");
			section=sc.next().charAt(0);
			System.out.println("Enter percentage::");
			percentage=sc.nextFloat();
			
		    arr[i]=new Student(name,age,section,percentage);
		}
		sc.close();
		
	}
}

class Student {
	String name;
	int age;
	char section;
	float percentage;
	Student(String name,int age,char section,float percentage) {
		this.name=name;
		this.age=age;
		this.section=section;
		this.percentage=percentage;
	}
	Student() {
		// TODO Auto-generated constructor stub
	}
	
}