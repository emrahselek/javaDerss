package day01Example;

/*
Write a Java program that takes five numbers as input to calculate and print the average of the numbers.

Test Data:
Input first number: 10
Input second number: 20
Input third number: 30
Input fourth number: 40
Enter fifth number: 50
 */

import java.util.Scanner;

public class _03_Calculate_Print_Avarage {
    public static void main(String[] args) {
        double num = 0;
        double x = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number(n) your want to calculate the average : ");
        int n = sc.nextInt();
        while (x <= n){
            System.out.println("Input number " + "("+ (int)x + ")" + ":");
            //--> (int)x  x i doubledan int degere donusturmek icin kullaniyor. Kullanilmadi zaman input numver ( 1.0 )
            // olarak gorunmekte
            num += sc.nextInt();
            x += 1;
        }
        double avgn = (num / n );
        System.out.println("Average : " + avgn ) ;
    }
}
