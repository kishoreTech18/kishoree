import java.util.Scanner;
public class switchcase{
    public static void main(String args[])
    {
        /*int number = 15;
        switch (number)
        {
            case 1:
            System.out.println("poda");
            break;

            case 2:
            System.out.println("vada");
            break;

            case 3:
            System.out.println("first class");
            break;
            
            default:
            System.out.println("vaipu illa");
        }*/

        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        switch(num)
        {
            case 1:
            System.out.println("hello");
            break;

            case 20:
            System.out.println("va da");
            break;

            default:
            System.out.println("yes");
        }
    }
}