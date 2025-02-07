import java.util.Scanner;
public class leap_year_chech{
public static void main(String[] args) {

    System.out.println("enter a year");
    Scanner sc = new Scanner(System.in);

    int year = sc.nextInt();

    if(year%4==0 || year%100!=0 || year%400==0)
    {
        System.out.println("this year is a leap year"+ year);
    }
    else{
        System.out.println("this is not a leap year");
    }
    

  }
}