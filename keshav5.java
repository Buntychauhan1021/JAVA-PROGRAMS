package hellowworld;

class room
{
	int roomno;
	String roomtype;
	float roomarea;
	String acmachine;
	
	void roomno(int roomno,String roomtype,float roomarea,String acmachine)
	{
	
		this.roomno=roomno;
		this.roomtype=roomtype;
		this.roomarea=roomarea;
		this.acmachine=acmachine;
	}
	
	void display() {
		System.out.println("the roomno is ="+roomno+"\nroom type is="+roomtype+"\nroomarea is="+roomarea+"\nacmachine is="+acmachine);     
	}
	
}

public class keshav5 {

	public static void main(String[] args) {
		room s1=new room();
		s1.roomno(78,"normal",23.5f,"yes");
		s1.display();
		
	}

}
