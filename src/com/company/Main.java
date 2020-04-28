package com.company;

public class Main {

    // this down here is our main method
    // this is considered our "entry point" for our application
    // this is also considered a "main thread"
    public static void main(String[] args) {
        System.out.println("HELLO WORLD");
        System.out.println("Help");
    //boolean, true or false
// char, characters // byte
//short
//int
//long
//float
//double

// this will be flagged as a compile error


// this works, but the value of b will be 13 due to truncation
        byte b = (byte)1293;
System.out.println(b);
        int smallInt = 120;   //int is 4 bytes
        int biggerInt = 550;  //int is 4 bytes

//downcasting 4 bytes into 1 byte
        byte b1= (byte)smallInt;  //value in both will be 120
        byte b2= (byte)biggerInt; //value out of range, will be truncated

//downcasting 4 bytes into 2 bytes
        short s1= (short)biggerInt;   //value in range, no truncation }
        boolean isCounted = false;     // or true, NEVER a numeric value.
        char answer = 'Y';             // 'Y' as the explicit character value
        char middleInitialC = 0x0043;  // 'C'as a hexidecimal
        char capitalK = 75;            // 'K' as an integer value }
        System.out.println(capitalK);
        long BigLong = 230L;          // long (l, L)
        double someDbl = 392.2d;      // double (d, D)
            double wishfulSalary = 123_000_100_325.0d; // stored/printed as 123000100325.0
        int x = 5;
        int y = 10;
        int z = 11;
        boolean fun = true;
        boolean done = false;
        System.out.println(x++); //prints 5
        System.out.println(x);   //prints 5
        System.out.println(++x); //prints 6
    }
}