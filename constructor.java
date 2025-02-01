public class constructor {
	int marks;
	String name;
	
	constructor()
	{
		System.out.println("hello");
	}

	public static void main(String[] args) {
		constructor kishore = new constructor();
		constructor kumar = new constructor();
		
		System.out.println(kishore.name);
		System.out.println(kishore.marks);
		
		
	}

}