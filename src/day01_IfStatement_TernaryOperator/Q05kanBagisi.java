package day01_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q05kanBagisi {
    public static void main(String[] args) {
        /*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

        Scanner scan=new Scanner(System.in);
        System.out.println("Yasinizi giriniz");
        int yas=scan.nextInt();

        System.out.println("Kilonuzu giriniz");
        int kilo=scan.nextInt();

        if (yas<18){
            System.out.println("Kan bagisi yapamazsiniz");
        } else if (yas>18 && kilo<50) {
            System.out.println("Kan bagisi yapamazsiniz");
        } else if (yas>18 && kilo>50) {
            System.out.println("Kan bagisi yapabilirsiniz");
        }


    }
}
