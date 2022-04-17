package UNIT_01;
/*

variables in java are like the data cotainers that store the data values during the java program execution
* => Types of java variables

LOCAL VARIABLES : decleared inside the body of methord

INSTANCE VARIABLES : they are decleared without the static keyword and are decleared outside the main methord
                       they are object specific known as the instance variable

STATIC VARIABLLES : these are the variables that are defined by the static keyword
                    static keyword are defined only once at the start of the program execution
                    the static variables should be initilised first before the decleration of any other variable



 */

  public class p3Task1_variables_and_datatypes_in_java {

    static  int q= 11;
    int p= 10;

    public static void main(String[] args) {

        // variable decleration
        int a, b, c;
        float pi;
        double d;
        char e;

        //valid initialization

        pi = 3.14f;
        d = 23.67392;
        e = 'v';

        a = 10;
        b = 10;
        c = 10;

        System.out.println(pi);
        System.out.println(d);
        System.out.println(e);


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        boolean bool = true;

        System.out.println(bool);

        // java variable type conversion and type casting

        double f;
        int i = 10;
        f = i; // type conversion

        double g = 10;
        int j ;
        j = (int) g; // type casting

        System.out.println(f);
        System.out.println(i);
        System.out.println(g);
        System.out.println(j);

        byte k = 10; // 1 byte
        boolean l = true;   // 1 bit   true or false only
        float n = 12.2f;
        long m = 10L;
        double o = 1.2d;

        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);

        //
        System.out.println(ANI.j);   // data + functions/methords
        // ABC. display();

        ANI obj1 = new ANI();
        System.out.println(obj1.i++);
        System.out.println(obj1.i);

        ANI obj2 = new ANI();
        System.out.println(obj2.i);
//        System.out.println(obj1.j);
//        System.out.println(obj1.j++);
//        System.out.println(obj2.j);
        System.out.println(ANI.j++);
        System.out.println(ANI.j);

        ANI.typeconversionandtypecasting();
    }

    int r=10;
    void display()
    {
        int a =5;
        System.out.println("this is display methord");
        System.out.println(a);
    }

}

 class  ANI {
    static int  j= 10;
    int i = 10;

      static void display()
      {
          int a =5;  //local variable
          System.out.println("this is display methord");
          System.out.println(a);
      }

    static  void typeconversionandtypecasting()
    {


        /*
        * dobule f //  8 bytes = 64 bits/slots int i =10 // 4 bytes  = 32 bits(slots)
         */

        double f ;//64 slots
        int i =10; // 32 slots
        f= i; // type conversion
        System.out.println(f);


        double g=10; // 64
        int j; // 32
        j = (int)g; // type casting

        // 32 bits = 64 bits

        System.out.println(i);
        System.out.println(j);
    }

}