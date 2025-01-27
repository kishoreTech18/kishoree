import java.util.Random;
public class whileloop{
    public static void main(String args[])
    {
       Random rand = new Random();
       int kishore = rand.nextInt();
       
       while(kishore!=15)
       {
        kishore = rand.nextInt(30);
        System.out.println(kishore);
       }
        
    }
}