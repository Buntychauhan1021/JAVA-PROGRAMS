package keshav1;

interface aa
{
	void add(int a,int b);
}
interface bb
{
	void mul(int a,int b);
}

class c implements bb,aa
{
	int c;
	public void mul(int a,int b)
	{
		c=a*b;
	}
    public void add(int a,int b)
	{
		c=a+b;
	}
}
class d extends c
{
	void display()
	{
		System.out.println(c);
	}
}

public class interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		d kk = new d();
		kk.add(11, 17);
		kk.display();

	}

}
