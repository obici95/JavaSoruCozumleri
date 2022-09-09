package day01_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q015enBuyukVeEnkucukNumara {
    public static void main(String[] args) {
        /* TASK :
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve
    en kucuk olanlarini konsola yazdiriniz
    int num1
    int num2
    int num3
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 3 sayi giriniz!");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

       if (num1>num2 && num1>num3){
           System.out.println("En buyuk sayi :"+num1);
           if (num2>num3){
               System.out.println("En kucuk sayi :"+num3);
           }else {
               System.out.println("En kucuk sayi :"+num2);
           }
       } else if (num2>num1 && num2>num3) {
           System.out.println("En buyuk sayi :"+num2);
          if (num1>num3){
              System.out.println("En kucuk sayi :"+num3);
          } else {
              System.out.println("En kucuk sayi :"+num1);
          }
       } else if (num3>num1 && num3>num2) {
           System.out.println("En buyuk sayi :"+num3);
       }  if (num1>num2){
            System.out.println("En kucuk sayi :"+num2);
        } else {
            System.out.println("En kucuk sayi :"+num1);
        }
    }
}
