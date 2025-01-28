//public class classandobject{
    //int a = 10;
    //int b = 20;
    //public static void main(String args[])
    //{
    //    classandobject thala = new classandobject();
     //   System.out.println(thala.a);

     //   classandobject thalapathy = new classandobject();
     //   System.out.println(thalapathy.b);
    //}
///}



    public class startup{
        String name = "";
        String place = "";
        int salary = 0;
        int stiphen = 0;
        
        public static void main(String args[])
        {

        
        startup thala = new startup(); // creating an object for a class

        thala.name = "kishore info tech";
        thala.place = "chennai";
        thala.salary = 10000;
        thala.stiphen = 2000;

        System.out.println(thala.place);

        startup thalapathy = new startup();

        thalapathy.name = "kk";
        thalapathy.salary = 3400;
        thalapathy.place = "ambur";

    System.out.println(thalapathy.place);

    startup bot = new startup();

    System.out.println(bot.salary);
    }
}