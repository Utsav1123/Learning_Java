

package Assignment_01;

public class Q7 {

	public static void main(String[] args) {
		Employee1[] arr =  new Employee1[4];
		for(int i=0;i<4;i++) arr[i] = new Employee1();
		arr[1].display();
		arr[3].display();
		arr[0].display();
		System.out.println("Total number of object created::"+Employee1.count_obj+"\nTotal no of times display called::"+Employee1.count_display);

	}

}

class Employee1 {
	static int count_obj,count_display;
	Employee1() {
		count_obj++;
	}
	void display() {
		count_display++;
	}
}