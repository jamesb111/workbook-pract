package com.pluralpract;
import java.util.Scanner;

public class StringParsingApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter comma separated list");
        String people = scan.nextLine();
        String[] peopList = people.split(",");

        System.out.println("Only select people with Specific prefix. (Sir, Mr, Mrs or none)");
        String prefixPick = scan.nextLine();

        for(String s : peopList) {
            if(s.contains(prefixPick)) {
                System.out.println(s);
            } else if(prefixPick.equals("none")) {
                System.out.println(s);
            }
        }

    }
}
