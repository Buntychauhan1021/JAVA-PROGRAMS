package keshav1;

import java.util.Scanner;

public class findgreatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the value of a");
        int a=sc.nextInt();		
        System.out.println("enter the value of b");
        int b=sc.nextInt();		
        System.out.println("enter the value of c");
        int c=sc.nextInt();	
        if(a>b&&a>c)
        {
        	System.out.println("greatest value is  " +a);
        }
        else if(b>c)
        {
        	System.out.println("greatest value is  " +b);
        }
        
        else
        {
        	System.out.println("greatest value is "+c);
        }
	}

}
