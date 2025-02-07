import java.util.Scanner;
public class number_belongings{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int num1 = sc.nextInt();
        

        if(num1>50)
        {
            System.out.println("this is belong to 50 group");
        }
        else if(num1>=40 && num1<=50)
        {
            System.out.println("this belongs to 40 and 50");
        }
        else{
            System.out.println("the number is less than 40");
        }
    }
}