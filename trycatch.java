import java.util.*;
public class trycatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		try {
		 a = sc.nextInt();
		 b = sc.nextInt();
		 c=0;
		
	      c = a/b;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("apditha adjust karo");
		}
		catch(InputMismatchException e)
		{
			System.out.println("input error");
		}
		
		System.out.println(c);
		System.out.println("program stopped");
	}

}