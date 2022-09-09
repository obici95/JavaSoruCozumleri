package day01_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q18TernaryKucukBuyukHarf {
    public static void main(String[] args) {
         /*
        TASK :
         Kullanicidan bir character girmesini isteyiniz
         Character harf ise kucuk harf olup olmadigini kontrol ediniz
         Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
         Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
         Harf degilse ekrana "Harf degil" yazdiriniz
        97:a  122:z ascii değeri
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");

        char karakter=scan.next().charAt(0);

        String sonuc=karakter >='a' && karakter <='z' || karakter >='A' && karakter<='Z'
                     ?  karakter >='a' && karakter <='z' ? "Kucuk Harf" : "Buyuk Harf"

                     :"Harf degil";
        System.out.println(sonuc);
    }
}
