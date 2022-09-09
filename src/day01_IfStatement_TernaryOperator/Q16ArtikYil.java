package day01_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q16ArtikYil {
    // TASK:
    // Kullanıcının girdiği yılın artık yıl olup olmadığını kontrol eden code create ediniz.
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yil giriniz");
        int yil=scan.nextInt();

        if (yil %100 == 0 && yil %400 ==0){
            System.out.println("Girdiginiz "+yil + " yili artik yildir.");
        } else if (yil%100 !=0 && yil %4==0) {
            System.out.println("Girdiginiz "+yil + " yili artik yildir.");
        }else {
            System.out.println("Girdiginiz "+yil + " yili artik yil degildir.");
        }

        System.out.println("--- ternary cozumu---");

        String sonuc=yil %100 ==0 ? yil %400 ==0 ? "Artik yil " : "Artik yil degildir"
                : yil %4==0 ? "Artik yil" : "Artik yil degil" ;
        System.out.println(sonuc);

    }
}
