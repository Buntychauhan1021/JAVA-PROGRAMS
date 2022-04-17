package keshav1;

//import java.util.Scanner;

public class methodoverloading {
//	
//	static void change(int arr[]) {
//		
//		arr[0]=22;
	
	static void keshav() {
		System.out.println("hello india");
		
	}
	static void keshav(int a) {
		System.out.println("hello india = "+a);
		
	}
	static void keshav(int a,int b) {
		System.out.println("hello india = "+a+" "+b);
		
	}
public static void main(String [] args) {
	
//	int n;
//	Scanner sc = new Scanner(System.in);
//	n=sc.nextInt();
//	int marks[]= new int[n];
//	for(int i=0;i<n;i++) {
//		marks[i]=sc.nextInt();
//		}
//	for(int i=0;i<n;i++) {
//	//change(marks);
//	System.out.println(marks[i]);
//}
	
	methodoverloading.keshav();
	methodoverloading.keshav(2);
	methodoverloading.keshav(2,3);
}
}
