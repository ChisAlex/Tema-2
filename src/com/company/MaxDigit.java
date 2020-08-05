//3.Display the max digit from a number.

package com.company;
import java.util.Scanner;
public class MaxDigit {

    public static void Digit() {

        Scanner nr = new Scanner(System.in);
        System.out.println("Ex3: Enter a number: ");
        int number = nr.nextInt();

        int result = 0;

        if (number > 0) {
            int max = Integer.MIN_VALUE;
            while (number > 0) {
                int digit = number % 10;
                max = Math.max(max, digit);
                number /= 10;
            }
            result = max;
        }
        System.out.println("The maximum value in your number is: " + result);
    }
}
