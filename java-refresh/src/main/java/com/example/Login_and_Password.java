package com.example;

import java.util.Scanner;

public class Login_and_Password {
public static void main ( String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть логін");
        String newText = scanner.next();

        while( newText.length() < 6){// перевірка на кількість введених символів
            System.out.println("Введіть логін");
            newText = scanner.next();
        }
       /*if (newText.length() > 6){ // після другої неправильної спроби программа завершується
            System.out.println( "New text is " + newText);
        }else{
            System.out.println("Введіть логін");
            newText = scanner.next();
        }*/

    }
}
