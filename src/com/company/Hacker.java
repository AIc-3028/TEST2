package com.company;

import java.util.Scanner;

public class Hacker {

    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();
        int myInt = scanner.nextInt();
        scanner.close();

        System.out.println("myString is: " + myString);
        System.out.println("myInt is: " + myInt);

        int n = 0;
        String s = Integer.toString(n);


    }

}
