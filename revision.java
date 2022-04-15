package hellowworld;

class bunty
{
	private int id;
	private int age;
	private String name;
	
	public void setid(int id)
	{
		this.id=id;
	}
	public int getid() {
		return id;
		
	}
	
	public void setage(int age) {
		this.age=age;
	}
	public int getage() {
		return age;
	}
	public String getname() {
		return name;
	}
	public bunty(int id,int age,String name) {
	  this.id=id;
		this.age=age;
		this.name=name;
	}
}


public class revision {
       
	 public static void main(String[] args) {
		
     bunty obj=new bunty(12,11,"keshav"); 
     obj.setage(16);
     System.out.println(obj.getage());
     obj.setid(19);
     System.out.println(obj.getid());
     System.out.println(obj.getname());
     
	}

}
