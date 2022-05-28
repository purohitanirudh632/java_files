package UNIT_01;
public class p5_Task01_Classes_and_objects {     //  only one public class in one java file
    public static void main(String[] args) {
        ABC2 obj = new ABC2();
        obj.display2();
        ABC2.display();   // called by class name because static keyword is not called by object
        System.out.println(ABC2.b);

    }
}
class ABC2{    // outer class
    int a =50;
     static int b = 10;
    static void display()
    {
        int b=10;
        b++;
        System.out.println(b);
    }
    void display2()
    {
        System.out.println(a);
        //As a was a local variable so we cannot acess it outside the methord
    }

    class Dummy{                     // inner class   // can be public  private or protected

    }
}