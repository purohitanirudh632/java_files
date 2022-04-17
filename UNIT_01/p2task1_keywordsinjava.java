package UNIT_01;
public class p2task1_keywordsinjava {
    public static void main(String[] args) {
        final int gehu = 25;       // final here stands for constant in java
        System.out.println(gehu);

        // double int = 58;      // cannot add the name of a keyword as name of the variable
        // System.out.println(int); // cannot print the keywords
        double pi = 3.14;
        System.out.println(pi);
        /*
         * int new() { System.out.println("NEW FUNCtion"); }
         */
        xyz();
        // ABC int = new ABC();   // cannot add object name as keyword
        ABC obj = new ABC();      // creating the object
        obj.prop=52;
    }

    static void xyz() {
        System.out.println("xyz");

    }

    /*
     * class int{ void function() { System.out.println("Error he be"); } }
     */

}

class ABC {
    int prop;


}