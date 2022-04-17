package UNIT_01;
public class p6task2_string_in_java {
    public static void main(String[] args) {


    }
}
class string_in_java{

    void stringDefination()
    {
        //how to declear
        String s = "hello world";
        String s1 = new String("Anirudh is anirudh");

        System.out.println(s);
        //System.out.println(s1);

        for(int i=0;i<s.length();i++)
        {
            System.out.println(s.charAt(i));  // to go at the pirticular pogition of the string
        }

        String first= "Anirudh";
        String second = "purohit";

        String third = first + second;
        System.out.println(third);
    }
}