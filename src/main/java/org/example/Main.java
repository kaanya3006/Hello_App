package org.example;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String args[]) {

        // UC8
        ArrayList<String> names = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name to remove:");
        String removeName = sc.nextLine();
        names.remove(removeName);
        System.out.println("Updated names:");
        for(int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

    }
}