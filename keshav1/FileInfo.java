//FILEINFORMATIO
package keshav1;
import java.io.File;


public class FileInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       File fo = new File("C:\\Users\\acer\\Desktop\\FileOperationSystem.txt");
		
       if(fo.exists())
		
       {
    	   System.out.println("the file name "+fo.getName());
    	   System.out.println("is file reaable "+fo.canRead());
    	   System.out.println("is file writeable "+fo.canWrite());
    	   System.out.println("The absolute path of the file is: "+fo.getAbsolutePath());
    	   
       }
		
	}

}
