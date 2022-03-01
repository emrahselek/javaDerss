package emrah;

import java.util.Scanner;

public class WorkSheetMan {

public static void main(String[] args) {

    //prime Number
    Scanner scan = new Scanner(System.in);
    System.out.println("enter a positive number");
    int number= scan.nextInt();
    int count=0;
    for(int i=2; i<number; i++){
        if(number % i == 0){
            count++;
        }
    }

    if(number<=0){
        System.out.println("opsss Sorry Man. Try again later:D");
    }else if(number==1){
        System.out.println("prime number");
    }else if(count==0){
        System.out.println("prime number");
    }else{
        System.out.println("NOT Prime number");
    }


}
}
