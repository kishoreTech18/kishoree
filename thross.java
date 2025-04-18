class display{ 
	void disp() throws Exception
			{
		int a = 10/0;
	}
	
}
public class thross {

	public static void main(String[] args) {
		display d1 = new display();
		try {
		d1.disp();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("shut up");
	}

}
