package Unit_02;

public class P13_Assignment_Questions_Unit_02 {

	public static void main(String[] args)
	{
		Assignment_Questions_Unit_02 obj = new Assignment_Questions_Unit_02();
		obj.abstractClassCall();
		obj.overloadingAndOverriding();
		obj.accessProtectionInJava();
		obj.interfaceImplementation();
	}
}
class Assignment_Questions_Unit_02 {
	void abstractClassCall(){
		Sample3 obj=new Sample3();
		obj.run();
	}
	
	void overloadingAndOverriding() {
		Sample3 obj=new Sample3();
		obj.run();
		obj.run(1);
		obj.run(1,2);
		
		obj.display();
	}
	
	void accessProtectionInJava() {
		Sample3 obj=new Sample3();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		
		obj.showData();
		obj.display();
	}
	
	void interfaceImplementation() {
		Sample3 obj=new Sample3();
		obj.display1();
		obj.display2();
	}
}

abstract class Sample2{
	int a=10;
	public int b=20;
	protected int c=30;
	private int d=40;
	
	void showData() {
		System.out.println("inside Sample2 Parent Class\n");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
	}
	
	void display() {
		System.out.println("this is a display method inside abstract class Sample2\n");
	}
	
	abstract public void run();
}

class Sample3 extends Sample2 implements A3,B3{
	public void display() {
		System.out.println("Inside child class\n");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		
	}
	
	public void display1(){
		System.out.println("display1 method inside Sample3 from interface A3\n");
	}
	
	public void display2() {
		System.out.println("display2 method inside Sample3 from interface B3\n");
	}
	
	public void run() {
		System.out.println("This is a run method from abstract class Sample2\n");
	}
	
	public void run(int x) {
		System.out.println("run overloaded method from Sample3\n");
	}
	
	public void run(int x, int y) {
		System.out.println("run overloaded method from Sample3\n");
	}
}

interface A3{
	void display1();
}

interface B3{
	void display2();
}