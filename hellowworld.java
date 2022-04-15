package hellowworld;

import java.util.Scanner;

public class hellowworld {

	public static void main(String[] args) {
	 
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
         int a=sc.nextInt();
         System.out.println("enter the second number");
         int b=sc.nextInt();
         c=a+b;
         System.out.println("The sum is  "+c);
       }
}
