package keshav1;

class keshavv
{
	
	int area;
	int height;
	int width;
	
	keshavv(int height ,int width)
	{
		this.height=height;
		this.width=width;
		}
	void display()
	{
		area=height*width;
		System.out.println(area);
		
	}
	
}

public class revision {

	public static void main(String[] args) {
		
		keshavv obj=new keshavv(3,3);
		obj.display();

	}

}
