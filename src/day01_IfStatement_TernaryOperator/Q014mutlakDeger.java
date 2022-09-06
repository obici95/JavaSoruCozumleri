package day01_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q014mutlakDeger {

    public static void main(String[] args) {

        /*
		  TASK :
		  Kullanici tarafindan girilen bir sayinin
		  mutlak degerini yazdiran code create ediniz.
		 */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz = ");
        int sayi = scan.nextInt();


        if (sayi<0){
            sayi*=-1;
        }
        System.out.println("girdiginiz sayinin mutlak degeri :"+sayi);
    }
}
