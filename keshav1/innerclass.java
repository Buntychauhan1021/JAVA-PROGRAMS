package keshav1;


class outer
{
	void color()
	{
		System.out.println("red");
	}
	//static class inner
	class inner
	{
		void if1()
		{
			System.out.println("hello keshav");
			
		}
	}
}

public class innerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//         outer obj=new outer();
//         outer.inner kk = obj.new inner(); 
//        // outer.inner obj=new outer.inner();
//        kk.if1();
		outer obj = new outer();
	    outer.inner kk =obj.new inner();
		kk.if1();
		
		
	}

}
