package emrah;

import java.util.Scanner;

public class Day02_PrimeNumber_Method {

    public static void main(String[] args) {

        int boom=scanMan();
        primeNumber(boom);
    }

    public static int scanMan() {
        Scanner scan = new Scanner(System.in);
        System.out.println("go on");
        int user = scan.nextInt();
        return user;
    }

    public static void primeNumber(int mynumber ){
        int mycount = 0;
        for (int i = 2; i < mynumber; i++) {
            if (mynumber % i == 0) {
                mycount++;
            }
        }

        if (mynumber <= 0) {
            System.out.println("no way");
        } else if (mynumber == 1 || mycount == 0) {
            System.out.println("prime number");
        } else {
            System.out.println("not prime number");
        }
    }

}