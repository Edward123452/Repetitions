package com.example;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class End_of_file {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
        Your class should be named Solution. */
        try{
            Scanner sc = new Scanner(System.in);
            int i = 0;
            while ( sc.hasNextLine()){
                //i++;
                String s = sc.nextLine();
                if (s.isEmpty() ) sc.close();
                else System.out.println( ++i + " " + s);
            }
        }
        catch ( IllegalStateException e){

        }

    }

}
