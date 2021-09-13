/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 Andrew Hicks
 */

package com.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        int principal = input.nextInt();
        System.out.print("Enter the rate of interest: ");
        double interest = input.nextDouble();
        double rounded = interest / 100;
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        double total = principal * (1 + rounded*years);
        System.out.println("After " + years + " years at " + interest + "%, the investment will be worth $" + total + ".");
    }

}
