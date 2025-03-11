import java.util.Scanner;
public class quizproject{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        System.out.println("welcome to java quiz");

        System.out.println("1) Which is the keyword in java");

        System.out.println("a)interface");
        System.out.println("b)super");
        System.out.println("c)extends");
        System.out.println("d)implements");

        System.out.println("enter your answer");
       String answer1 = scan.nextLine();
       if(answer1.equalsIgnoreCase("b"))
       {
        score++;
       }

       System.out.println("2)java is a _______ language");

       System.out.println("a)interpreter");
       System.out.println("b)compiler");
       System.out.println("c)both");
       System.out.println("d)none of these");

       System.out.println("enter your answer");
       String answer2 = scan.nextLine();

       if(answer2.equalsIgnoreCase("c"))
       {
        score++;
       }

       System.out.println("3)what is the size of the integer");

       System.out.println("a)8");
       System.out.println("b)12");
       System.out.println("c)32");
       System.out.println("d)64");

       System.out.println("enter your answer");
       String answer3 = scan.nextLine();
       if(answer3.equalsIgnoreCase("c"))
       {
        score++;
       }

       System.out.println("quiz completed");

       System.out.println("your score is " + " " +score);

       if(score==3)
       {
        System.out.println("excellent");
       }
       else if (score==2){
        System.out.println("good");
           
       }
       else{
        System.out.println("better luck next time");
       }

    }
}