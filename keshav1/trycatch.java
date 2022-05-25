package keshav1;

public class trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{  
			int a=20/0;
			System.out.println(a);
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
		}

	}

}
