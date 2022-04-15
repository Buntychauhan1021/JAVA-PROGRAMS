package hellowworld;

class nakul
{
	private int age;
	private String name ;
	static String company="jio";
	
	nakul(int age,String name){
		this.age=age;
		this.name=name;
	}
	static void change() {
		company="mukul";
	
	}
	void display() {
		System.out.println(age+" "+name+" "+company);
	}
}

public class static2 {
         public static void main(String [] args)
         {  
        	 nakul.change();
        	 nakul s1=new nakul(11,"monti");
        	 s1.display();
         }
}
