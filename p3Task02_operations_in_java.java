public class p3Task02_operations_in_java {

    public static void main(String[] args) {
        operationsInJava obj = new operationsInJava();
        obj.UnaryOperator();
        obj.Airthmaticoperator();
        obj.shift_operation();
        obj.relational_operator();

    }
}

class  operationsInJava {

    void UnaryOperator ()
    {
        int a=10;
        boolean b = false;
        System.out.println("Inside unary operator");
        System.out.println(a++); //10
        System.out.println(a--); //11
        System.out.println(++a); //11
        System.out.println(--a); //10

        System.out.println(~a);
    }

    void Airthmaticoperator() {
        System.out.println("inside the airthmatic operator");
        int a=10;
        int b=5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a*b);
        System.out.println(a%b);

        // what is the output opf this operation
        System.out.println(((10*10)/5) + 3 - ((1*4)/2));
        System.out.println("\n");
    }


    /*
      right shift operator
        0 0 1 0 0 0 0(16>>1)
        0 0 0 1 0 0 0 (8>>1)
        0 0 0 0 1 0 0 (4>>1)
        0 0 0 0 0 1 0(2>>1)
        0 0 0 0 0 0 1
       64,32,16,8,4,2,1

       LEFT SHIFT OPERATOR
        0 0 0 1 0 (2<<1)
        0 0 1 0 0(4<<2)
        1 0 0 0 0 16

     */
    void shift_operation()
    {
        System.out.println(10<< 2);  //10 * 2^2 = 10* 4 = 40
        System.out.println(10 << 3); // 10 * 2^3 = 10 * 8 =80
        System.out.println(20 << 2); // 20 * 2^2 = 80
        System.out.println(15 << 4); // 15 * 2^4  = 15 * 16 = 240


        System.out.println( 16 >>1); // 8
        System.out.println(8>>1) ;// 4
        System.out.println(4 >> 2);//1

    }

    void relational_operator()
    {
        System.out.println("inside the relational operator");

        int a = 10;
        int b = 23;

        System.out.println(a==b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a!=b);

    }

}

