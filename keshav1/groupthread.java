package keshav1;
import java.lang.*;


class keshav111 implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
	  System.out.print("keshav");	
	}
	
}

public class groupthread {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		keshav111 obj = new keshav111();
		Thread a = new Thread(obj); 
		a.start();
	}

}
