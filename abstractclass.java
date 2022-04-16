package hellowworld;

abstract class bike
{   
	void keshav() {
		System.out.println("hello");
	}
	
	abstract void run(); 
		
	
}

abstract class honda2 extends bike {
	
	void run1() {
		System.out.println("this is run 1");
	}
}
class honda extends honda2{
	
	void run() {
		System.out.println("this is run");
	}
}

public class abstractclass {

	public static void main(String[] args) {
		
		honda obj =new honda();
		obj.run();
        obj.run1();
        obj.keshav();

}
}
