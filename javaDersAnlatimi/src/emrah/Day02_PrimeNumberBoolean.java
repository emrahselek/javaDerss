package emrah;

import java.util.Scanner;

public class Day02_PrimeNumberBoolean {

    //prime number

    public static void main(String[] args){

        int emrah=scano();
        boolean opopo=primeNumberMn(emrah);

        System.out.println(opopo);

    }

    public static int scano(){
        Scanner scannn=new Scanner(System.in);
        System.out.println("gir loo");
        int user = scannn.nextInt();
        return user;
    }

    public static boolean primeNumberMn(int number){
        int count=0;
        boolean sonuc=true;
        for(int i=2; i<number; i++){
            if(number % i ==0){
                count++;
            }
        }
        if(number<=0){
            sonuc=false;
        }else if(number==1 || count==0){
            sonuc=true;
        }else{
            sonuc=false;
        }

        return sonuc;

    }

}
