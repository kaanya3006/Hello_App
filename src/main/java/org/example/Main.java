package org.example;
import java.util.Scanner;
public class Main {

    public static void main(String args[]) {

        // UC6
        Scanner sc = new Scanner(System.in);
        System.out.println("How many names?");
        int count = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.println("Enter name:");
            String name1 = sc.nextLine();
            System.out.println("Hello " + name1);
        }
    }
}