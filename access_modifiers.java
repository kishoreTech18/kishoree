//public
class teacher{
	private String name = "kishore";
	
	void display()
	{
		System.out.println(name);
	}
}
public class access2 {

	public static void main(String[] args) {
		//private
		teacher t1 = new teacher();
		t1.display();
		
		access1 ac = new access1();
		ac.displaysalary();

}

}
