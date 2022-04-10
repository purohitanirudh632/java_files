/*
- Normally an array is the collection of similar type of elements that are stored in contigious memorey location
- are of fixed size and cannot be resized

two types of array  are present
-single dimention
- multi dimention


*DECLEAR AN ARRAY IN JAVA

datatype array[];
or
datatype[] array;
or
datatype []array;


INITILIZATION
array = new datatype[size];
 */


import java.util.Scanner;

public  class p6Task01_arrays_in_java {
    public static void main(String[] args) {
        //DECLERATION
        int array1[];
        int[] array2;

        //INITILIZATION
         array1 = new int[6];
         array2 = new int [5];

        System.out.println("enter the values of the array");
        Scanner src = new Scanner(System.in);
         //Assigning the valuue to the array
        for(int i=0;i< array1.length;i++)
        array1[i] = src.nextInt();

        //THIS CAN ALSO BE DONE AS

      int array3[]= {1,2,3,4,5};

        //passing  array as a parameter
        arrayasparameter(array1);
        //passing anonymous array as a parameter
       // arrayasparameter(new int[] = {99,98,96,97});


        //RETURNING THE ARRAY
        int array5[] = arrayasreturntype();
        System.out.println(array5.toString());


        // MULTIDIMENTIONAL ARRAY IN JAVA
        int array6[][] = new int[3][3];
        int counter=0;

        for(int i=0,j=0;i<3 && j<3;i++,j++)
        {
            counter++;
            array6[i][j]= counter;
        }

        for(int i=0,j=0;i<3 && j<3;i++,j++)
        {
            System.out.println(array6[i][j]);
        }
    }


 static void arrayasparameter(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
        static int[] arrayasreturntype()
        {
           int array5[] = {22,23,24,25};

            return array5;
        }


}