import java.util.Scanner;
 class hello{
    public static void main(String args[])
    {
        Scanner kk = new Scanner(System.in);
        String name = kk.nextLine();
        Double score = kk.nextDouble();
        kk.nextLine();
        String department = kk.nextLine();

        System.out.println("my name is "+name);
        System.out.println("my score is"+score);
        System.out.println("my department is"+department);

    }
}
