
package Assignment_01;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		String name;
		int age;
		char department;
		float salary;
		Scanner sc = new Scanner(System.in);
		Employee arr[] = new Employee[8];
		for(int i=0;i<8;i++) {
			System.out.println("Enter name::");
			name=sc.next();
			System.out.println("Enter age::");
			age=sc.nextInt();
			System.out.println("Enter department::");
			department=sc.next().charAt(0);
			System.out.println("Enter salary::");
			salary=sc.nextFloat();
			arr[i] = new Employee(name,age,department,salary);
		}
		sc.close();
		Employee obj = new Employee();
		obj.def_salary(arr);
	}

}
class Employee {
	String name;
	int age;
	char department;
	float salary;
    float def_salary;
	Employee(String name,int age,char department,float salary) {
		this.name=name;
		this.department=department;
		this.age=age;
		this.salary=salary;
		this.def_salary=salary;
	}
	Employee(){}
	void def_salary(Employee arr[]) {
		for(int i=0;i<8;i++)
		if(arr[i].salary>30000) {
			arr[i].def_salary=25000;
		}
	}
}
