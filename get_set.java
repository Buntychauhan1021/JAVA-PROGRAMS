package hellowworld;

class student
{
	private int id;
	private String name;
	
	public void setId(int i)
	{
		id=i;
	}
	public int getId()
	{
		return id;
	}
	
	public void setName(String n)
	{
		name=n;
	}
	public String getName()
	{
		return name;
	}
}

public class get_set {

	public static void main(String[] args) {
	student obj =new student();
	obj.setId(23);
	System.out.println(obj.getId());
	obj.setName("keshav");
	System.out.println(obj.getName());

	}

}
