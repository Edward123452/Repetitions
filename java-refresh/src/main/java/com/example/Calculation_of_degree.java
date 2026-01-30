package com.example;

public class Calculation_of_degree {
    public static void main ( String[] args){
        int number = 2;
        int degree = 31;
        long number2 = (long)Math.pow(2,31)-1;
        long result = (long) Math.pow (number, degree);
        System.out.printf( "%.0f", result );
        //if ( result < number2) System.out.println ( "result меньше введенного числа" );
        //else if ( result > number2) System.out.println ("result больше введенного числа");
        //else System.out.println (" Числа равны ");
    }
}
