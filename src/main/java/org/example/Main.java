package org.example;

public class Main {

    public static void main(String args[]) {

        // UC4
        if(args.length > 0) {
            for(int i = 0; i < args.length; i++) {
                System.out.println("Hello " + args[i]);
            }
        }
    }
}