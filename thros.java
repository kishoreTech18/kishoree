public class thros {

	public static void main(String[] args) {
		try {
		int a = 10/2;
		throw new ArithmeticException("it is error");
		}
		catch(Exception e)
		{
			System.out.println("adjust karo" +" " + e);
		}
		
		
		System.out.println("program stopped");
	}

}