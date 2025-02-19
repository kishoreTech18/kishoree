/*interface animal{
	void name();
	int mark = 20;
}
class dog implements animal{
  public void name() {
	  System.out.println("lemon");
	  
		
	}
}
public class interface_ {

	public static void main(String[] args) {
		dog d1 = new dog();
		d1.name();
		System.out.println(d1.mark);
	}

}*/
interface playable{
	void play();
}

class piano implements playable{

	@Override
	public void play() {
		System.out.println("play piano");
		
	}
	
}

class guitar implements playable{

	@Override
	public void play() {
		System.out.println("play guitar");
		
	}
	
}
public class main{
	public static void main(String args[])
	{
		guitar g1 = new guitar();
		g1.play();
		piano p1 = new piano();
		p1.play();
	}
	
}
