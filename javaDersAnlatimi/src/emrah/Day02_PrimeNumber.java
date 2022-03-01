package emrah;

import java.util.Scanner;

public class Day02_PrimeNumber {

        public static void main(String[] args) {
            int number = 10;
            primeNumber(number);

            //prime Number
            Scanner scan = new Scanner(System.in);
            System.out.println("enter a positive number");
            int mynumber= scan.nextInt();
            int mycount=0;
            for(int i=2; i<mynumber; i++){
                if(mynumber % i == 0){
                    mycount++;
                }
            }

            if(mynumber<=0){
                System.out.println("opsss Sorry Man. Try again later:D");
            }else if(mynumber==1){
                System.out.println("prime number");
            }else if(mycount==0){
                System.out.println("prime number");
            }else{
                System.out.println("NOT Prime number");
            }


        }
        public static void primeNumber (int number){
            int count = 0;
            if(number > 0 ){
                if (number == 1){
                    System.out.println(number + " is prime number");
                }else {
                    for (int i = 2; i < number; i++) {
                        if (number % i ==0){
                            count++;
                        }
                    }
                }
                if (count==0){
                    System.out.println(number + " is prime");
                }else {
                    System.out.println(number + " is not prime");
                }
            }else  {
                System.out.println("enter a positive integer");
            }
        }
    }

