package hellowworld;

class a1
{
	int x;
	void setx(int x) {
		this.x=x;
	}
	void getx() {
		System.out.println(x);
	}
}
class a2 extends a1
{
	int y;
	void sety(int y) {
		this.y=y;
	}
	void gety() {
		System.out.println(y);
	}
}
class a3 extends a1
{
	int z;
	void setz(int z) {
		this.z=z;
	}
	void getz() {
		System.out.println(z);
	}
}
class a4 extends a1
{
	int a;
	void seta(int a) {
		this.a=a;
	}
	void geta() {
		System.out.println(a);
	}
}

public class hierarchicalinhertance {

	public static void main(String[] args) {
		
		a2 obj1 = new a2();
		a3 obj2 = new a3();
		a4 obj3 = new a4();
		
		
		obj2.setx(11);
		obj2.getx(); 
		obj3.setx(12);
		obj3.getx();
		obj1.setx(13);
		obj1.getx();
		



	}

}
