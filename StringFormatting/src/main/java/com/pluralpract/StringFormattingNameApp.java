package com.pluralpract;
import java.util.Scanner;

public class StringFormattingNameApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //name variables
        String firstName;
        String middleName;
        String lastName;
        String suffix;

        //prompt user for name
        System.out.println("Enter your name.");
        String userName = scan.nextLine();

        //splits name into mulitple parts based on space
        String[] nameParts = userName.split(" ");

        //prompts user to answer if they have a suffix
        System.out.println("Do you have a suffix? (y/n)");
        String userChoice = scan.nextLine();

        //condition that checks if user has suffix in name
        if(userChoice.equals("y")) {
            System.out.println("What is your suffix");
            suffix = scan.nextLine();
            //determine if middle name is included based on length
            if(nameParts.length < 3) {
                firstName = nameParts[0];
                lastName = nameParts[1];
                System.out.println(lastName + ", " + firstName + " "+ suffix);
            } else {
                firstName = nameParts[0];
                middleName = nameParts[1];
                lastName = nameParts[2];
                System.out.println(lastName + ", " + firstName + " " + middleName + " " + suffix);
            }
        } else {
            if (nameParts.length < 3) {
                firstName = nameParts[0];
                lastName = nameParts[1];
                System.out.println(lastName + ", " + firstName);
            } else {
                firstName = nameParts[0];
                middleName = nameParts[1];
                lastName = nameParts[2];
                System.out.println(lastName + ", " + firstName + " " + middleName);
            }
        }

    }
}
