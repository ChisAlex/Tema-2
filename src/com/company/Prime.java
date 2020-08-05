package com.company;
import java.util.Scanner;
public class Prime {
    public static void PrimeMethod() {


        int j;
        int n;
        Scanner nr = new Scanner (System.in);
        System.out.println("Ex5: Enter n: ");
        int number = nr.nextInt();

        for (j = 2; j <= number; j++) {
            if (isPrime(j))
                System.out.println(j);
        }
    }

    private static boolean isPrime(int m) {

        for (int i = 2; i < m; i++) {
            if (m % i == 0)
                return false;
        }
        return true;
    }
}


