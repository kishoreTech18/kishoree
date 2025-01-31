public class method{

    void addition(int a , int b)
    {
        System.out.println(a+b);
    }

    void addition(int a ,int b,int c)
    {
        System.out.println(a+b+c);
    }
    public static void main(String args[])
    {
        method sum = new method();
        sum.addition(10,20);
        sum.addition(10,20,40);


    }
}