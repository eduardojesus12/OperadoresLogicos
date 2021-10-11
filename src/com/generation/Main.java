package com.generation;

public class Main {

    public static void main(String[] args) {
	    boolean x = true;
        boolean y = false;
        boolean z = true;

        System.out.println("a) " + ((x && y) || (x && z)) );
        System.out.println("b) " + ((x || !y)&& (!x || z)) );
        System.out.println("c) " + (x || y && z  ) );
        System.out.println("d) " + (!(x || y) && z ) );
        System.out.println("e) " + (x || y || x && !z && !y) );
        System.out.println("f) " + (!x || !y || z && x && !y) );

    }
}
