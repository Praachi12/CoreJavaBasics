package com.perscholas.java_basics;

public class javaBasics_part2 {
    public static void main(String[] args) {
        //Program 5
        double num1 = 40.5;
        double num2 = 20.0;
        //Division two double numbers
        double division = num1 / num2;
        System.out.println("Division of two double numbers is: " + division);
        int typeCast = (int) division;
        System.out.println("Result in integer after Typecasting: " + typeCast );

        //Program 6
        int x= 5, y= 6;
        int q= y/x;
        System.out.println("Value of q: " + q);
       // q = (double) y  error : q is an int and we are assigning double value to it

        //Program 7
        //Declaring Constant
         final int length= 5;
         //Calculate area of a square
        int area = length* length;
        System.out.println("Area of a square is: "+ area);

        //Program 8 on Cafe
        String coffee;
        int coffeePrice = 20;
        String tea;
        int teaPrice = 10;
        String espresso;
        int espressoPrice = 30;
        int subTotal;
        double totalSale;
        subTotal = 3*coffeePrice + 4*teaPrice+ 2*espressoPrice;
        System.out.println("Order is 3 Coffee, 4 tea , 2 espresso. Total amount is : " + subTotal);

        //Program 9 Constant sales_tax
        final double salesTax= 0.05;
        totalSale = subTotal+ (salesTax*subTotal);
        System.out.println("Total sale is :" + totalSale);






    }

}
