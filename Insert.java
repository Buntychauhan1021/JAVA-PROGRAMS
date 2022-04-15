package hellowworld;

import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int arr[]=new int[6];
	    int index=2;
	    int element =30;
	    int i;
	    for( i=0;i<=4;i++)
	    {
	    	arr[i]=sc.nextInt();	    
	    }
	    
	    for( i=4;i>=index-1;i--)
	    {
			arr[i+1]=arr[i];
	    }
	    arr[index]=element;
	   
	   
	    for( i=0;i<=6;i++)
	    {
	    System.out.println(arr[i]);
	    }
	    
}
}



