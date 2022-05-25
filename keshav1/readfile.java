//READFILE
package keshav1;
import java.io.*;
import java.util.Scanner;

public class readfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try
    {
    	File f =new File("C:\\Users\\acer\\Desktop\\FileOperationSystem.txt");
    
	  Scanner filereader = new Scanner(f);
    	while(filereader.hasNextLine())
    	{
    		String filedata=filereader.nextLine();
    		System.out.println(filedata);
    		}
      
    }
    catch(IOException e) {
    	System.out.println("error accured");
    	
    }
	}

}
