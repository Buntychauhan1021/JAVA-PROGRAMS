package keshav1;

class bike {
	//final void run()
      void run() {//you can not override if you have given final keyword
		System.out.println("running");
	}
}

class hero extends bike
{
	void run()
	{
		super.run();
		System.out.println("running fast");
	}
}

public class finalmethod {

	public static void main(String[] args) {
		
		hero obj = new hero();
		obj.run();

	}

}
