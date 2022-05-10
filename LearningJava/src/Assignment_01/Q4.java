
package Assignment_01;

public class Q4 {

	public static void main(String[] args) {
		ClassThree obj2 = new ClassThree();
	ClassThree obj3 = new ClassThree(1);
	}
}

class ClassOne {
	ClassOne(int p) {
		System.out.println("Class one default constructor "+p);
	}
}

class ClassTwo extends ClassOne {
	ClassTwo() {
		super(8);
		System.out.println("Class Two single parameterized constructor");}
}

class ClassThree extends ClassTwo {
	
	ClassThree(){
	
		System.out.println("Class Three default constructor");
		}
	
	ClassThree(int p) {
	
		System.out.println("Class Three single parameterized constructor "+p);
	}
	
}