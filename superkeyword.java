/*class laptop{
	laptop(String name)
	{
		System.out.println(name);
	}
}

class mobile extends laptop{
	mobile()
	{
		super("samsung");
		System.out.println("oppo");
	}
}
public class superkeyword{
	public static void main(String args[])
	{
		mobile mob = new mobile();
		
	
	}
}*/

/*class animal{
	int age = 32;
	animal(String name)
	{
		System.out.println(name);
	}

void makesound()
{
	System.out.println("animal makes sound");
}
}

class dog extends animal{
	dog()
	{
		super("lion");
		super.makesound();
		System.out.println("dog is barking");
		System.out.println(super.age);
	}
}


public class superkeyword{
	public static void main(String args[])
	{
		dog d1 = new dog();
	}
}*/
class person{
	String name;
	
	person(String name)
	{
		this.name = name;
	}
}

class employee extends person{
	
	
	employee(String name)
	{
		super(name);
	}
}

public class superkeyword{
	public static void main(String args[])
	{
		employee e1 = new employee("hello");
	}
}

