package UNIT_01;
public class p5_Task01_Classes_and_objects {
    public static void main(String[] args) {
        ABC2 obj = new ABC2();
        obj.display2();
        ABC2.display();
    }
}
class ABC2{
    int a =10;
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
}