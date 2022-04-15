package hellowworld;

import java.util.Scanner;

public class search {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		int arr[] = new int[10];
	//	int arr[]= {11,22,44,11};
		int flag=0;
		
		System.out.println("enter the size of array");
		int n =sc.nextInt();
		for(int i=0;i<n;i++)
		{ 
			arr[i]=sc.nextInt();
		}
		
		System.out.println("enter the number you want to search");
		int no =sc.nextInt();
	    for(int i=0;i<n;i++)
	    {
	    	if(arr[i]==no)
	    	
	    	{	flag=1;
	    		break; 
	    }
	    	}
	    if(flag==1)
	    {
	    	System.out.println("number is found ");
	    }
	    else
	    {
	    	System.out.println("number is not found");
	    }
	}

}
