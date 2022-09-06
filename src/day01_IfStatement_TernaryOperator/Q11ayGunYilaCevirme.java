package day01_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q11ayGunYilaCevirme {
    public static void main(String[] args) {

         /* TASK :
        Kullanıcıdan bir tarihi gün, ay ve yıl şeklinde alıp bu tarihi
        ay, gün, yıl ve yıl, ay, gün sıralarına çevirerek yazan bir kod yazınız.



        Örnek Ekran Çıktısı
        Lütfen günü giriniz: 10
        Lütfen ayı giriniz: 02
        Lütfen yılı giriniz: 2009
        Gün ay yıl: 10.02.2009
        Ay gün yıl: 02.10.2009
        Yıl ay gün: 2009.02.10
        */

        Scanner scanner = new Scanner(System.in);

        int gun;
        int ay;
        int yil;


        System.out.println("Lütfen günü giriniz");
        gun=scanner.nextInt();

        if (gun>0 && gun<=31){
            System.out.println("gun = " + gun);
        }else {
            System.out.println("yanlis deger girdiniz, lutfen tekrar deneyiniz");
        }

        System.out.println("Lütfen ayı giriniz");
        ay=scanner.nextInt();
        if (ay>0 && ay<=12){
            System.out.println("ay = " + ay);
        }else {
            System.out.println("yanlis deger girdiniz, lutfen tekrar deneyiniz");
        }

        System.out.println("Lütfen yılı giriniz");
        yil= scanner.nextInt();
        if (yil>1950 && yil<=2022){
            System.out.println("yil = " + yil);
        }else {
            System.out.println("yanlis deger girdiniz, lutfen tekrar deneyiniz");
        }

        System.out.println("Gün ay yıl: "+gun+"."+ ay+"."+ yil);
        System.out.println("Ay gün yıl: "+ay+"."+gun+"."+yil);
        System.out.println("Yıl ay gün: "+yil+"."+ay+"."+gun);


    }
}
