package hellowworld;

import java.util.Scanner;

public class Delete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[5];
		int i;
		int index=2;
		for(i=0;i<=4;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=index-1;i<4;i++)
		{
			arr[i]=arr[i+1];
		}
		for(i=0;i<4;i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}
