package UNIT_01;
    /*
- It is called when an instance of the class is created
- At the time of calling the constructor, memory for the object is allocated in the memory
- It is a special type of method which is used to initialize the object
- Every time an object is created using the new() keyword, at least one constructor is called
-  construtor has no return type
- Two types of Constructors in Java
	- Parameterized Constructor
	- Default Constructor
 * */



    public class p5Task3_construtors_in_java  {

        public static void main(String[] args) {

            ABC4 obj = new ABC4();
            ABC4 obj2 = new ABC4(77);
            System.out.println(obj.a);
            System.out.println(obj2.a);
            obj.display();
            obj2.display2();


        }

    }


    class ABC4 {

        int a;


	/*
	 ClassName(Constructor Parameters){
	 	All the class and Instance variables can be initialized here!
	 }
	 */

        /*
        ABC4()    // default construtor
        {
        }
         */
        ABC4(){
            a = 10;
        }


        ABC4(int a ){
            this.a = a;
        }


        void display() {

            int b = 10;

            System.out.println(a);
            System.out.println(b);

        }

        int display2() {

            System.out.println(a);
            //As a was a local variable so we can not access it outside the method
            //System.out.println(b);

            return a;

        }
    }


