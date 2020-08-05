//2.Display the smallest number from an array of numbers

package com.company;
import java.util.Scanner;
public class Minim {

    public int min(int [] array){
        int min = array[0];

        for (int i = 0; i < array.length; i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }

    public static void MinimMethod(){
        Scanner sc = new Scanner(System.in);
        System.out.println("EX2: Enter the size of the array that you want to create: ");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        System.out.println("Enter the elements of the array: ");

        for(int i = 0; i<size; i++){
            myArray[i] = sc.nextInt();
        }
        Minim m = new Minim();
        System.out.println("Ex2: Minimum value in your array is: " + m.min(myArray));
    }


}

