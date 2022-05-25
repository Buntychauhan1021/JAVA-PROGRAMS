package keshav1;

class xyz
{
	int i;
	int j;
	
	xyz()
	{
		System.out.println("hello i am constructor");
	}
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
	}
	
	@Override
	public String toString() {
		return "xyz [i=" + i + ", j=" + j + "]";
	}

}


public class clone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
