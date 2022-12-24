package com.altun.Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Modulo operator for calculation Leap Year

        System.out.println("Welcome!");

        Scanner userInteraction = new Scanner(System.in);
        System.out.println("Enter a year: ");

        int year = 0;
        year = userInteraction.nextInt();

        boolean isLeapYear = year % 4 == 0;

        if (isLeapYear) {
            System.out.println("Year " + year + " is a leap year!");
        } else {
            System.out.println("Year " + year + " is not a leap year!");

        }
    }
}
