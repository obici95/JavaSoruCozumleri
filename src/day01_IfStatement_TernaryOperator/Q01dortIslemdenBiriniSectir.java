package day01_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q01dortIslemdenBiriniSectir {
    public static void main(String[] args) {
        /* TASK :
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  dort islemden biri ile isleme koyup sonucunu yazdiriniz
         */

            Scanner scan=new Scanner(System.in);
            System.out.println("Lutfen 2 adet sayi giriniz");

           double num1=scan.nextDouble();
           double num2= scan.nextDouble();

           System.out.println("toplama icin 1\ncikarma icin 2\ncarpma icin 3\nbolme icin 4");

           int islem = scan.nextInt();

           if (islem==1){
               System.out.println("num1+num2 = " + (num1 + num2));
           }else if (islem==2) {
               System.out.println("num1-num2 = " + (num1 - num2));
           } else if (islem==3) {
               System.out.println("num1*num2 = " + (num1 * num2));
           }else if (islem==4){
               System.out.println("num1/num2 = " + num1 / num2);
           }else{
               System.out.println("Lutfen gecerli sayilari girin");
           }
    }
}
