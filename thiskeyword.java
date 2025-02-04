public class thiskeyword {
	
	String name; //class create pandrom
 
	
	thiskeyword()//constructor
	{
		System.out.println("enna daa");
	}
	
	void Setname(String name)//function
	{
		this.name = name;
	}
    
	
	
	
	public static void main(String args[])
	{
		thiskeyword bro = new thiskeyword();
		bro.Setname("kishore");
        
		System.out.println(bro.name);
	
	

	}
}