//class Animal{
	//String name;
	//int age;
	
	//void makesound()
	//{
	//	System.out.println("Animal makes sound");
	//}
//}

//class dog extends Animal{
	//String breed;
	
	//@Override
	//void makesound() {
	//	System.out.println("dog barks");
	//}
	
	//void fetch()
	//{
	//	System.out.println("dog is fetching");
	//}
//}

//class cat extends Animal{
	
	//String color;
	
	//@Override
	//void makesound() {
	//	System.out.println("cat meows");
	//}
	
	//void climb()
	//{
	//	System.out.println("cat is climbing");
	//}
	
	
	
 
	
//}
//public class mainclass {

	//public static void main(String[] args) {
		//Animal lion = new Animal();
		//lion.name = "elephant";
		//lion.age = 20;
		//lion.makesound();
		//System.out.println(lion.name);
		//System.out.println(lion.age);
		
		
		//dog lab = new dog();
		//lab.breed = "pomerian";
		//lab.fetch();
		//lab.makesound();
		//System.out.println(lab.breed);
		
		//cat lio = new cat();
		//lio.color = "white";
		//lio.makesound();
		//lio.climb();		
		//System.out.println(lio.color);
		//lio.age = 2;
		//lio.name = "alex";
		//System.out.println(lio.age);
		//System.out.println(lio.name);
	//}

//}

//homework
class vehicle{
	String brand;
	int year;

void startengine()
{
	System.out.println("engine starts");
}

}
class car extends vehicle{
	String fueltype;
	
	@Override
	void startengine() {
		System.out.println("car enginr stars");
	}
	void drive()
	{
		System.out.println("car is driving");
	}
}
class truck extends vehicle{
	int loadcapacity;
	
	@Override
	void startengine() {
		System.out.println("truck engine starts");
	}
	void haul()
	{
		System.out.println("truck is haulting");
	}
}



public class mainclass{
	
	public static void main(String args[])
	{
		truck lorry = new truck();
		lorry.loadcapacity = 56;
		System.out.println(lorry.loadcapacity);
		lorry.brand = "hero";
		System.out.println(lorry.brand);
		lorry.startengine();
		lorry.year = 232;
	}
}
