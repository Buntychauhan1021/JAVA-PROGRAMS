package keshav;

import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		int a[]= new int[5];
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the number");
	 for(int i=0;i<=4;i++)
	 {
		 a[i]=sc.nextInt();
	 }
	
	 while(true){
		 System.out.println("1.maximum");
		 System.out.println("2.minimum");
		 System.out.println("3.print array");
		 System.out.println("4.ascending order");
		 System.out.println("5.descending order");
		 System.out.println("6.sum of all element");
		 System.out.println("7.array reverse");
		 System.out.println("8.delete element from array");
		 System.out.println("9.exit program");
		 System.out.println("enter the choice");
		 int n = sc.nextInt();
		 if(n==9)
		 {
			 break;
		 }
	 
	 switch(n)
	 {
	 case 1:
		 max(a);
		 break;
	 case 2:
		 min(a);
		 break;
	 case 3:
		 arrayprint(a);
		 break;
	 case 4:
		 ass(a);
		 break;
	 case 5:
		 des(a);
		 break;
	 case 6:
		 sum(a);
		 break;
	 case 7:
		 rev(a);
		 break;
	 case 8:
		 deleteelement(a);
		 break;
	default:
		System.out.println("enter the valid choice");
		break;
		 }
	 }

	}
	
	
	
	public static void deleteelement(int arr[])
	{   
		Scanner sc=new Scanner(System.in);
		System.out.println("enter index where you want to delete element");
		 
		int index=sc.nextInt();
		//int element=90;
		for(int i=index-1;i<4;i++)
		{
			arr[i]=arr[i+1];
		}
		for(int i=0;i<4;i++) {
		System.out.println(arr[i]);
	}
	}
	
	public static  void des(int arr[])
	{   int temp;
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

	public static  void ass(int arr[])
	{   int temp;
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
	public static  void min(int arr[]) {
		int min=arr[0];
		for(int i=0;i<5;i++)
		{
			
			   if(arr[i]<min) {
				   min=arr[i];
			   }
			
			
		}
		
			System.out.println(min);
		
		
	}
	public static  void sum(int arr[]) {
		int sum=0;
		for(int i=0;i<5;i++)
		{
			sum+=arr[i];
			
		}
		
			System.out.println("sum of all element "+sum);
		
		
	}
		
	
	public static  void arrayprint(int arr[]) {
		for(int i=0;i<5;i++)
		{
			
		System.out.println(arr[i]);
		}
		
	}
	
	public static  void rev(int arr[]) {
		for(int i=4;i>=0;i--)
		{
			
		System.out.println(arr[i]);
		}
		
	}
	public static  void max(int arr[]) {
		int max=arr[0];
		for(int i=0;i<5;i++)
		{
			
			   if(arr[i]>max) {
				   max=arr[i];
			   }
			
		}
		
			System.out.println(max);
		
		
	}
	}

	

