package keshav1;
import java.io.*;
import java.util.Scanner;
public class revision1 
{
	public static void main() throws IOException
{
		File fo = new File("");
		if(fo.createNewFile())
		{
			System.out.println(fo.getName())    ;
		}
		
	}
}
