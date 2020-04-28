package com.company;

import java.util.ArrayList;
import java.util.List;

public class Scope {

    int x = 3;


    public void myMethod(){

        int outer = 0;

        if ( outer == 0){

            int inner = 33;

            System.out.println(inner);

        }

//        System.out.println(inner);

    }

    public static void main(String[] args) {

        System.out.println(Integer.MAX_VALUE);

        List<Integer> theList = new ArrayList<>();
        theList.add(3);
        theList.add(6);
        theList.add(9);
        theList.add(10);

        int n = theList.get(2);

        System.out.println(theList);

    }
}
