package keshav1;

interface  drawable 
{
	
	void draw();
}
class circle implements drawable
{
	public void draw() {
		System.out.println("hello circle");
	}
}
class rectangle implements drawable
{
	public void draw() {
		System.out.println("hello rectangle");
	}
}


public class interface1 {

	public static void main(String[] args) {
	rectangle obj =new rectangle();
	circle ob2 =new circle();
	obj.draw();
	ob2.draw();
	}
	}


