package day01_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q08magazaIndirim {
    public static void main(String[] args) {
        /*
         * TASK :

         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
         * alirsa %10 indirim yapan code create ediniz.
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Kac adet urun alacaksiniz?");
        int urunAdedi=scan.nextInt();

        System.out.println("Aldiginiz urunun liste fiyatini giriniz");
        double fiyat=scan.nextDouble();
        double toplamFiyat;


        System.out.println("Musteri kartiniz var mi? Varsa Y Yoksa N tusuna basiniz");
        char mKarti=scan.next().charAt(0);

        if (mKarti=='y' || mKarti=='Y'){
            if (urunAdedi>10){
            fiyat*=0.8;
            toplamFiyat=fiyat*urunAdedi;
            System.out.println("%20 indirim kazandiniz.Toplam odemeniz gereken tutar :"+toplamFiyat);
            }else {
                fiyat*=0.85;
                toplamFiyat=urunAdedi*fiyat;
                System.out.println("%15 indirim hakki kazandiniz. Toplam odemeniz gereken miktar: "
                                + toplamFiyat);
            }
        } else if (mKarti=='n' || mKarti=='N'){
            if (urunAdedi>10){
                fiyat*=0.85;
                toplamFiyat=urunAdedi*fiyat;
                System.out.println("%15 indirim hakki kazandiniz. Toplam odemeniz gereken miktar: "
                        + toplamFiyat);
            }else {
                fiyat*=0.90;
                toplamFiyat=fiyat*urunAdedi;
                System.out.println("%10 indirim hakki kazandiniz. Toplam odemeniz gereken miktar: "
                        + toplamFiyat);
            }
        }else {
            System.out.println("Yanlis giris yaptiniz lutfen tekrar deneyiniz");
        }
    }
}
