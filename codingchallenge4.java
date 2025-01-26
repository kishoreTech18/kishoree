import java.util.Scanner;
public class codingchallenge4{          // array with for loop
    public static void main(String args[])
    {
        
        //Scanner scan = new Scanner(System.in);
        //int[] kishore = new int[5];
        
        //for(int i=0;i<=4;i=i+1)
        //{
        //    kishore[i] = scan.nextInt();
        //}
        ///////System.out.println(kishore[0]);
        //////System.out.println(kishore[1]);
        //////System.out.println(kishore[2]);
        //////System.out.println(kishore[3]);
        ///////System.out.println(kishore[4]);

       //for(int i=0;i<=4;i=i+1)
       //{
        //System.out.println(kishore[i]);
       //}
       //Scanner scan = new Scanner(System.in);
       

       //int[] kishore = new int[10];       //create tables
       //for(int i=1;i<=100;i=i+1)
       //{
       // System.out.println(i+"x5="+i*5);
       //}

       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();

       int[] easy = new int[size];

       for(int i=1;i<=size-1;i=i+1)
       {
        easy[i] = sc.nextInt();
       }
       // to find middle

       System.out.println("middle term is");
       System.out.println(easy[size/2]);

        

         
    }
}