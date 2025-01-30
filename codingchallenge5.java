//import java.util.Scanner;
//public class codingchallenge5{
    //void oddoreven(int num)
    //{
       // if(num%2==0)
       // {
       //     System.out.println("even");
       // }
       // else{
       //     System.out.println("odd");
       // }

   // }
   // public static void main(String args[])
    //{
    //    Scanner sc = new Scanner(System.in);
     //   int num = sc.nextInt();
     //   codingchallenge5 kishore = new codingchallenge5();
     //   kishore.oddoreven(num);

    //}
//}
import java.util.Scanner;
public class codingchallenge5{
    String passorfail(int mark)
    {
        if(mark<35)
        {
            return "fail";
        }
        else{
            return "pass";
        }


    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        codingchallenge5 kishore = new codingchallenge5();
        String total = kishore.passorfail(num);
        System.out.println(total);

    }
}