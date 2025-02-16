 /*class person{
	public String name;
	protected int age;
	private String socialsecuritynumber;
	String address;
	
}

class employee extends person{
	employee(String name,int age, String socialsecuritynumber,String address)
	{
		super(name,age,socialsecuritynumber,address);
		System.out.println("heello");
	}
}
public class codingchallenge6 {

	public static void main(String[] args) {
	employee emp = new employee("kishore",19,"xxx654","chennai");
	
	System.out.println(emp.name);
	System.out.println(emp.age);

	}

}*///question 1


/*class counter{
	static int count = 0;
	int instanceNumber = 0;
	
	counter()
	{
		count = count+1;
		instanceNumber = instanceNumber+1;
	}
	void display()
	{
		System.out.println(count);
		System.out.println(instanceNumber);
	}
}
public class mainclass{
	public static void mian(String args[])
	{
		counter co = new counter();
		counter co1 = new counter(); 
		co.display();
		co1.display();
		
		
	}
}*///question 2
/*final class constructvalues{
	void disp() {
		
	
	final double pi = 3.14;
}
}
class hello extends constructvalues{
	void display()
	{
		
	}
}
public class bro{
	public static void main(String args[])
	{
		
	}
	
}*///question 3


/*abstract class animal{
	String name;
	
	abstract void makesound();
	animal(String name)
	{
		this.name = name;
	}
	
}
class dog extends animal{
	dog(String name)
	{
		super(name);
	}
	void makesound()
	{
		System.out.println("bow bow");
	}
}

class cat extends animal{
	cat(String name)
	{
		super(name);
	}
	void makesound()
	{
		System.out.println("meow");
	}
}
public class test{
	public static void main(String args[])
	{
		cat c1 = new cat("pussy");
		c1.makesound();
		dog d1 = new dog("bobby");
		System.out.println(d1.name);
		System.out.println(c1.name);
		
	}
}*/ //question 4

abstract class vehicle{
	final void startengine()
	{
		System.out.println("engine started");
	}
	abstract void drive();
	


static String getvehicletype()
{
	return "engine started";
}

}
class car extends vehicle{
	void drive()
	{
		System.out.println("car is driven");
	}
	static String bro()
	{
		return " hello";
	}
}

class motorcycle extends vehicle{
	void drive()
	{
		System.out.println("motorcycle is going");
	}
}
public class codingchallenge6{
	public static void main(String args[])
	{
		motorcycle motor = new motorcycle();
		motor.drive();
		System.out.println(vehicle.getvehicletype());
		car c1 = new car();
		c1.drive();
		System.out.println(car.bro());
	}
}
 