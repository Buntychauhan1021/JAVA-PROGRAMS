package hellowworld;

import java.util.Scanner;

class info {
	
int age;

public void  input() {
	Scanner sc =new Scanner(System.in);
	age=sc.nextInt();
} 
    public void display() {
		
		System.out.println(age);
	}
}

public class Basic {

	public static void main(String[] args) {
		info obj =new info();
		System.out.println("enter the number\n");
		
		obj.input();
		obj.display();
		
		

	}

}
