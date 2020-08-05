package com.company;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1. Calculate the sum of the first 100 numbers higher than 0

        int i;
        int sum = 0;
        for (i = 0; i < 100; i++) {
            sum = sum + i;
        }

        System.out.println("EX1: The sum of first 100 numbers is: " + sum);

        //2.Display the smallest number from an array of numbers
        Minim.MinimMethod();

        //3.Display the max digit from a number
        MaxDigit.Digit();

        //4. Check if a number is a palindrome
        Palindrome.ReversedNumber();
        //5. Display all the prime numbers lower than a given number
        Prime.PrimeMethod();
    }


}

