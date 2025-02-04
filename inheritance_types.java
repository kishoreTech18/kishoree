//single inheritance




//class cat{
	//void eat()
	//{
	//	System.out.println("cat can eat");
	//}
//}

//class dog extends cat{
//	void bark()
//	{
//		System.out.println("dog is barking");
//	}
//}

// double inheritance



//class A{
	//int a = 1;
//}
//class B extends A{
//	int b = 2;
//}

//class C extends B{
	//int c = 3;
//}

//hierarchical


//class animal{
	//void eat()
	//{
	//	System.out.println("this can eat");
	//}
//}

//class dog extends animal{
	//void bark()
	//{
		//System.out.println("dog can bark");
	//}
//}

//class cat extends dog{
	//void meow()
	//{
	//	System.out.println("cat can meow");
	//}
//}

//hybrid

class animal{
	void eat()
	{
		System.out.println("thisb can eat");
	}
}

class dog extends animal{
	void bark()
	{
		System.out.println("dog eats");
	}
}		

class cat extends animal{
	void meow()
	{
		System.out.println("cats meow");
	}
}

class puppy extends dog{
	void cry()
	{
		System.out.println("puppy cries");
	}
}


public class inheritance_types {

	public static void main(String[] args) {
		//single
		
		//dog lab = new dog();
		//lab.bark();
		//lab.eat();
		
		//double
		
		//C cl = new C();
		//System.out.println(cl.c);
		//System.out.println(cl.a);

        //hierarchical
		
		//cat ca = new cat();
		//ca.meow();
		//ca.eat();
		//ca.bark();
		
		//hybrid
		
		puppy pup = new puppy();
		pup.cry();
		pup.eat();
		pup.bark();

	
		
		
		
		

	

	}
}
