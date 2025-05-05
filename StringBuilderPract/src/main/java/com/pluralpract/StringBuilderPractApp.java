package com.pluralpract;

import java.util.Scanner;

public class StringBuilderPractApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder carBrands = new StringBuilder();

        System.out.println("Enter 3 car Brands");
        System.out.print("Enter first car brand: ");
        String firstCar = scan.nextLine();
        System.out.print("Enter second car brand: ");
        String secondCar = scan.nextLine();
        System.out.print("Enter third car brand: ");
        String thirdCar = scan.nextLine();

        carBrands.append(firstCar);
        carBrands.append(" ");
        carBrands.append(secondCar);
        carBrands.append(" ");
        carBrands.append(thirdCar);

        String brandName = carBrands.toString();
        System.out.println(brandName);

    }
}
