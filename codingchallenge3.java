//import java.util.Scanner;
public class codingchallenge3{
    public static void main(String args[])
    {
        //Scanner kishore = new Scanner(System.in);
        //int a = kishore.nextInt();
        //int b = kishore.nextInt();

        //for(int i=a;i<=b;i=i+1)
        //{
         //   System.out.println(i);
        //}
        //for(int i =1;i<=10;i=i+1)
        //{
        //    System.out.println(i);
        //}
       

        //for(int i=1;i<=100;i=i+1)
        //if(i%2==0)
        //{
         //   System.out.println(i);
        //}
        //int count = 0;
        //for(int i =1;i<=100;i=i+1)
        //if(i%2==0)
        //{
            //count=count+1;
            //System.out.println(i);
            //System.out.println(count);
        //}
        //System.out.println(count);
        //else{
            //System.out.println(count);
        //}
        //System.out.println(count);
        int count = 0;
        for(int i =1;i<=100;i=i+1)
        if(i%3==0 && i%5==0)
        count = count+1;
        {
            //System.out.println(i);
        }
        System.out.println(count);
    }
}