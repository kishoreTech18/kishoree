import java.util.*;
public class finaly {

	public static void main(String[] args) {
		
		String s = null;
		try {
		int str = s.length();
		System.out.println(str);
		}
		
		catch(NullPointerException e)
		{
			System.out.println("thappu bro");
		}
		finally {
			System.out.println("hii");
		}
		System.out.println("stop");
		
	}

}