package day01_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q17Ternary {
    public static void main(String[] args) {


         /*
        TASK :
       Kullanicidan bir sayi aliniz
       Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
       10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
       Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");

        int sayi= scan.nextInt();

        String sonuc=sayi >= 0 ? sayi <10 ? "Rakam" : "Pozitif Sayi"
                     :  "Negatif Sayi";

        System.out.println(sonuc);
    }









}
