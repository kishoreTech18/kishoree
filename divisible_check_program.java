import java.util.Scanner;
public class divisible_check_program{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
       

        if(num %3 == 0 && num% 4 == 0)
        {
            System.out.println("Good morning");
        }
        else if(num %3 ==0)
        {
            System.out.println("Good afternoon");
        }
        else if(num%3==0)
        {
            System.out.println("Good evening");
        }
        else{
            System.out.println("good night");
        }
    }
}