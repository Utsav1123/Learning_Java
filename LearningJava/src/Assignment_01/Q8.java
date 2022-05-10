package Assignment_01;
import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of elements to be entered in array::");
		int n=sc.nextInt();
		sc.nextLine();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) arr[i] = sc.nextInt();
		System.out.print("Enter the index you want to delete::");
		sc.nextLine();
		int index = sc.nextInt();
		sc.close();
		sampleArray obj = new sampleArray();
		obj.delete(arr,index,n);
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) System.out.print(arr[i]+" ");
		}
	}
}

class sampleArray {
	void delete(int arr[],int index,int n) {
		for(int i=index;i<n-1;i++) arr[i]=arr[i+1];
		arr[n-1]=0;
	}
}