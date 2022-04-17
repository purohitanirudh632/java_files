package UNIT_01;
public class p5_task02_methords_in_java {
    public static void main(String[] args) {

        ABC3 obj = new ABC3();
        obj.display();
        System.out.println(obj.a);
    }
}
class ABC3{
    static  int a = 10;
 static void display() {
     int b = 10;
     int a = 12;
     System.out.println(b);
     System.out.println(a);

 }
     int display2()
     {
         System.out.println(a);

       // As a is the local object so we cannot acess it outside the methord
         return a;
     }
 }
