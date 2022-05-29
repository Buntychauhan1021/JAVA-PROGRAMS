package keshav1;
import java.io.*;

public class copyfile {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{
File f =new File("C:\\Users\\acer\\Desktop\\copy.txt");

FileInputStream in =null;
FileOutputStream out =null;

int content;
while((content=in.read() )!=-1)
{
	out.write(content);
}
		
	}
		catch(IOException e)
		{
			
		}
	}

}
