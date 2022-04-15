package hellowworld;

class copy
{
	private int age;
	private String name;
	
	
    copy(int age,String name){
    	this.age=age;
    	this.name=name;
    }
    
    copy(copy a){
    	age=a.age;
    	name=a.name;
    }
    
     void display() {
    	System.out.println(age+" "+" "+name);
    }
}

public class copyconstructor {
    
	public static void main(String[] args) {
		
		copy s1 = new copy(12,"chauhan");
		copy s2 = new copy(s1);
		s1.display();
		s2.display();
	}
}
