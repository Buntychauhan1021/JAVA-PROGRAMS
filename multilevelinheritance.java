package hellowworld;

class a
{
	int x;
	void setx(int x)
	{
		this.x=x;
	}
	void getx() {
		System.out.println(x);
	}
}

class b extends a{
	
	int y;
	void sety(int y)
	{
		this.y=y;
	}
	void gety() {
		System.out.println(y);
	}
}

  class c extends b{
	  int z;
	  void setz(int z) {
		  this.z=z;
	  }
	  void getz() {
		  System.out.println(z);
	  }
	  
  }

public class multilevelinheritance {
    public static void main(String []aregs)
    {
    	c obj=new c();
    	obj.setx(11);
    	obj.getx();
    	obj.sety(12);
    	obj.gety();
    	obj.setz(13);
    	obj.getz();
    }
}
