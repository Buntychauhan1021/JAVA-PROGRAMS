package keshav1;
import java.io.FileInputStream;
import java.io.IOException;

public class bytewrite {

	public static void main(String[] args) throws IOException
	 {
		// TODO Auto-generated method stub
		int i;
		FileInputStream fin = new FileInputStream("C:\\Users\\acer\\Desktop\\FileOutputStream.txt");
       
				do
				{
					i=fin.read();
					if(i!=-1)
				System.out.print((char)i);
				}while(i!=-1);
				fin.close();
				
		}

}
