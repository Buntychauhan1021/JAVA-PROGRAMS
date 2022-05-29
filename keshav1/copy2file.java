package keshav1;
import java.io.*;
public class copy2file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//File f = new File("C:\\Users\\acer\\Desktop\\FileOperationSystem.txt");
    FileInputStream fin =null;
    FileOutputStream fout = null;
    
    fin =new FileInputStream("C:\\Users\\acer\\Desktop\\FileOperationSystem.txt");
    fout = new FileOutputStream("C:\\Users\\acer\\Desktop\\copy1.txt");
    
  int s;
    while((s=fin.read())!=-1)
    {
	fout.write(s);
    	
    }
    System.out.println("file copied successfully");
    fin.close();
    fout.close();
	}

}
