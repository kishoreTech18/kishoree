import java.util.Scanner;
public class codingchallenge2{
    public static void main(String args[])
    {
       //int score = 75;
       //if(score<50)
       //{
       // System.out.println("you need to improve");
       //}
      // else if(score>=50 && score<=70)
      // {
       // System.out.println("good job");
       //}
       //else if(score>70)
       //{
       // System.out.println("excellent performance");
       //}
       //int maths = 60;
       //int english = 79;
       //int science = 89;
       //int social = 88;
       //int tamil = 99;

       //int total = (maths+english+science+social+tamil/5);
       //System.out.println(total/10);

       //if(total>35)
       //{
       // System.out.println("additional class is required");
       //}
       //else{
       // System.out.println("you are good to go");
       //}
       //Scanner burma = new Scanner(System.in);
       //int s1 = burma.nextInt();
      // int s2 = burma.nextInt();
       //int s3 = burma.nextInt();
      // int s4 = burma.nextInt();
      // int s5 = burma.nextInt();

       //int totalmark = (s1+s2+s3+s4+s5);

       //int average = totalmark/5;

       //if(average<35)
       //{
       // System.out.println("additional classes are required");
       //}
       //else{
       // System.out.println("you are good to go");
       //}
       //Scanner kishore = new Scanner(System.in);
       //String colour = kishore.nextLine();

       //if(colour.equals("red"))
       //{
       // System.out.println("stop");
       //}
      // else if(colour.equals("yellow"))
      // {
      //  System.out.println("get ready");
      // }
      // else if(colour.equals("green"))
       //{
       // System.out.println("goo");
       //}
       Scanner mama = new Scanner(System.in);
       int salary = mama.nextInt();
       int age = mama.nextInt();

       if(salary>=20000 || age<=25)
       {
        System.out.println("loan eligible");
        int loan = mama.nextInt();

        if(loan<=50000)
        {
            System.out.println("loan available");
        }
        else{
            System.out.println("not available");
        }
       }
       else{
        System.out.println("not eligible");
       }      
    
    }
}