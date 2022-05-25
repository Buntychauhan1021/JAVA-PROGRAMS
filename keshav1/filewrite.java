//FILEWRITE

package keshav1;

import java.io.*;

public class filewrite {

	public static void main(String[] args) {
		try {
		
			
		FileWriter fwrite = new FileWriter("C:\\Users\\acer\\Desktop\\FileOperationSystem.txt");
		fwrite.write("hello keshav");
		fwrite.close();
		}
		catch(IOException e)
		{
			System.out.println("error accured");
		}
		}
	}


