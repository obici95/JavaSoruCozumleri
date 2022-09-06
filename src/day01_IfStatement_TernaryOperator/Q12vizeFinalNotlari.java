package day01_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q12vizeFinalNotlari {
    public static void main(String[] args) {
           /*
        TASK :
        Kullanıcıdan vize ve final notlarını alınız.
        Kullanıcın istediği oranlarda vize ve final yüzdeleri not ile not ortalamasını hesaplayıp
        not ortalamasını yazdırıp 50 ve büyük ise "Tebrikler dersi başarı ile geçtiniz..." küçük ise
        "Malesef dersten kaldınız..." yazdırınız
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("vize notunuzu giriniz");
        double vize= scan.nextDouble();

        System.out.println("final notunuzu giriniz");
        double final1= scan.nextDouble();

        System.out.println("Vize yuzdesi kac olsun?");
        double vizeYuzde= scan.nextDouble();
        System.out.println("Final yuzdesi kac olsun?");
        double finalYuzde= scan.nextDouble();

        double ortalama=(vize*vizeYuzde/100)+(final1*finalYuzde/100);
        if (ortalama>=50){
            System.out.println("Tebrikler dersi başarı ile geçtiniz");
        }else {
            System.out.println("Malesef dersten kaldınız");
        }
        System.out.println("Not ortalamaniz :"+ortalama);
    }
}
