package day01_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q07karakterAlma {
    public static void main(String[] args) {
        /* TASK :
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada
		   hatali giris seklinde code create ediniz
		 */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf=scan.next().charAt(0);

        if (harf>='a' && harf<='z' ){
            System.out.println(harf+": kucuk harf girdiniz");
        } else if ( harf>='A' && harf<='Z') {
            System.out.println(harf+": buyuk harf girdiniz");
        }else {
            System.out.println("Hatali giris");
        }
    }
}
