//CREATEFILE

package keshav1;
import java.io.File;
import  java.io.IOException;

public class ceartefile {
	
	

	public static void main(String []args) {
		
		File fo = new File("C:\\Users\\acer\\Desktop\\FileOperationSystem.txt");
		try {  
			if(fo.createNewFile())
			{
				System.out.println("file" + fo.getName() + "is created successfullu");
				
			}
			else
			{
				
			}
		} catch (IOException e) {
			System.out.println("error accured");
			e.printStackTrace();
		}
      
		
}
}
