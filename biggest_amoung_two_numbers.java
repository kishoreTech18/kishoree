import java.util.Scanner;
public class biggest_amoung_two_numbers{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first number");
        int num1 = sc.nextInt();

        System.out.println("enter the second number");    
        int num2 = sc.nextInt();

        /*if(num1>num2)
        {
            System.out.println("The biggest number is " + num1);
        }
        else{
            System.out.println("The biggest number is " + num2);
        }*/
        
        int biggest = (num1> num2)? num1:num2;
        System.out.println("The biggest number is" + biggest);    
    }   
}