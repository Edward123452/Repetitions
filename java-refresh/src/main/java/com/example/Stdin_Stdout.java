package com.example;

import java.util.Scanner;

public class Stdin_Stdout {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String newText = scanner.next();
        System.out.println( "New text is " + newText);

        int newNumber = scanner.nextInt();
        
        System.out.println( "New number is " + newNumber);
        scanner.close();
    }
}
