package day01_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        /*  TASK :
	 *  Kullanicidan 3 tene pozitif  tam sayi alniz.
	 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz

	    INFO :
	     üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
		 a+b>c>a-b
		 a+c>b>a-c
	     b+c>a>b-c
		a=b=c ise es kenar ucgen

	 */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ucgen olusturmak icin 3 adet sayi giriniz");

        int a= scan.nextInt();
        int b= scan.nextInt();
        int c= scan.nextInt();



        if (a+b>c||a-b<c || a+c>b|| a-c<b|| b+c>a||b-c<a) {
            if (a == b && a == c && c == b) {
                System.out.println("Eskenar ucgendir");
            } else {
                System.out.println("Ucgendir fakat eskenar degildir");
            }
        } else {
            System.out.println("Ucgen degildir");
        }



    }
}
