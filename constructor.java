package hellowworld;


class keshav {
	private int age;
    private	String  name;

	public void setid(int i) {
		age=i;
	}
	public int  getid() {
		return age;
	}
	
	public void setname(String n)
	{
		name =n;
	}
	public String getname() {
		 return name;
	}
	
	public keshav (){
		age=90;
	    name="keshav";
	}
}


public class constructor {
	  public static void main(String[] args) {
        
      keshav obj=new keshav(); 
      
      System.out.println(obj.getid());
      System.out.println(obj.getname());
       obj.setid(78);
       System.out.println(obj.getid());
      
       obj.setname("bunty");
       System.out.println(obj.getname());
        
	}
 }
