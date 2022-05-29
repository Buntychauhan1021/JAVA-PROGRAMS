package keshav1;
import java.io.*;

public class copyfile {

	public static void main(String[] args)
	{
// TODO Auto-generated method stub

FileInputStream out =null;
FileOutputStream in =null;
try
{   
	out= new FileInputStream("C:\\Users\\acer\\Desktop\\FileOperationSystem.txt");
	in = new FileOutputStream("C:\\Users\\acer\\Desktop\\copy.txt");
	 
String c;
while((c=in.read() )!=-1)
{
    out.write(c);
}
		System.out.println("copied successfully");
	}
		catch(IOException e)
		{
			
		}
	}

}
