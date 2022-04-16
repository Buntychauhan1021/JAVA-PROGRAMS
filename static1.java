package hellowworld;
    
    
class kk
    {
	private int age;
	private String name ;
	static String name1="jio";
	
	 
    kk(int age,String name)
    {
    	this.age=age;
    	this.name=name;
    }
    static void change() {
    	name1="keshav";
    }
    
    
    void display() 
    {
   	System.out.println(age+" "+name+" "+name1);
    }
    }

public class static1 
    {

	public static void main(String[] args) 
	{
		kk.change();
     kk s1= new kk(11,"guddaa");
     s1.display();
	}

    }
