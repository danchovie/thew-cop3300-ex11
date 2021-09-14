/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Thew
 */
package com.ex10;

import java.util.Scanner;

import java.lang.Math;

public class Main {

    public static void main(String[] args) {
	    Scanner newScanner = new Scanner(System.in);
        int euros;
        double ex_rate, dollars;
        System.out.print("How many euros are you exchanging? ");
        euros = newScanner.nextInt();
        System.out.print("What is the exchange rate? ");
        ex_rate = newScanner.nextDouble();
        dollars = ((int)(((ex_rate*euros)*100)+0.5))/100.00;
        System.out.printf("%d euros at an exchange rate of %.4f is\n%.2f U.S. dollars.", euros, ex_rate, dollars);
    }
}
