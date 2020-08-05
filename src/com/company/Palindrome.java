//4. Check if a number is palindrome
package com.company;
import java.util.Scanner;
public class Palindrome {

    public static void ReversedNumber (){

        Scanner nr = new Scanner(System.in);
        System.out.println("Ex3: Write a number to see if it's a palindrome: ");
        int num = nr.nextInt();
        int reversedInteger = 0, remainder, originalInteger;

        originalInteger = num;

        // reversed integer is stored in variable
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }

        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");
    }
}


