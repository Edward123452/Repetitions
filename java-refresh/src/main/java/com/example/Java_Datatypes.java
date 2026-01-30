package com.example;

import java.math.BigInteger;
import java.util.*;
import java.io.*;



class Java_Datatypes{
    public static void main(String []argh) {



        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);
        int t=sc.nextInt();


        for(int i=0;i<t;i++) {

            try {
                /*String s = sc.next();
                BigInteger x = new BigInteger( s );
                System.out.println ( x + " can be fitted in:");
                if ( x.compareTo ( BigInteger.valueOf ( Byte.MIN_VALUE )) >= 0 && x.compareTo ( BigInteger.valueOf ( Byte.MAX_VALUE)) <= 0 ) System.out.println ("* byte");
                if ( x.compareTo ( BigInteger.valueOf ( Short.MIN_VALUE )) >= 0 && x.compareTo ( BigInteger.valueOf ( Short.MAX_VALUE ))  <= 0 ) System.out.println ("* short");
                if ( x.compareTo ( BigInteger.valueOf ( Integer.MIN_VALUE )) >= 0 && x.compareTo ( BigInteger.valueOf ( Integer.MAX_VALUE)) <= 0 ) System.out.println("* int");
                if ( x.compareTo ( BigInteger.valueOf ( Long.MIN_VALUE)) >= 0 && x.compareTo ( BigInteger.valueOf (Long.MAX_VALUE)) <= 0 ) System.out.println("* long");
                це другий працюючий варіант */

                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                if ( x >=-32768 &&  x <= 32767)System.out.println("* short");
                if ( x >=Integer.MIN_VALUE &&  x <= Integer.MAX_VALUE)System.out.println("* int");
                if ( x >=Long.MIN_VALUE &&  x <= Long.MAX_VALUE)System.out.println("* long");
                /*цей вариант повністтю пройшов на хакерренк */


            }
            catch(Exception e){
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}




//public class Java_Datatypes {}
