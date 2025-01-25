import java.util.Scanner;
public class ternaryoperator{
    public static void main(String args[])
    {

        //String result = true?"yes":"no";

        //System.out.println(result);

       // boolean rain = true;
        //String weather = rain?"take an umbrella":"enjoy the day";

        //System.out.println(weather);

       // String result = 5>20?"yes":"no";
        //System.out.println(result);

        //int a = 10;
        //int b = 20;

        //String result = a>b?"a is greater":"b is greater";
        //System.out.println(result);

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String result = a>b?"a is greater":"b is greater";

        System.out.println(result);
    }
}