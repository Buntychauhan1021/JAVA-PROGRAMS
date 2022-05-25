package keshav1;
//import java.io.FileOutputStream;
import java.io.*;


public class byteread {

	public static void main(String[] args) 
	{
		
		try
		{
		 // TODO Auto-generated method stub
		FileOutputStream fout = new FileOutputStream("C:\\Users\\acer\\Desktop\\FileOutputStream.txt");
		int i;
		String s="hello java";
		char ch[]=s.toCharArray();
		for(i=0;i<=s.length();i++)
		fout.write(ch[i]);
		fout.close();
		}
		catch(IOException e)
		{
			System.out.println("error accured");
		}
		

	}

}
