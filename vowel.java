import java.util.Scanner;
public class vowel{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a character");
        Character ch = sc.next().toLowerCase().charAt(0);

        if(!Character.isLetter(ch))
        {
            System.out.println("enter character is invalid...please enter a valid character");

        }
        else{
            if(ch =='a' || ch =='e' || ch=='i' || ch=='o' || ch=='u')
            {
                System.out.println(ch + " It is a vowel");
            }
            else{
                System.out.println(ch + " It is not a vowel");
            }
        }
    }
}
