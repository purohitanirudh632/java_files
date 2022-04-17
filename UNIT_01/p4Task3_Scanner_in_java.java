package UNIT_01;
import java.util.Scanner;

class p4Task3_Scanner_in_java {
 public static void main(String[] args) {
        System.out.println("here we are going to do some addition    :");
        int a= 25;
        int  b = 32;
        int c = a+b;
        System.out.println(c);
        boolean isadult ;
     System.out.println("enter your age please");
     Scanner myobj = new Scanner(System.in);
     int age;
     age = myobj.nextInt();

     if (age >= 18)
     {
         isadult =true;
     }
     else
         isadult=false;

     System.out.println("can this person vote : " + isadult);
 }
}
