package com.perscholas.java_basics;

public class JavaBasics {
    public static void main(String[] args)
    {
        //Adding two integers
        int a=10,b=20;
        int sum = a+b;
        System.out.println("Sum of Integers is: " + sum);

        //Adding two double values
        double d= 2.3, e= 5.0;
        double sum_double= d+e;
        System.out.println("Sum of double numbers is: " + sum_double);

        //Adding integer and double variables
        int i = 20;
        double j= 30.0;
        double result = i + j;
        System.out.println("Sum of integer and double is: " + result);
        //Division of two integers
        int div = i/a;
        System.out.println("Division of two integers is: " + div);
        /*Division with large number as decimal
        int div2 = j/a
        we have to change data type of the div2 to double
         */
        double div2 = j/a;
        System.out.println("Division of one decimal and integer is: " + div2);

    }
}
