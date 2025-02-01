public class constructoroverloading{
	
	//int marks;
	//String name;
	
	//constructoroverloading()
	//{
	//	System.out.println("empty ");
	//}
	
	//constructoroverloading(int a)
	//{
	//	System.out.println(a);
	//	System.out.println("hello");
	//}
	
	
	int marks;
	String name;
	
	constructoroverloading(int a , String b)
	{
		marks = a;
		name = b;
	}
	
	
	public static void main(String[] args) {
		//constructoroverloading kishore = new constructoroverloading(22);
		//constructoroverloading kumar = new constructoroverloading();
		
		constructoroverloading kk = new constructoroverloading(33,"kishore");
		constructoroverloading pk = new constructoroverloading(99,"kishore kumar");
		System.out.println(pk.name);
		System.out.println(pk.marks);
	
		
		
		
		

	}

}
