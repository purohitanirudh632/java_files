package UNIT_02;

public class p8_task01_inheritence_in_java {

    public static void main(String[] args) {
        Three g = new Three();
        g.methodOne();
        g.methodTwo();
        g.methodOne();
        g.methodThree();

        Two two = new Two(1);
        D.obj = new D(2);
        obj.methodFour();
    }
}
class One {
    int a ;

    One(int x){
        System.out.println("one constructor");
    }

    public void methodOne()
    {
        System.out.println("first method");
    }
}

class  Two extends One {
    int b;
    Two(int x){
        super(3);
        b=x;
        System.out.println("two");

    }

    public void methodTwo(){
        System.out.println("second methord");
    }
}

class Three extends Two{
    int c;
    Three()
    {
        super(1);
        System.out.println("three constructor");
    }
    Three(int x){
        super(1);
        c=x;
        System.out.println("three");
    }

    public void methodThree()
    {
        System.out.println("second methoord");
    }
}

class  A
{
    int a;
}