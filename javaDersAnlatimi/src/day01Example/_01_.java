package day01Example;

import java.util.Scanner;

public class _01_ {
    //Write a Java program that takes a number as input and prints its multiplication table upto 10.
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter number : ");
        int num1 = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(num1 + " x " + (i+1) + " = " + (num1 * (i+1)));

        }
        /*
        Please enter number :
        8
        8 x 1 = 8
        8 x 2 = 16
        8 x 3 = 24
        8 x 4 = 32
        8 x 5 = 40
        8 x 6 = 48
        8 x 7 = 56
        8 x 8 = 64
        8 x 9 = 72
        8 x 10 = 80
         */
    }
}
