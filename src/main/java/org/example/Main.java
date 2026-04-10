package org.example;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String args[]) {

        // UC7
        Scanner sc = new Scanner(System.in);


        ArrayList<String> names = new ArrayList<String>();

        System.out.println("How many names do you want to store?");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter name:");
            String name2 = sc.nextLine();
            names.add(name2);
        }

        System.out.println("Names stored in memory:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}