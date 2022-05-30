
package Assignment_01;
import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		String name;
		int age;
		String department;
		int salary;
		Scanner sc = new Scanner(System.in);
		Employee arr[] = new Employee[8];
		for(int i=0;i<8;i++) {
			System.out.println("Enter name:");
			name=sc.next();
			System.out.println("Enter age:");
			age=sc.nextInt();
			System.out.println("Enter department:");
			department=sc.next();
			System.out.println("Enter salary:");
			salary=sc.nextInt();
			arr[i] = new Employee(name,age,department,salary);
		}
		sc.close();
		int a=0,b=0,c=0,d=0;
	for(int i=0;i<8;i++)
	{
		if(arr[i].department.equals("A"))
			a=a+arr[i].salary;
		else if(arr[i].department.equals("B"))
			b=b+arr[i].salary;
		else if(arr[i].department.equals("C"))
			c=c+arr[i].salary;
		else
			d=d+arr[i].salary;
	}
	System.out.println("Salary in A department="+a);
	System.out.println("Salary in B department="+b);
	System.out.println("Salary in C department="+c);
	System.out.println("Salary in D department="+d);
	}

}
class Employee {
	String name;
	int age;
	String department;
	int salary;
 
	Employee(String name,int age,String department,int salary) {
		this.name=name;
		this.department=department;
		this.age=age;
		
		if(salary>30000)
			this.salary=25000;
		else
		this.salary=salary;
	
	}
	
}
