package org.example;

public class Main {

    public static void main(String args[]) {

        // UC3
        if(args.length == 0) {
            System.out.println("Hello User");
        } else {
            System.out.println("Hello " + args[0]);
        }
    }
}