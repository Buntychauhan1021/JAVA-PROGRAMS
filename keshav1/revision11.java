package keshav1;

class a11
{
	private int id;
	private String name;
	public void setid(int id)
	{
		this.id=id;
	}
	
	public int getid()
	{
		return id;
	}
	public void setname( String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
	
	
}

public class revision11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           a11 obj = new a11();
           obj.setid(11);
           System.out.println(obj.getid());
           obj.setname("keshav");
           System.out.println(obj.getname());
	}

}
